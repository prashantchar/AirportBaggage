/**
 * 
 */
package com.bagrouter.parser;

/**
 * @author prashant
 * Generic Parsing Exception
 */
public class ParseException extends Exception {

	public ParseException( String message ) { super( message ); }
	public ParseException( String message, Throwable t ) { super( message, t ); }

}
