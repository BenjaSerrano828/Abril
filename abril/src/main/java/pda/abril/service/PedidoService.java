package pda.abril.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pda.abril.model.Pedido;
import pda.abril.repository.PedidoRepository;

import java.util.ArrayList;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public ArrayList<Pedido> obtenerPedidos(){
        return (ArrayList<Pedido>) pedidoRepository.findAll();
    }

    public Pedido guardarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public boolean eliminarPedido(Integer id){
        try {
            pedidoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
