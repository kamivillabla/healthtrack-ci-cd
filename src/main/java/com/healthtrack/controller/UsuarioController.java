package com.healthtrack.controller;

import com.healthtrack.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String mostrarUsuario(Model model) {
        model.addAttribute("usuario", usuarioService.getUsuario());
        return "usuario";
    }

    @PostMapping("/actualizar")
    public String actualizarPeso(@RequestParam("peso") double peso, Model model) {
        usuarioService.actualizarPeso(peso);
        model.addAttribute("usuario", usuarioService.getUsuario());
        model.addAttribute("mensaje", "Peso actualizado exitosamente");
        return "usuario";
    }
}
