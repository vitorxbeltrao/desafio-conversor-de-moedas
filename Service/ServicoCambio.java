package Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

import static java.net.http.HttpClient.newHttpClient;

public class ServicoCambio {

    private String apiKey;

    public ServicoCambio() {
        Properties props = new Properties();
        try (FileInputStream file = new FileInputStream("config.properties")) {
            props.load(file);
            this.apiKey = props.getProperty("api.key");
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar o arquivo config.properties");
        }
    }

    public double converter(String de, String para, double valor) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + de + "/" + para + "/" + valor;


            HttpClient cliente = newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("API indisponível no momento");
            }

            return extrairResultado(response.body());

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar ao serviço de moedas.");
        }
    }

    private double extrairResultado(String json) {
        String chave = "\"conversion_result\":";
        int inicio = json.indexOf(chave) + chave.length();
        int fim = json.indexOf(",", inicio);

        if (fim == -1) {
            fim = json.indexOf("}", inicio);
        }

        String valorTexto = json.substring(inicio, fim).trim();
        return Double.parseDouble(valorTexto);
    }
}
