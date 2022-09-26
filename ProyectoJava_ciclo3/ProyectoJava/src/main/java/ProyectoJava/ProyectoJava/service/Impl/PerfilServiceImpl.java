package ProyectoJava.ProyectoJava.service.Impl;


import ProyectoJava.ProyectoJava.model.Perfil;
import ProyectoJava.ProyectoJava.repository.IPerfilRepository;
import ProyectoJava.ProyectoJava.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements IPerfilService {

    @Autowired
    private IPerfilRepository repo;

    @Override
    public Perfil create(Perfil perfil) throws Exception {
        return repo.save(perfil);
    }

    @Override
    public Perfil update(Perfil perfil) throws Exception {
        return repo.save(perfil);
    }

    @Override
    public List<Perfil> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Perfil readById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
