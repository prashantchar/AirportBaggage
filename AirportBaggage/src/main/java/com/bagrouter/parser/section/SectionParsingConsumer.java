/**
 * 
 */
package com.bagrouter.parser.section;

import com.bagrouter.parser.ParseException;

/**
 * @author prashant
 *
 */
public interface SectionParsingConsumer <T extends SectionEntry> {
	
	void accept( T data ) throws ParseException;
}
