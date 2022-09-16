package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/{id}")
    public Empleado readById(@PathVariable("id") Integer id) throws Exception {
        return service.readById(id);
    }

    // crear
    @PostMapping
    public Empleado create(@RequestBody Empleado empleado) throws Exception {
        return service.create(empleado);
    }

    @PutMapping
    public Empleado update(@RequestBody Empleado empleado) throws Exception {
        return service.update(empleado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) throws Exception {
        try {
            service.delete(id);
            return ResponseEntity.ok().body("ok");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("El Id no existe");

        }

}
}