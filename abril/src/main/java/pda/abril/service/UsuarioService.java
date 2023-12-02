package pda.abril.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pda.abril.model.Usuario;
import pda.abril.repository.UsuarioRepository;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(String rut){
        try {
            usuarioRepository.deleteById(rut);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
