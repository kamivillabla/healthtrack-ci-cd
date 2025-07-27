package com.healthtrack.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testActualizarPeso() {
        Usuario usuario = new Usuario("Ana", 70.0);
        usuario.actualizarPeso(68.5);
        assertEquals(68.5, usuario.getPeso(), 0.01);
    }

    @Test
    public void testActualizarPesoConValorInesperado() {
        Usuario usuario = new Usuario("Luis", 80.0);
        usuario.actualizarPeso(79.0);
        assertNotEquals(78.0, usuario.getPeso(), 0.01);
    }
}
