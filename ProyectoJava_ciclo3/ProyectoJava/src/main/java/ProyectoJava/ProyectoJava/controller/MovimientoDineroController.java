package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import ProyectoJava.ProyectoJava.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoDineroController {
    @Autowired
    private IMovimientoDineroService service;

    @GetMapping
    public List<MovimientoDinero> readAll() throws Exception{
        return service.readAll();
    }
    @GetMapping("/{id}")
    public MovimientoDinero readById(@PathVariable("id") Integer id) throws Exception {
        return service.readById(id);
    }


    @PostMapping
    public MovimientoDinero create(@RequestBody MovimientoDinero movimientoDinero) throws Exception{
        return service.create(movimientoDinero);

    }
    @PutMapping
    public MovimientoDinero update(@RequestBody MovimientoDinero movimientoDinero) throws Exception{
        return service.update(movimientoDinero);
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