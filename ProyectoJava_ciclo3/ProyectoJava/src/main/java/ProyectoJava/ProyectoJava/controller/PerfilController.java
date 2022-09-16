package ProyectoJava.ProyectoJava.controller;


import ProyectoJava.ProyectoJava.model.Perfil;
import ProyectoJava.ProyectoJava.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
    @Autowired
    private IPerfilService service;

    @GetMapping
    public List<Perfil> readAll() throws Exception{
        return service.readAll();
    }

    @PostMapping
    public Perfil create(@RequestBody Perfil perfil) throws Exception{

        return service.create(perfil);

    }
    @PutMapping
    public Perfil update(@RequestBody Perfil perfil) throws Exception{
        return service.update(perfil);
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
