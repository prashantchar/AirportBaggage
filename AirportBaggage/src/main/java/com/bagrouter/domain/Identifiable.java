/**
 * 
 */
package com.bagrouter.domain;

/**
 * @author prashant
 * @param <T>
 * An object that implements this should have an ID
 */
public interface Identifiable<T> {
	
	T getId();

}
