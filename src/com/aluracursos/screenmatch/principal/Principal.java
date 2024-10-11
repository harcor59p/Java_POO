package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto" , 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(9.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        Serie casaDragon = new Serie("La casa del dragon" , 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix" , 1999);
        otraPelicula.setDuracionEnMinutos(150);
        otraPelicula.setIncluidoEnElPlan(false);

        otraPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo() ;
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos.");

        System.out.println("**************************");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targerian");
        episodio.setNombre("La casa targerian");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(100);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El Señor de los Anillos" , 2001) ;
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>() ;
        listaDePeliculas.add(miPelicula) ;
        listaDePeliculas.add(otraPelicula) ;
        listaDePeliculas.add(peliculaDeBruno) ;

        System.out.println("Tamaño de la Lista " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula " + listaDePeliculas.get(0).toString());




        


    }


}
