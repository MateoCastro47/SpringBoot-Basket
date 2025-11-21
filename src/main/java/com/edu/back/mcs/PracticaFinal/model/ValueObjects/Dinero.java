package com.edu.back.mcs.PracticaFinal.model.ValueObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.Embeddable;

@Embeddable
public final class Dinero {
    private final BigDecimal cantidad;
    private final String moneda;

    protected Dinero(){
        this.cantidad = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        this.moneda = "USD";    
    }

    public Dinero(BigDecimal cantidad, String moneda){
        validate(cantidad, moneda);
        this.cantidad = cantidad.setScale(2, RoundingMode.HALF_UP);
        this.moneda = moneda.toUpperCase();
    }

    private void validate(BigDecimal cantidad, String moneda){
        if(cantidad == null){
            throw new IllegalArgumentException("La cantidad no puede ser nula");
        }
        if(cantidad.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if(moneda == null || moneda.isBlank()){
            throw new IllegalArgumentException("La moneda no puede ser nula ni vacia");
        }
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
        result = prime * result + ((moneda == null) ? 0 : moneda.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dinero other = (Dinero) obj;
        if (cantidad == null) {
            if (other.cantidad != null)
                return false;
        } else if (!cantidad.equals(other.cantidad))
            return false;
        if (moneda == null) {
            if (other.moneda != null)
                return false;
        } else if (!moneda.equals(other.moneda))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dinero [cantidad=" + cantidad + ", moneda=" + moneda + "]";
    }

}
