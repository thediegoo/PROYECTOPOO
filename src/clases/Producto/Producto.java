package clases.Producto;

import clases.Persona.Proveedor;

public class Producto {

    private String codigo;
    private String categoria;
    private String nomCat;
    private String nombreP;
    private String marca;    
    private String nomMar;
    private String estado;
    private int idProveedor;
    private int stock;
    private int cantInicial;
    private double precio;
    private static int contador = 0;
    
    public Producto() {
    }
    
    public Producto(String codigo, String categoria, String nombreP, String marca, String estado, int stock, int cantInicial, double precio) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.nombreP = nombreP;
        this.marca = marca;
        this.estado = estado;
        this.stock = stock;
        this.cantInicial = cantInicial;
        this.precio = precio;
    }

    public String imprimir() {
        String mensaje = "El producto es  Codigo:" + codigo
                + ", descripcion=" + estado + ", marca="
                + categoria + ", categoria=" + marca + ", stock=" + stock
                + ", precio=" + precio;
        return mensaje;
    }


    public String alertaStock() {
        String mensaje = "";
        if (this.stock <= 5) {
            mensaje = "Necesita reponer Stock de producto";
        }
        return mensaje;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {

        if (this.estado.isEmpty()) {
            this.estado = "Descripcion on disponible";
        }
        return estado;
    }

    public void setEstado(String descripcion) {
        this.estado = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
  

    public int getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public String getNomMar() {
        return nomMar;
    }

    public void setNomMar(String nomMar) {
        this.nomMar = nomMar;
    }
}
