package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String directoor ;


    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirectoor() {
        return directoor;
    }

    public void setDirectoor(String directoor) {
        this.directoor = directoor;
    }

    @Override
    public int getClasificacion() {
        return (int) (calcularMedia() / 2);
    }

    public String toString(){
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")" ;
    }
}
