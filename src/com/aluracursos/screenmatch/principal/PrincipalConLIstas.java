package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConLIstas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto" , 2021);
        miPelicula.evalua(9);
        Serie casaDragon = new Serie("La casa del dragon" , 2022);
        casaDragon.evalua(8.5);
        Pelicula otraPelicula = new Pelicula("Matrix" , 1999);
        otraPelicula.evalua(9.5);
        var peliculaDeBruno = new Pelicula("El Señor de los Anillos" , 2001) ;
        peliculaDeBruno.evalua(8);

        Pelicula p1 = miPelicula ;

        ArrayList<Titulo> lista = new ArrayList<>() ;
        lista.add(miPelicula) ;
        lista.add(otraPelicula) ;
        lista.add(peliculaDeBruno) ;
        lista.add(casaDragon) ;

        lista.forEach(System.out::println);


        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
            System.out.println(((Pelicula) item).getClasificacion());

            }
        }

    }
}
