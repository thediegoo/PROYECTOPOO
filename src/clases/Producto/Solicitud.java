package clases.Producto;


public class Solicitud {

    private String id_solicitud;    
    private int id_admi;
    private String codProducto;
    private int rut_proveedor;
    private String codCategoria;
    private int cantidad;
    private String comentarios;

    public Solicitud() {
    }

    public Solicitud(String id_solicitud, int id_admi, String codProducto, int rut_proveedor, String codCategoria, int cantidad, String comentarios) {
        this.id_solicitud = id_solicitud;
        this.id_admi = id_admi;
        this.codProducto = codProducto;
        this.rut_proveedor = rut_proveedor;
        this.codCategoria = codCategoria;
        this.cantidad = cantidad;
        this.comentarios = comentarios;
    }

    public String getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(String id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public int getId_admi() {
        return id_admi;
    }

    public void setId_admi(int id_admi) {
        this.id_admi = id_admi;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public int getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(int rut_proveedor) {
        this.rut_proveedor = rut_proveedor;
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    
}
