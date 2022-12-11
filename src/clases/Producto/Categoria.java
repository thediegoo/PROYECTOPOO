package clases.Producto;


public class Categoria {

    private String codCategoria;
    private String nombreCat;

    public Categoria(String codCategoria, String nombreCat) {
        this.codCategoria = codCategoria;
        this.nombreCat = nombreCat;
    }
    
    public Categoria() {
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
    
}
