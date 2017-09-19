package com.example.aula7.asynctaks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by aula7 on 19/09/17.
 */

public class HttpManager {


    public  static  String getData (String uri) throws IOException {

        BufferedReader reader = null;
        // Clase URL java para manejar rutas
        URL url = new URL(uri); //se añade exeption

        //clase que me permite hacer la conexion  a internet ponerla  URL en el navegador
       HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Declara variable paraa abrir  un buffer de recoleccion de datos
        StringBuilder stringBuilder = new StringBuilder();
        reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;

        while ((line = reader.readLine())!= null){

            stringBuilder.append(line+"\n"); // lista ;V
        }
        return  "";
    }
}
