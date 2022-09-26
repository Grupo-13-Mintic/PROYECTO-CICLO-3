package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import ProyectoJava.ProyectoJava.service.Impl.EmpresaService;
import ProyectoJava.ProyectoJava.service.Impl.MovimientoDineroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControllerMovimiento {
    private MovimientoDineroService service;

    public FrontControllerMovimiento(MovimientoDineroService service) {
        this.service = service;
    }



    @GetMapping("/movimientos")
    public String getMovimientos(Model model){
        List<MovimientoDinero> movimientos = this.service.getListMovimientos();
        model.addAttribute("movimientos", movimientos);
        return "movimientos";
    }

    @GetMapping("/movimientos/nueva")
    public String crearMovimiento (Model model) {
        model.addAttribute("movimientos", new MovimientoDinero());
        return "agregarmovimiento";
    }
}

