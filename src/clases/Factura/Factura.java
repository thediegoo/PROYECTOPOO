
package clases.Factura;

import clases.Fecha.Fecha;
import clases.Persona.Cliente;
import clases.Persona.Empleado;

public class Factura {
    
    private String codigo;
    private Fecha fecha;
    private Empleado vendedor;
    private Cliente cliente;
    private double total;
    private String regalo;

    public Factura(String codigo, Fecha fecha, Empleado vendedor, Cliente cliente, double total, String regalo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.total = total;
        this.regalo = regalo;
    }
    
    public String imprimir(){
        String mensaje = "Codigo :"+codigo+"/nFecha :"+fecha+"/nEmpleado: "+vendedor+"/nCliente :"+cliente+"/nRegalo: "+regalo+"/nTotal :"+total;
        return mensaje;
    }

    public String getRegalo() {
        return regalo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Fecha getFecha() {
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
}
