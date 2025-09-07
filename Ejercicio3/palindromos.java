package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class palindromos {
    // Buscar palíndromos de longitud >= 3
    public static List<String> buscarPalindromos(String cadena) {
        List<String> lista = new ArrayList<>();
        int n = cadena.length();

        for (int i = 0; i < n; i++) {
            expandir(cadena, i, i, lista);     // palíndromos impares
            expandir(cadena, i, i + 1, lista); // palíndromos pares
        }
        return lista;
    }

    private static void expandir(String cadena, int izq, int der, List<String> lista) {
        while (izq >= 0 && der < cadena.length() && cadena.charAt(izq) == cadena.charAt(der)) {
            if (der - izq + 1 >= 3) {
                lista.add(cadena.substring(izq, der + 1));
            }
            izq--;
            der++;
        }
    }

    public static void main(String[] args) {
        String cadena = "radaroso";
        System.out.println("Palíndromos encontrados: " + buscarPalindromos(cadena));
    }
}
