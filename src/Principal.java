public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas();
        miPelicula.nombre = "Encanto" ;
        miPelicula.fechaDeLanzamiento = 2021 ;
        miPelicula.duracionEnMinutos = 120 ;


        miPelicula.muestraFichaTecnica();



        Peliculas otraPelicula = new Peliculas() ;

        otraPelicula.nombre = "Matrix" ;
        otraPelicula.fechaDeLanzamiento = 1999 ;
        otraPelicula.duracionEnMinutos = 150 ;

        otraPelicula.muestraFichaTecnica();
    }
}
