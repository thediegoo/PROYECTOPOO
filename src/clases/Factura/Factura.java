package clases.Factura;

import clases.Persona.Cliente;
import clases.Persona.Empleado;

public class Factura {

    private String codigo;
    private String fecha;
    private Empleado vendedor;
    private Cliente cliente;
    private double total;
    private String regalo;
    private static int cantidadregistros = 0;

    public Factura(String codigo, String fecha, Empleado vendedor, Cliente cliente, double total, String regalo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.total = total;
        this.regalo = regalo;
        cantidadregistros++;
    }

    public String imprimir() {
        String mensaje = "Codigo :" + codigo + "/nFecha :" + fecha + "/nEmpleado: " + vendedor + "/nCliente :" + cliente + "/nRegalo: " + regalo + "/nTotal :" + total;
        return mensaje;
    }

    public Factura() {
        cantidadregistros++;
    }

    public String getRegalo() {
        return regalo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String generarSerie() {
        return "FA001";
    }

    public String generarCorrelativo() {
        return String.format("%08d", cantidadregistros);

    }

}
