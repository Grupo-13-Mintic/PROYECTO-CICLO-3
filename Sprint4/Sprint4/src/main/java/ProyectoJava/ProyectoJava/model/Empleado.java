package ProyectoJava.ProyectoJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false,unique = true)
    private String nombre;

    @Column(length = 50, nullable = false,unique = true)
    private String correo;

    @OneToOne
    private Perfil perfil;

    @ManyToOne
        //@Column(nullable = false)
    @JoinColumn(name = "empresa_id")
    @JsonIgnore
    private Empresa empresa;

    @Column(length = 50)
    private Rol rol;

    @OneToMany(mappedBy = "empleado")
    @JsonIgnore
    private List<MovimientoDinero> transaciones;

    @Column
    @CreatedDate
    private Date FechaCreacion;
    @Column
    @LastModifiedDate
    private Date FechaActualizacion;



}
