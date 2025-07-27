package com.healthtrack.service;

import com.healthtrack.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private Usuario usuario = new Usuario("Hutao", 70.0);

    public Usuario getUsuario() {
        return usuario;
    }

    public void actualizarPeso(double nuevoPeso) {
        usuario.actualizarPeso(nuevoPeso);
    }
}
