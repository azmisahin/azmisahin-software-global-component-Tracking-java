package com.azmisahin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Trace Tests
 */
public class TraceTest extends TestCase{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TraceTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( TraceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTrace()
    {
        assertTrue( true );
    }
}