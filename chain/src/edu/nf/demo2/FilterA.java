package edu.nf.demo2;

@FilterAnno(value = "filterA",index = 0)
public class FilterA implements Filter{
    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {
        System.out.println("FilterA 处理请求...");
        //FilterChain放行，将request和response转到下一个过滤器中
        chain.doExecute(request,response);
    }
}
