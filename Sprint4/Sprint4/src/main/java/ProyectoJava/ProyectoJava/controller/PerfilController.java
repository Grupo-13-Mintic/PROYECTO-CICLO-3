/*
package ProyectoJava.ProyectoJava.controller;


import ProyectoJava.ProyectoJava.model.Perfil;
import ProyectoJava.ProyectoJava.service.Impl.PerfilService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RestController
@Slf4j

public class PerfilController {
    private PerfilService service;

    //Constructor
    public PerfilController(PerfilService service) {
        this.service = service;
    }
    //Constructor


    @PostMapping("/perfil")
    public RedirectView crearPerfil(@ModelAttribute Perfil perfil, Model model){
        model.addAttribute(perfil);
        this.service.crearPerfil(perfil);
        return new RedirectView("/perfil");
    }

    @GetMapping("/perfil/eliminar/{id}")
    public RedirectView borrarPersona(@PathVariable("id") Integer id) {
        this.service.borrarPerfil(id);
        return new RedirectView("/perfil");
    }
}
*/