package ProyectoJava.ProyectoJava.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table (name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIdentificacion;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String correo;
    @Column(length = 50, nullable = false)
    private String nombreEmpresa;
    @Column(length = 50, nullable = false)
    private String rol;

}
