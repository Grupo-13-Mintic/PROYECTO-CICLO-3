package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import ProyectoJava.ProyectoJava.repository.IEmpleadoRepository;
import ProyectoJava.ProyectoJava.repository.IMovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroService {
    //Creación de objetos
    private IMovimientoDineroRepository repository;
    //Creación de objetos


    //Constructor
    public MovimientoDineroService(IMovimientoDineroRepository repository){
        this.repository = repository;
    }
    //Constructor


    public List<MovimientoDinero> getListMovimientos() {
        return this.repository.findAll();
    }

    public MovimientoDinero crearMovimiento(MovimientoDinero movimientoDinero){
        return this.repository.save(movimientoDinero);
    }

    public Boolean borrarMovimiento(Integer id) {
        this.repository.deleteById(id);
        return true;
    }
}

