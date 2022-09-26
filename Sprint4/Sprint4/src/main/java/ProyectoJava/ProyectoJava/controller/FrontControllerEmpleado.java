package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.service.Impl.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControllerEmpleado {
    private EmpleadoService service;

    public FrontControllerEmpleado(EmpleadoService service) {
        this.service = service;
    }

    /*@GetMapping("/")
    public String iniciar(){
        return "index";
    }*/

    @GetMapping("/personal")
    public String getEmpleados(Model model){
        List<Empleado> empleados = this.service.getListEmpleados();
        model.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("/personal/nueva")
    public String crearEmpleado (Model model) {
        model.addAttribute("empleado", new Empleado());
        return "agregarempleado";
    }
}
