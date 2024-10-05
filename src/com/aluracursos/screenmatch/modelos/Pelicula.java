package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String directoor ;

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
}
