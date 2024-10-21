package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exeptions.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in) ;
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){

            System.out.println("Escriba el nombre de la pelicula: ");
            var busqueda = lectura.nextLine() ;

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }
            String encodedUrl = URLEncoder.encode(busqueda, "UTF-8");


            String direccion = "https://www.omdbapi.com?t="+encodedUrl+"&apikey=4f54209a" ;
            System.out.println(direccion);

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body() ;

                System.out.println(response.body());

                TituloOmdb mitituloOdmb = gson.fromJson(json , TituloOmdb.class) ;
                System.out.println("Titulo: " + mitituloOdmb);

                Titulo mititulo = new Titulo(mitituloOdmb) ;
                System.out.println(mititulo);

                titulos.add(mititulo) ;

            }catch (NumberFormatException e) {
                System.out.println("Ocurrio un error ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en l aURI, verifique la dirección");
            }catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println("Ocurrio un error inesperado");
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("titulos.json") ;
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizó la ejecucion del progama!");



    }
}
