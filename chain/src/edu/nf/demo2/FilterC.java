package edu.nf.demo2;

@FilterAnno(value = "filterC",index = 2)
public class FilterC implements Filter{
    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {
        System.out.println("FilterC 处理请求...");
        chain.doExecute(request,response);
    }
}
