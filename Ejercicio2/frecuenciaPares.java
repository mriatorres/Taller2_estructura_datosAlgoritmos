package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class frecuenciaPares {
     // Contar frecuencia de pares
    public static Map<String, Integer> frecuenciaDePares(String cadena) {
        Map<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < cadena.length() - 1; i++) {
            String par = cadena.substring(i, i + 2);
            mapa.put(par, mapa.getOrDefault(par, 0) + 1);
        }
        return mapa;
    }

    public static void main(String[] args) {
        String cadena = "banana";
        System.out.println("Frecuencia de pares: " + frecuenciaDePares(cadena));
    }
}
