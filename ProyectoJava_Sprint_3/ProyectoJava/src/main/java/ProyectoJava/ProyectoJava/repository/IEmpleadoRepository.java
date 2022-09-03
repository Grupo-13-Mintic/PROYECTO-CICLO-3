package ProyectoJava.ProyectoJava.repository;

import ProyectoJava.ProyectoJava.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Integer> {
}
