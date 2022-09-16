package ProyectoJava.ProyectoJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    private Integer id;
    @Column(length = 50, nullable = false)
    private String imagen;
    @Column (length = 50, nullable = false)
    private String telefono;
    @Column (length = 50, nullable = false)
    private String nombre;

    @Column(name = "FechaCreacion")
    private Date FechaCreacion;

    @Column(name = "FechaActualizacion")
    private Date FechaActualizacion;

}