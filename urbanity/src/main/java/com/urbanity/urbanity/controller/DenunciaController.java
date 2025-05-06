package com.urbanity.urbanity.controller;

import com.urbanity.urbanity.model.Denuncia;
import com.urbanity.urbanity.service.DenunciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/denuncias")
public class DenunciaController {
    @Autowired
    private DenunciaService denunciaService;

    // @PostMapping
    // public ResponseEntity<String> registrarDenuncia(@RequestBody Map<String,
    // String> body) {
    // denunciaService.registrarDenuncia(body.get("descricao"),
    // body.get("localizacao"));
    // return ResponseEntity.ok("Denúncia registrada!");
    // }

    @PostMapping
    public ResponseEntity<String> registrarDenuncia(@RequestBody Map<String, String> body) {
        // Verifica se os campos obrigatórios estão presentes e não estão vazios
        if (body.get("descricao") == null || body.get("descricao").trim().isEmpty() ||
                body.get("localizacao") == null || body.get("localizacao").trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Erro 400: Descrição e Localização são obrigatórias.");
        }

        denunciaService.registrarDenuncia(body.get("descricao"), body.get("localizacao"));
        return ResponseEntity.ok("Denúncia registrada!");
    }

    @GetMapping
    public ResponseEntity<List<Denuncia>> getDenuncias() {
        return ResponseEntity.ok(denunciaService.getAll());
    }

    @GetMapping("local")
    public String getDenunciasString() {
        return "Staging";
    }

}