import com.aluracursos.screenmatch.modelos.Peliculas;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas();
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







//        com.aluracursos.screenmatch.modelos.Peliculas otraPelicula = new com.aluracursos.screenmatch.modelos.Peliculas() ;
//
//        otraPelicula.nombre = "Matrix" ;
//        otraPelicula.fechaDeLanzamiento = 1999 ;
//        otraPelicula.duracionEnMinutos = 150 ;
//        otraPelicula.incluidoEnElPlan = false ;
//
//        otraPelicula.muestraFichaTecnica();
    }


}
