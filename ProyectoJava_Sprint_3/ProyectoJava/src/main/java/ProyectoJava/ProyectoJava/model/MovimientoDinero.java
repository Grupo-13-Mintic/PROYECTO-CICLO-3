package ProyectoJava.ProyectoJava.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimientoDinero;


    @Column(length = 50, nullable = false)
    private String concepto;
    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double monto;
    @Column(length = 50, nullable = false)
    private String usuario;
}