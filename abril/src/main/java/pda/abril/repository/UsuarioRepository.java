package pda.abril.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pda.abril.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String > {
}
