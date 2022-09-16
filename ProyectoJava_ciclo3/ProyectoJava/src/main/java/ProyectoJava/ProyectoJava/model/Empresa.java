package ProyectoJava.ProyectoJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;

    @Column(length = 50, nullable = false,unique = true)
    private String nombreEmpresa;

    @Column(length = 50, nullable = false,unique = true)
    private String documentoEmpresa;

    @Column(length = 50, nullable = false)
    private String telefono;

    @Column(length = 50, nullable = false)
    private String direccion;


    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "empresa")
    private List<MovimientoDinero> transaciones;


    @Column
    private Date FechaCreacion;

    @Column
    private Date FechaActualizacion;

}



