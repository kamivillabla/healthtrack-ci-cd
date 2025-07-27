package com.healthtrack.regresión;
import com.healthtrack.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRegressionTest {

    @Test
    public void testActualizarPeso_NoModificaValorIngresado() {
        Usuario usuario = new Usuario("Regresion", 72.5);
        usuario.actualizarPeso(75.0);

        assertEquals(75.0, usuario.getPeso(), 0.01,
            "El peso debe quedar exactamente igual al ingresado (regresión bug resta 1kg)");
    }

    @Test
    public void testActualizarPeso_ConValorNegativo_NoRompe() {
        Usuario usuario = new Usuario("Regresion", 70.0);
        usuario.actualizarPeso(-5.0);
        assertEquals(-5.0, usuario.getPeso(), 0.01,
            "El peso negativo debe actualizarse correctamente (prueba de regresión)");
    }
}
