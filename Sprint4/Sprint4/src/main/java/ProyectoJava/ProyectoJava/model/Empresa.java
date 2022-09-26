package ProyectoJava.ProyectoJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
    @CreatedDate
    private Date FechaCreacion;

    @Column
    @LastModifiedDate
    private Date FechaActualizacion;

}



