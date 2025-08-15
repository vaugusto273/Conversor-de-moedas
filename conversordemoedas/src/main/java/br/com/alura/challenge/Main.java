package br.com.alura.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a moeda base (ex: USD, EUR, GBP): ");
        ConsultaAPI.moedaBase = scanner.nextLine();
        System.out.println("Digite as moedas de destino separadas por vírgula (ex: BRL,JPY,AUD): ");
        String moedasDestinoInput = scanner.nextLine();
        ConsultaAPI.moedasDestino = moedasDestinoInput.replace(" ", "").split(",");
        try {
            ConsultaAPI.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}