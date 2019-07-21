package com.azmisahin;

/**
 * Simple Trace
 */
public class Trace{

    private Writer write;

    /**
     * Trace
     */
    public Trace(){
        write = new Writer();
    }

    /**
     * Debug Write
     * @param message Message Text
     */
    public void Debug(String message) {
        write.Write(message, TrackingState.Debug);
    }

    /**
     * Info Write
     * @param message Message Text
     */
    public void Info(String message) {
        write.Write(message, TrackingState.Debug);
    }

    /**
     * Warning Write
     * @param message Message Text
     */
    public void Warning(String message) {
        write.Write(message, TrackingState.Debug);
    }

    /**
     * Error Write
     * @param message Message Text
     */
    public void Error(String message) {
        write.Write(message, TrackingState.Debug);
    }
}