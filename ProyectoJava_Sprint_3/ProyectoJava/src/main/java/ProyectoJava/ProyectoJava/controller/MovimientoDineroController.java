package ProyectoJava.ProyectoJava.controller;

import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import ProyectoJava.ProyectoJava.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public MovimientoDinero create(@RequestBody MovimientoDinero movimientoDinero) throws Exception{

        return service.create(movimientoDinero);

    }
    @PutMapping
    public MovimientoDinero update(@RequestBody MovimientoDinero movimientoDinero) throws Exception{
        return service.update(movimientoDinero);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }

}