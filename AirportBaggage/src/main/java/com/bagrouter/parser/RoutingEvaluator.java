/**
 * 
 */
package com.bagrouter.parser;

import com.bagrouter.parser.ParseException;
import com.bagrouter.parser.RoutingInput;
import com.bagrouter.parser.section.SectionParser;

/**
 * @author prashant
 * This evaluator will give the parse  multiple types of section
 * data on a single callback. So no need to supply reader to each section parse.
 */
public class RoutingEvaluator {
	
	public static SectionParser multiSectionParser( RoutingInput input ) throws ParseException {
		SectionParser parser = new SectionParser( );
		parser.setSectionInput( input );
		return parser;
	}

}
