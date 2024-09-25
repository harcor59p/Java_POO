public class Peliculas {
    String nombre ;
    int fechaDeLanzamiento ;
    int duracionEnMinutos ;
    boolean incluidoEnElPlan   ;


    void muestraFichaTecnica(){
        System.out.println("El nombre de la Pelicula es: " + nombre);
        System.out.println("Su fecha de Lanzamiento es: " + fechaDeLanzamiento );
        System.out.println("Duracion en minutos: " + duracionEnMinutos );
    }
}
