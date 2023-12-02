package pda.abril.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pda.abril.model.Producto;
import pda.abril.service.ProductoService;

import java.util.ArrayList;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ArrayList<Producto> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return this.productoService.guardarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public String eliminarProductoPorId(@PathVariable("rut") Integer id) {
        boolean ok = this.productoService.eliminarProducto(id);
        if (ok){
            return "Producto eliminado";
        }else {
            return "No se pudo eliminar el producto";
        }
    }
}
