package com.test.bagrouter.route;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
		DijkstraSearchStrategyTest.class,
		WeightedEdgeTest.class,
		WeightedGraphTest.class,
		SearchNodeTest.class
})
public class RouteTestSuite { }
