package ProyectoJava.ProyectoJava.repository;


import ProyectoJava.ProyectoJava.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Integer> {
}
