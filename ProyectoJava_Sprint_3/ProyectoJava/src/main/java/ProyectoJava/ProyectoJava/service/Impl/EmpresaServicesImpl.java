package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empresa;
import ProyectoJava.ProyectoJava.repository.IEmpresaRepository;
import ProyectoJava.ProyectoJava.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServicesImpl implements IEmpresaService {
    @Autowired
    private IEmpresaRepository repo;



    @Override
    public Empresa create(Empresa empresa) throws Exception {
        return repo.save(empresa);
    }

    @Override
    public Empresa update(Empresa empresa) throws Exception {
        return repo.save(empresa);
    }

    @Override
    public List<Empresa> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Empresa readById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}