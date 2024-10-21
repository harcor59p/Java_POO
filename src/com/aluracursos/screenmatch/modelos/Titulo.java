package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exeptions.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("Title")
    private String nombre ;
    @SerializedName("Year")
    private int fechaDeLanzamiento ;
    private int duracionEnMinutos ;
    private boolean incluidoEnElPlan   ;
    private double sumadeLasEvaluaciones ;
    private int totalDeLasEvaluaciones ;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb mitituloOdmb) {
        this.nombre = mitituloOdmb.title();
        this.fechaDeLanzamiento = Integer.valueOf(mitituloOdmb.year()) ;
        if (mitituloOdmb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion, porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.parseInt(mitituloOdmb.runtime().replaceAll("\\D+",""));
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones ;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la Pelicula es: " + nombre);
        System.out.println("Su fecha de Lanzamiento es: " + fechaDeLanzamiento );
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos() );
        if(incluidoEnElPlan == true) {
            System.out.println("Esta Pelicula esta incluida en el plan");
        }else{
            System.out.println("Esta Pelicula no esta incluida en el plan");
        }
    }

    public void evalua(double nota){
        sumadeLasEvaluaciones += nota ;
        totalDeLasEvaluaciones++ ;

    }

    public double calcularMedia(){
        return sumadeLasEvaluaciones / totalDeLasEvaluaciones ;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                " duración = " + duracionEnMinutos ;
    }
}
