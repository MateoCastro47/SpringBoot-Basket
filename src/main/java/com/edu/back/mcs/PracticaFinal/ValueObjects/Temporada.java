package com.edu.back.mcs.PracticaFinal.ValueObjects;

import java.util.Objects;
import java.util.regex.Pattern;

import jakarta.persistence.Embeddable;

@Embeddable
public final class Temporada{
    public String nombre; //"2023/2024"

    public static final Pattern PATTERN = Pattern.compile("^\\d{4}/\\d{4}$"); //Con este patrón no hace falta validación de negativo(Preguntar Rico)
    
    protected Temporada(){

    }

    public Temporada(String nombre){
        validate(nombre);
        this.nombre = nombre;
    }

    private void validate(String nombre){
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El año no puede ser nulo o vacio");
        }
        if(!PATTERN.matcher(nombre).matches()){
            throw new IllegalArgumentException("Formato inválido para Temporada. Debe ser AAAA/AAAA. EJ: 2023/2024");
        }

        int año1 = Integer.parseInt(nombre.substring(0, 4)); // 2023/2024 -> Desde el 2 hasta el /
        int año2 = Integer.parseInt(nombre.substring(5,9)); // Desde el / hasta el 4

        if(año2 <= año1){
            throw new IllegalArgumentException("El segundo año debe ser mayor al primero");
        }

        if(año2 != año1 + 1){
            throw new IllegalArgumentException("La segunda parte de la temporada debe ser el año siguiente. Ej: 2023/2024");
        }
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temporada other)) return false;
        return Objects.equals(nombre, other.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
