package comgamestore.gamestore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import comgamestore.gamestore.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);

}
