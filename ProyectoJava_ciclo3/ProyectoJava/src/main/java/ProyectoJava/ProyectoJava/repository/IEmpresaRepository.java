package ProyectoJava.ProyectoJava.repository;

import ProyectoJava.ProyectoJava.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Integer> {
}