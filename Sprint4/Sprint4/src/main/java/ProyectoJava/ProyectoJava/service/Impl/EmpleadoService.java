package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.repository.IEmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    //Creación de objetos
    private IEmpleadoRepository repository;
    //Creación de objetos


    //Constructor
    public EmpleadoService(IEmpleadoRepository repository){
        this.repository = repository;
    }
    //Constructor


    public List<Empleado> getListEmpleados() {
        return this.repository.findAll();
    }

    public Empleado crearEmpleado(Empleado empleado){
        return this.repository.save(empleado);
    }

    public Boolean borrarEmpleado(Integer id) {
        this.repository.deleteById(id);
        return true;
    }
}

