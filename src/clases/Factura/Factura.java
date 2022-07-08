package clases.Factura;

public class Factura {

    private String codigo;
    private int idCliente;
    private int idVendedor;
    private String fecha;
    private double descuento;
    private double subtotal;
    private double precioTotal;
    
    public Factura() {
    }

    public Factura(String codigo, int idCliente, int idVendedor, String fecha, double descuento, double subtotal, double precioTotal) {
        this.codigo = codigo;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.fecha = fecha;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
