package interfaceDAO;

import clases.Producto.Producto;
import java.util.List;

public interface IDAOProducto {
    public boolean RegistrarProducto(Producto pr);
    public List ListarProducto();
    public Producto buscarProducto(String cod);
    public boolean EliminarProducto(String cod);
    public boolean ModificarProducto(Producto pro);
}
