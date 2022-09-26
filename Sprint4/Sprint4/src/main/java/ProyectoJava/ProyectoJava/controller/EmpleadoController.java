package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.service.Impl.EmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@Slf4j
public class EmpleadoController {
    private EmpleadoService service;

    //Constructor
    public EmpleadoController(EmpleadoService service) throws Exception {
        this.service = service;
    }
    //Constructor



    @PostMapping("/personal")
    public RedirectView crearEmpleado(@ModelAttribute Empleado empleado, Model model) throws Exception{
        model.addAttribute(empleado);
        this.service.crearEmpleado(empleado);
        return new RedirectView("/personal");
    }

    @GetMapping("/personal/eliminar/{id}")
    public RedirectView borrarEmpleado(@PathVariable("id") Integer id) throws Exception{
        this.service.borrarEmpleado(id);
        return new RedirectView("/personal");
    }
}