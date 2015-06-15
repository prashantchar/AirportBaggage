package com.bagrouter.route.exception;

import com.bagrouter.route.exception.RoutingException;

public class SearchRouteException extends RoutingException {

	public SearchRouteException( String message ) { super(message); }
	public SearchRouteException( String message, Throwable t ) { super(message, t); }
}
