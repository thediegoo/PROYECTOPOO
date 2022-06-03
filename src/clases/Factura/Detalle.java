package clases.Factura;

import clases.Producto.Producto;

public class Detalle {

    private Factura factura;
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public Detalle(Factura factura, Producto producto, int cantidad, double subtotal) {
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
