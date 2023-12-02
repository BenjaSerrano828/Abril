package pda.abril.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pda.abril.model.Pedido;
import pda.abril.model.Producto;
import pda.abril.service.PedidoService;
import pda.abril.service.ProductoService;

import java.util.ArrayList;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    PedidoService pedidoService;

    @GetMapping
    public ArrayList<Pedido> obtenerPedidos(){
        return pedidoService.obtenerPedidos();
    }

    @PostMapping
    public Pedido guardarPedido(@RequestBody Pedido pedido){
        return this.pedidoService.guardarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public String eliminarPedidoPorId(@PathVariable("rut") Integer id) {
        boolean ok = this.pedidoService.eliminarPedido(id);
        if (ok){
            return "Pedido eliminado";
        }else {
            return "No se pudo eliminar el pedido";
        }
    }

}
