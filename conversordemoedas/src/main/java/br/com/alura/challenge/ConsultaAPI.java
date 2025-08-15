package br.com.alura.challenge;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaAPI {
    public static String moedaBase;
    public static void setMoedaBase(String moeda) {
        moedaBase = moeda;
    }
    public static String[] moedasDestino;
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        try (var input = ConsultaAPI.class.getClassLoader().getResourceAsStream("config.properties")) {
            props.load(input);
        }
        String apiKey = props.getProperty("API_KEY");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey +"/latest/"+ moedaBase))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        for (String moedas : moedasDestino ){
            double currencyValue = rates.get(moedas).getAsDouble();
            System.out.println("Taxas de conversão para " + moedas + ":" + currencyValue);
        }
        
    }
}
