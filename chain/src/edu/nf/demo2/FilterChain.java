package edu.nf.demo2;

import java.util.*;

public class FilterChain {

    private Iterator<Filter> iterator;

    /**
     * 在构造方法中初始化所有的过滤器，并存入集合中
     */
    public FilterChain(){
        List<Filter> filters=initFilter();
//        Filter filterA=new FilterA();
//        Filter filterB=new FilterB();
//        Filter filterC=new FilterC();
//        filters.add(filterA);
//        filters.add(filterB);
//        filters.add(filterC);
        //从集合中获取迭代器
        iterator=filters.iterator();
    }

    private List<Filter> initFilter(){
        Set<String> classNames=ScanUtils.scanPackage();
        List<Filter> filters=new ArrayList<>();
        for (String classname:classNames){
            try {
                Class<?> clazz= Class.forName(classname);
                if(clazz.isAnnotationPresent(FilterAnno.class)){
                    Object obj=clazz.newInstance();
                    filters.add((Filter)obj);
//                    FilterAnno anno=clazz.getAnnotation(FilterAnno.class);
//                    int n=anno.index();
//                    if(n>filters.size()){
//                        for(int size=filters.size();filters.size()<= n;size++){
//                            filters.add(null);
//                        }
//                    }
//                    filters.set(n ,(Filter)obj);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        sort(filters);
        return filters;
    }

    private void sort(List<Filter> list){
        Collections.sort(list, (o1, o2) -> {
            Integer index1=o1.getClass().getAnnotation(FilterAnno.class).index();
            Integer index2=o2.getClass().getAnnotation(FilterAnno.class).index();
            return index1.compareTo(index2);
        });
    }

    public void doExecute(HttpServletRequest req,HttpServletResponse resp){
        //放行的操作
        if(iterator.hasNext()){
            //取出下一个过滤器
            Filter filter=iterator.next();
            //执行filter的doFilter方法处理请求
            //注意每一个过滤器都需要用到FilterChain这个对象，
            //因此，doFilter方法的this就是将当前对象(FilterChain)传递给过滤器
            filter.doFilter(req,resp,this);
        }
    }
}
