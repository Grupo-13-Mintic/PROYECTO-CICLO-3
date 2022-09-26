package ProyectoJava.ProyectoJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String concepto;

    @Column(length = 20, nullable = false)
    private double monto;

    @ManyToOne
    @JoinColumn(name = "empleado_id")/*, nullable = false)*/
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "empresa_id")/*,nullable = false)*/
    private Empresa empresa;

    @Column
    @CreatedDate
    private Date FechaCreacion;
    @Column
    @LastModifiedDate
    private Date FechaActualizacion;
}