package com.urbanity.urbanity.controller;

import com.urbanity.urbanity.model.Sensor;
import com.urbanity.urbanity.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @GetMapping
    public ResponseEntity<List<Sensor>> getSensores() {
        return ResponseEntity.ok(sensorService.getAll());
    }

    @Scheduled(fixedRate = 5000)
    public void atualizarSensores() {
        sensorService.atualizarSensores();
    }
}
