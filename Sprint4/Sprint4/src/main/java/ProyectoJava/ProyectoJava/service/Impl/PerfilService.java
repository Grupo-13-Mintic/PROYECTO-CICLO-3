package ProyectoJava.ProyectoJava.service.Impl;

import ProyectoJava.ProyectoJava.model.Empleado;
import ProyectoJava.ProyectoJava.model.Perfil;
import ProyectoJava.ProyectoJava.repository.IEmpleadoRepository;
import ProyectoJava.ProyectoJava.repository.IPerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PerfilService {
    private IPerfilRepository repository;


    public PerfilService(IPerfilRepository repository) {
        this.repository = repository;
    }

    public Perfil createPerfil (Perfil newPerfil) {
        return this.repository.save(newPerfil);
    }

    public Perfil findUserByEmail(String email){
        return this.repository.findByEmail(email);
    }

    public Perfil generateOrCreatePerfil(Map<String, Object> PerfilData){
        String email = (String) PerfilData.get("email");
        Perfil perfil = findUserByEmail(email);
        if (perfil == null) {
            String image = (String) PerfilData.get("picture");
            String auth0Id = (String) PerfilData.get("sub");
            Perfil newPerfil = new Perfil( image = image, email = email, auth0Id = auth0Id );
            return createPerfil(newPerfil);
        }
        return perfil;
    }
}