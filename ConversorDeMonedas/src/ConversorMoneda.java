import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {
    public Moneda convertirMoneda(String monedaBase, String monedaDestino, double cantidad){
        URI direccion= URI.create("https://v6.exchangerate-api.com/v6/71bb593deb456d32054b2202/pair/"+monedaBase+"/"+monedaDestino+"/"+cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la Moneda");
        }

    }



}
