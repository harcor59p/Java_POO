package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConLIstas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto" , 2021);
        Serie casaDragon = new Serie("La casa del dragon" , 2022);
        Pelicula otraPelicula = new Pelicula("Matrix" , 1999);
        var peliculaDeBruno = new Pelicula("El Señor de los Anillos" , 2001) ;

        ArrayList<Titulo> lista = new ArrayList<>() ;
        lista.add(miPelicula) ;
        lista.add(otraPelicula) ;
        lista.add(peliculaDeBruno) ;
        lista.add(casaDragon) ;

    }
}
