package clases.Producto;

import clases.Persona.Proveedor;

public class Producto {

    public static void remove(int existe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String codigo;
    private String categoria;
    private String nombreP;
    private String marca;
    private String estado;
    private Proveedor idProveedor;
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

    public String generarCodigo() {
        return String.format("%s%03d", "P", contador);
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

    //Listar productos con campos de codigo, descripcion , cantidad y precio unitario
    public String[][] listar() {
        String[][] lista = new String[4][4];

        lista[0][0] = "P0001";
        lista[0][1] = "Impresora Epson C5558";
        lista[0][2] = "150";
        lista[0][3] = "350";

        lista[1][0] = "P0002";
        lista[1][1] = "Escaner HP mobile 220";
        lista[1][2] = "120";
        lista[1][3] = "400";

        lista[2][0] = "P0003";
        lista[2][1] = "Mouse Genius";
        lista[2][2] = "100";
        lista[2][3] = "25";

        lista[3][0] = "P0004";
        lista[3][1] = "Teclado Logitech";
        lista[3][2] = "100"; // cantidad
        lista[3][3] = "18"; // precio unitario

        return lista;
    }

    public String[] Buscar(String codigo) {

        String[] registro = new String[4];
        for (int x = 0; x < listar().length; x++) {
            if (codigo.equals(listar()[x][0])) {

                registro = listar()[x];
            }
        }
        return registro;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
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
}
