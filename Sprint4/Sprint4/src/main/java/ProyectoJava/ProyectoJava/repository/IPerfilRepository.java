package ProyectoJava.ProyectoJava.repository;


import ProyectoJava.ProyectoJava.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerfilRepository extends JpaRepository<Perfil,Integer> {
    Perfil findByEmail(String email);
}