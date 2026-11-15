package com.ww3.worldwar3.util;

public class Utils {
    
    public static Long calculateMemoryUsage(){
        Runtime runtime = Runtime.getRuntime();
        
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        
        long memoryUsage = totalMemory - freeMemory;

        return memoryUsage  / (1024 * 1024);
    }
}
