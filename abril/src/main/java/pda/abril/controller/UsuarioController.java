package pda.abril.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pda.abril.model.Usuario;
import pda.abril.service.UsuarioService;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<Usuario> obtenerUsuarios(){
        return this.usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/{rut}")
    public String eliminarUsuarioPorRut(@PathVariable("rut") String rut) {
        boolean ok = this.usuarioService.eliminarUsuario(rut);
        if (ok){
            return "Usuario eliminado";
        }else {
            return "No se pudo eliminar el usuario";
        }
    }
}
