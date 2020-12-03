package edu.nf.demo2;

public interface Filter {

    /**
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param chain 整个过滤链维护者，它提供一个doExecute方法，将请求放行，然后找出下一个过滤器，继续处理请求
     */
    void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain);
}
