package ci.inventario.controlador;

import ci.inventario.modelo.producto;
import ci.inventario.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/inventario-app
@RequestMapping("inventrio-app") // peticiones de url de la app
@CrossOrigin(value = "http://localhost_4200") //hacer petición frontend angular
public class ProductoControlador {

    //atributo para enviar información a consola
    private static final Logger logger =
            LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;
    //http//localhost:8080/inventario-app/producto

    @GetMapping("/producto")
    public List<producto> obtenerProductos(){

        List<producto> productos = this.productoServicio.listarProductos();
        logger.info("prodcutos obtenidos: ");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;

        //controlador se comunica con la capa de servicio
    }


}
