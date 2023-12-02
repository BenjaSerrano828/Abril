package pda.abril.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    private Integer id;
    @Column(name="estado", nullable = false, unique = true)
    private String estado;
    @Column(name="precio_total", nullable = false, unique = true)
    private Integer precioTotal;
    @Column(name="fecha_creacion", nullable = false, unique = true)
    private Date fechaCreacion;
    @Column(name="fecha_entrega", nullable = false, unique = true)
    private Date fechaEntrega;
}
