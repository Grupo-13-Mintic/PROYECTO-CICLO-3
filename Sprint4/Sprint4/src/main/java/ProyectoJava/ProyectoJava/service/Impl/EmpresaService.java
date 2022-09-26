package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.repository.IEmpleadoRepository;
import ProyectoJava.ProyectoJava.repository.IEmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    //Creación de objetos
    private IEmpresaRepository repository;
    //Creación de objetos


    //Constructor
    public EmpresaService(IEmpresaRepository repository){
        this.repository = repository;
    }
    //Constructor


    public List<Empresa> getListEmpresas() {
        return this.repository.findAll();
    }

    public Empresa crearEmpresa(Empresa empresa){
        return this.repository.save(empresa);
    }

    public Boolean borrarEmpresa(Integer id) {
        this.repository.deleteById(id);
        return true;
    }
}

