package edu.nf.demo2;

@FilterAnno(value = "filterB",index = 1)
public class FilterB implements Filter{
    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {
        System.out.println("FilterB 处理请求...");
        chain.doExecute(request,response);
    }
}
