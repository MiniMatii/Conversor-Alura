package modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import com.google.gson.Gson;

public class consulta_moneda extends modif{
    public static datos_moneda consulta_mon(String tipo_moneda1,String tipo_moneda2, int cantidad_moneda) throws IOException, InterruptedException{
        URI dir = URI.create("https://v6.exchangerate-api.com/v6/2ed9535607cc1a69e901b89f/pair/"+tipo_moneda1.toUpperCase()+"/"+tipo_moneda2.toUpperCase());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(dir).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            String json = response.body();
            //datos_moneda  datos = new datos_moneda(tipo_moneda1, json);
            return new Gson().fromJson(json,datos_moneda.class);
        }catch(Exception e){
            throw new RuntimeException("Error...");
        }
        
    }
    }

//}
