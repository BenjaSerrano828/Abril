package pda.abril.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(name="rut", length = 14, nullable = false, unique = true)
    private String rut;
    @Column(name="nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name="apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name="telefono", length = 15, nullable = false)
    private String telefono;
    @Column(name="email", length = 35, nullable = false)
    private String email;
    @Column(name="password", length = 40, nullable = false)
    private String password;
    @Column(name="direccion", length = 30, nullable = false)
    private String direccion;
    @Column(name="tipo", length = 10, nullable = false)
    private String tipo;





}
