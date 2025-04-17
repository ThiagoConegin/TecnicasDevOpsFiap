package com.urbanity.urbanity.service;

import com.urbanity.urbanity.model.Sensor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorService {
    private List<Sensor> sensores = new ArrayList<>();

    public SensorService() {
        sensores.add(new Sensor(1L, "Poluição", 45.0, "Centro"));
        sensores.add(new Sensor(2L, "Trânsito", 80.0, "Avenida Principal"));
    }

    public List<Sensor> getAll() {
        return sensores;
    }

    public void atualizarSensores() {
        sensores.forEach(sensor -> sensor.setValor(Math.random() * 100));
    }
}