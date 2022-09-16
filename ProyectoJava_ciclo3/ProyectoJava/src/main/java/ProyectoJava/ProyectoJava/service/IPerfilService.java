package ProyectoJava.ProyectoJava.service;

import ProyectoJava.ProyectoJava.model.Perfil;

import java.util.List;

public interface IPerfilService {
    Perfil create(Perfil perfil) throws Exception;
    Perfil update(Perfil perfil) throws Exception;
    List<Perfil> readAll() throws Exception;
    Perfil readById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}