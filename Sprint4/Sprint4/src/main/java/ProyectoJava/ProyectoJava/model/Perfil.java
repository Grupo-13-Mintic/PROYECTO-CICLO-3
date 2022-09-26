package ProyectoJava.ProyectoJava.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
@EntityListeners(AuditingEntityListener.class)

@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String image;

    /*@Column (length = 50, nullable = false)
    private String telefono;
    @Column (length = 50, nullable = false)
    private String nombre;*/

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    @Column(name = "FechaCreacion")
    @CreatedDate
    private Date FechaCreacion;

    @Column(name = "FechaActualizacion")
    @LastModifiedDate
    private Date FechaActualizacion;

    public Perfil() {
    }

    public Perfil(String image, String email, String auth0Id) {
        this.image = image;
        this.email = email;
        this.auth0Id = auth0Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        FechaActualizacion = fechaActualizacion;
    }
}