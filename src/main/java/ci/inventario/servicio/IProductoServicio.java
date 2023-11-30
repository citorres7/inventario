package ci.inventario.servicio;

import ci.inventario.modelo.producto;

import java.util.List;

public interface IProductoServicio {
    public List<producto> listarProductos();

    public producto buscarProductoPorId(Integer idProducto);

    public void guardarProducto(producto producto);

    public void eliminarProductoPorId (Integer IdProducto);


}
