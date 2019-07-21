package com.azmisahin;

/**
 * Simple Trace
 */
public class Trace{

    // Static
    private static Writer write;

    /**
     * Trace
     */
    protected Trace(){
        init();
    }

    // Initalizer
    private static void init(){
        
        // Instance Create
        if(write == null)
        write = new Writer();
    }

    /**
     * Debug Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Debug(String message) {
        init();
        return write.Write(message, TrackingState.Debug);
    }

    /**
     * Info Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Info(String message) {
        init();
        return write.Write(message, TrackingState.Debug);
    }

    /**
     * Warning Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Warning(String message) {
        init();
        return write.Write(message, TrackingState.Debug);
    }

    /**
     * Error Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Error(String message) {
        init();
        return write.Write(message, TrackingState.Debug);
    }
}