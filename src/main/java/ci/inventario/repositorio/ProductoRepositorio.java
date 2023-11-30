package ci.inventario.repositorio;

import ci.inventario.modelo.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository <producto, Integer>{
}
