package clases.Factura;

import clases.Persona.Cliente;
import clases.Persona.Empleado;

public class Factura {

    private String codigo;
    private String fecha;
    private Empleado vendedor;
    private Cliente cliente;
    private double total;
    
    public Factura() {
    }

    public Factura(String codigo, String fecha, Empleado vendedor, Cliente cliente, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.total = total;
    }
    
    public double descuento(){
        double desc=0;
        if( total>500) desc=total*0.05;
        return desc;
    }
    
    public double totalFinal(){
        return total+descuento();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

}
