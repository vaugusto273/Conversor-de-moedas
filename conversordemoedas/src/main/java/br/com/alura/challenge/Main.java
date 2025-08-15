package br.com.alura.challenge;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a moeda base (ex: USD, EUR, GBP): ");
        ConsultaAPI.moedaBase = scanner.nextLine();
        System.out.println("Digite a ou as moedas de destino (ex: BRL, JPY, AUD): ");
        ConsultaAPI.moedasDestino = scanner.nextLine();
        try {
            ConsultaAPI.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}