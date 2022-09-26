package ProyectoJava.ProyectoJava.controller;



import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.Empresa;

import ProyectoJava.ProyectoJava.service.Impl.EmpleadoService;
import ProyectoJava.ProyectoJava.service.Impl.EmpresaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;



@RestController
@Slf4j
public class EmpresaController {
    private EmpresaService service;

    //Constructor
    public EmpresaController(EmpresaService service)  throws Exception {
        this.service = service;
    }
    //Constructor



    @PostMapping("/empresa")
    public RedirectView crearEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.service.crearEmpresa(empresa);
        return new RedirectView("/empresa");
    }

    @GetMapping("/empresa/eliminar/{id}")
    public RedirectView borrarEmpresa(@PathVariable("id") Integer id) {
        this.service.borrarEmpresa(id);
        return new RedirectView("/empresa");
    }
}