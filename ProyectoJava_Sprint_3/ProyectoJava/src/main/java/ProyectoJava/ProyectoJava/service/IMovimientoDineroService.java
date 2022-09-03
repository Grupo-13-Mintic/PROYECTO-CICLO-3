package ProyectoJava.ProyectoJava.service;

import ProyectoJava.ProyectoJava.model.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {
    MovimientoDinero create(MovimientoDinero movimientoDinero) throws Exception;
    MovimientoDinero update(MovimientoDinero movimientoDinero) throws Exception;
    List<MovimientoDinero> readAll() throws Exception;
    MovimientoDinero readById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;

}
