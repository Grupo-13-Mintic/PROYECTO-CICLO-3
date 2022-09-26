package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.repository.IEmpleadoRepository;
import ProyectoJava.ProyectoJava.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
    @Autowired
    private IEmpleadoRepository repo ;

    @Override
    public Empleado create(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public List<Empleado> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Empleado readById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
