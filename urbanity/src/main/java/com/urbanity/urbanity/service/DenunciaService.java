package com.urbanity.urbanity.service;

import com.urbanity.urbanity.model.Denuncia;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class DenunciaService {
    private List<Denuncia> denuncias = new ArrayList<>();

    public void registrarDenuncia(String descricao, String localizacao) {
        denuncias.add(new Denuncia(
                (long) (denuncias.size() + 1),
                descricao,
                localizacao,
                LocalDateTime.now()
        ));
    }

    public List<Denuncia> getAll() {
        return denuncias;
    }
}
