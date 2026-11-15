
package com.ww3.worldwar3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ww3.worldwar3.dto.ObserverResponsesDTO.*;
import com.ww3.worldwar3.service.ObserverService;


@RestController
public class WW3ObserverController {

    private final ObserverService service;

    public WW3ObserverController(ObserverService service){
        this.service = service;
    }

    @GetMapping
    @RequestMapping("/api/v1/health")
    public ResponseEntity<HealthResponseDTO> health(
        @RequestParam (required = true) Boolean returnPerformanceData
    ) {
        HealthResponseDTO res = service.health(returnPerformanceData);
        return ResponseEntity.ok(res);
    }

    @PostMapping 
    @RequestMapping("/api/v1/loop")
    public ResponseEntity<LoopResponseDTO> loop(
    ){
        LoopResponseDTO res = service.loop();
        return ResponseEntity.ok(res);
    }

    @GetMapping 
    @RequestMapping("/api/v1/kill")
    public String kill(
        @RequestParam (required = true) String time
    ){
        return "Ok";
    }
}
