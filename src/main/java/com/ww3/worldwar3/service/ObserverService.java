package com.ww3.worldwar3.service;

import org.springframework.stereotype.Service;

import com.ww3.worldwar3.dto.ObserverResponsesDTO.HealthResponseDTO;
import com.ww3.worldwar3.dto.ObserverResponsesDTO.LoopResponseDTO;

@Service 
public class ObserverService {

    public HealthResponseDTO health(
        Boolean returnPerformanceData
    ){
        Runtime runtime = Runtime.getRuntime();
        
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        
        long memoryUsage = totalMemory - freeMemory;

        return new HealthResponseDTO(
            memoryUsage / (1024 * 1024),
            "OK"
        );
    }

    public LoopResponseDTO loop(){
        long start = System.nanoTime();

        for (int i = 1; i <= 1000000; i++) {
            System.out.println(i);
        }
        long end = System.nanoTime();

        Double seconds = (end - start) / 1_000_000_000.0;

        return new LoopResponseDTO(
            "Contado",
            seconds
        );
    }
}
