package interfaceDAO;

import clases.Factura.Detalle;
import clases.Factura.Factura;

public interface IDAOVenta {
    public boolean RegistrarVenta(Factura fac);
    public boolean RegistrarDetalle(Detalle det);
    public String IdVenta();
    public boolean ActualizarStock(int cant, String cod);
}
