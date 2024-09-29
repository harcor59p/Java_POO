import com.aluracursos.screenmatch.modelos.Peliculas;

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
