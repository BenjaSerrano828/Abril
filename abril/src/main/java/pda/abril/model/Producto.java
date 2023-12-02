package pda.abril.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    private Integer id;
    @Column(name="nombre", nullable = false, length = 40)
    private String nombre;
    @Column(name="precio", nullable = false)
    private Integer precio;
    @Column(name="stock", nullable = false)
    private Integer stock;
    @Column(name="tipo", nullable = false)
    private String tipo;
    @Column(name="formato", nullable = false)
    private String formato;
    @Column(name="descripcion", nullable = false, length = 240)
    private String descripcion;

}
