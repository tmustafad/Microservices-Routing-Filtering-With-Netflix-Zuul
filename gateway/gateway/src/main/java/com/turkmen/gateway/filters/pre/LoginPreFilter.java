/**
 * 
 */
package com.turkmen.gateway.filters.pre;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author TTTDEMIRCI
 *
 */
public class LoginPreFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(LoginPreFilter.class);

	@Override
	public Object run() throws ZuulException {

		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();

		logger.info("incoming request is captured by filter : " + request.getMethod() + " - "
				+ request.getRequestURI().toString());
		return null;

	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
