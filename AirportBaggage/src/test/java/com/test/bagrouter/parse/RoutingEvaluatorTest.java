package com.test.bagrouter.parse;

import java.io.IOException;

import org.junit.Test;

import com.bagrouter.parser.ParseException;
import com.bagrouter.parser.RoutingEvaluator;
import com.bagrouter.parser.section.SectionParser;


public class RoutingEvaluatorTest {


	@Test (expected =  IllegalArgumentException.class)
	public void testEvaluatorNullInput() throws ParseException, IOException {

		@SuppressWarnings("unused")
		SectionParser parser = RoutingEvaluator.multiSectionParser( null );

	}



}
