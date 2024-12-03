import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaMoneda {
    public Moneda buscaPelicula(String monedaBase, String monedaDestino, int cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/bb65123ebc7dfa22e0c3928b/pair/" + monedaBase + "/" + monedaDestino + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }
}
