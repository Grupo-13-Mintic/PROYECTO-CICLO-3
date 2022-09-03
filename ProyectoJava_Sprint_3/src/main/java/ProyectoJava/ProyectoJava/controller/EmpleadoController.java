package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService service;

    // buscar
    @GetMapping
    public List<Empleado> readAll() throws Exception {
        return service.readAll();
    }

    // crear
    @PostMapping
    public Empleado create(@RequestBody Empleado empleado) throws Exception {
        return service.create(empleado);
    }

    @GetMapping("/{id}")
    public Empleado readById(@PathVariable("id") Integer id) throws Exception {
        return service.readById(id);
    }

    @PutMapping
    public Empleado update(@RequestBody Empleado empleado) throws Exception {
        return service.update(empleado);
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Integer id) throws Exception {
         service.delete(id);
    }

}