package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import ProyectoJava.ProyectoJava.service.Impl.EmpresaService;
import ProyectoJava.ProyectoJava.service.Impl.MovimientoDineroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@RestController
@Slf4j
public class MovimientoDineroController {
    private MovimientoDineroService service;

    //Constructor
    public MovimientoDineroController(MovimientoDineroService service) {
        this.service = service;
    }
    //Constructor



    @PostMapping("/movimientos")
    public RedirectView crearMovimiento(@ModelAttribute MovimientoDinero movimientoDinero, Model model){
        model.addAttribute(movimientoDinero);
        this.service.crearMovimiento(movimientoDinero);
        return new RedirectView("/movimientos");
    }

    @GetMapping("/movimientos/eliminar/{id}")
    public RedirectView borrarMovimiento(@PathVariable("id") Integer id) {
        this.service.borrarMovimiento(id);
        return new RedirectView("/movimientos");
    }
}