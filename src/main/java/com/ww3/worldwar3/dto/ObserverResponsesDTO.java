package com.ww3.worldwar3.dto;

public class ObserverResponsesDTO {

    public record HealthResponseDTO(
        Long memoryUsage,
        String status
    ) {}

    public record LoopResponseDTO(
        String status,
        Double seconds
    ){}

}