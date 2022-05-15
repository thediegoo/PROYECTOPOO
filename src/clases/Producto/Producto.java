/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Producto;

import clases.Persona.Proveedor;

/**
 *
 * @author pc_sistemas2020
 */
public class Producto {
private String codigo;
    private String descripcion;
    private Marca marca;
    private Categoria categoria;
    private int stock;
    private double precio;
    private double peso;
    private Proveedor proveedor;

    private Color color;
    static int contador = 0;
    public String imprimir() {
        String mensaje = "El producto es  Codigo:" +codigo +
                ", descripcion=" + descripcion + ", marca=" + 
                marca.getDescripcion() + ", categoria=" + categoria.getDescripcion() + ", stock=" + stock 
                + ", precio=" + precio + ", peso=" + peso + " Color:" + color.getDescripcion();
        return mensaje;
    }
    public String generarCodigo(){
        
        return String.format("%s%03d", "P",contador);
        //return "Codigo generado";
    }
    public String alertaStock(){
        String mensaje ="";
        if(this.stock <= 5){
            mensaje = "Necesita reponer Stock de producto";
        }
        return mensaje;
    }
    public Producto(){}
    public Producto(String codigo, String descripcion, Marca marca, Categoria categoria, int stock, 
            double precio, double peso, Color color, Proveedor proveedor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.proveedor = proveedor;
        contador++;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        
        if(this.descripcion.isEmpty()){
            this.descripcion = "Descripcion on disponible";
        }
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
        
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Proveedor getProveedor(){
        return proveedor;
    }
    
    public void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }
    
    //Listar productos con campos de codigo, descripcion , cantidad y precio unitario
    public String[][] listar(){
        String[][] lista = new String[4][4];
        
        lista[0][0] = "P0001";
        lista[0][1] = "Impresora Epson C5558";
        lista[0][2] = "150";
        lista[0][3] ="350";
        
        lista[1][0] = "P0002";
        lista[1][1] = "Escaner HP mobile 220";
        lista[1][2]="120";
        lista[1][3] = "400";
        
        lista[2][0] = "P0003";
        lista[2][1] = "Mouse Genius";
        lista[2][2]="100";
        lista[2][3] = "25";
        
        
        lista[3][0] = "P0004";
        lista[3][1] = "Teclado Logitech";
        lista[3][2]="100"; // cantidad
        lista[3][3] = "18"; // precio unitario
        
        return lista;
    
    }
    
    public String[] Buscar(String codigo){
        
    String[] registro = new String[4];
        for(int x = 0; x < listar().length;x++){
            if(codigo.equals(listar()[x][0])){
                
                registro = listar()[x];
            }
        }
        return registro;
    }
}
