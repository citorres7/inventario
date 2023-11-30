package ci.inventario.servicio;

import ci.inventario.modelo.producto;
import ci.inventario.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<producto> listarProductos() {
        this.productoRepositorio.findAll();
    }

    @Override
    public producto buscarProductoPorId(Integer idProducto) {
        producto producto = this.productoRepositorio.findById(idProducto).orElse(null);
        return producto;

    }

    @Override
    public void guardarProducto(producto producto) {
        this.productoRepositorio.save(producto);

    }

    @Override
    public void eliminarProductoPorId(Integer IdProducto) {
        this.productoRepositorio.deleteById(IdProducto);

    }
}
