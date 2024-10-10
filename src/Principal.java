import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(9.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.setNombre("Matrix")  ;
        otraPelicula.setFechaDeLanzamiento(1999);  ;
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

        var peliculaDeBruno = new Pelicula() ;
        peliculaDeBruno.setNombre("El Señor de los Anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>() ;
        listaDePeliculas.add(miPelicula) ;
        listaDePeliculas.add(otraPelicula) ;
        listaDePeliculas.add(peliculaDeBruno) ;

        System.out.println("Tamaño de la Lista " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println(listaDePeliculas.hashCode());


        


    }


}
