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
     * Debug Test :-)
     */
    public void testTraceDebug()
    {
        String actual = Trace.Debug("Test");

        assertNotNull( actual );
    }

    /**
     * Info Test :-)
     */
    public void testTraceInfo()
    {
        String actual = Trace.Info("Test");

        assertNotNull( actual );
    }    


    /**
     * Warning Test :-)
     */
    public void testTraceWarning()
    {
        String actual = Trace.Warning("Test");

        assertNotNull( actual );
    }

    
    /**
     * Error Test :-)
     */
    public void testTraceError()
    {
        String actual = Trace.Error("Test");

        assertNotNull( actual );
    }
}