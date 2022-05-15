package clases.Persona;

import clases.Fecha.Fecha;


public class TarjetaBonus {
    
    private int numero;
    private Fecha fechaEmision;
    private Fecha fechaCaducidad;

    public TarjetaBonus(int numero, Fecha fechaEmision, Fecha fechaCaducidad) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public int getNumero() {
        return numero;
    }

    public Fecha getFechaCaducidad() {
        return fechaCaducidad;
    }

    public Fecha getFechaEmision() {
        return fechaEmision;
    }
}
