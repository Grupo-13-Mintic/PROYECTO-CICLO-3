package ProyectoJava.ProyectoJava.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;

    @Column(length = 50, nullable = false)
    private String nombreEmpresa;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50, nullable = false)

    private String telefono;
    @Column(length = 50, nullable = false)
    private String  nit;

    public Empresa(){
    }
    public Empresa(String nombreEmpresa, String direccion, String telefono, String nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }


}



