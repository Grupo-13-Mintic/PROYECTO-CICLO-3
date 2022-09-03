package ProyectoJava.ProyectoJava.controller;


import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private IEmpresaService service;

    @GetMapping
    public List<Empresa> readAll() throws Exception{
        return service.readAll();
    }

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa) throws Exception{

        return service.create(empresa);

    }
    @PutMapping
    public Empresa update(@RequestBody Empresa empresa) throws Exception{
        return service.update(empresa);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }

}