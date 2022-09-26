package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.service.Impl.EmpleadoService;
import ProyectoJava.ProyectoJava.service.Impl.EmpresaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControllerEmpresa {
    private EmpresaService service;

    public FrontControllerEmpresa(EmpresaService service) {
        this.service = service;
    }


    @GetMapping("/empresa")
    public String getEmpresas(Model model){
        List<Empresa> empresas = this.service.getListEmpresas();
        model.addAttribute("empresas", empresas);
        return "empresas";
    }


    @GetMapping("/empresa/nueva")
    public String crearEmpresa (Model model) {
        model.addAttribute("empresa", new Empresa());
        return "agregarempresa";
    }
}

