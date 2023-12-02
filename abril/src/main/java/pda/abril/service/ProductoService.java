package pda.abril.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pda.abril.model.Producto;
import pda.abril.repository.ProductoRepository;

import java.util.ArrayList;
@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<Producto> obtenerProductos(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public boolean eliminarProducto(Integer id){
        try {
            productoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
