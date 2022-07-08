package clases.Factura;


public class Detalle {

    private String idProducto;
    private String idFactura;
    private double subtotal;
    private int cantidad;

    public Detalle() {
    }

    public Detalle(String idProducto, String idFactura, double subtotal, int cantidad) {
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.subtotal = subtotal;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
 
    
    

    
}
