package Ejercicio0;

public class ejercicioSubcadena {

    // Contar subcadenas (permitiendo solapamientos)
    public static int contarSubcadenas(String cadena, String patron) {
        int contador = 0;
        int n = cadena.length();
        int k = patron.length();

        for (int i = 0; i <= n - k; i++) {
            if (cadena.substring(i, i + k).equals(patron)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = "radaradar";
        String patron = "radar";
        System.out.println("Cantidad de veces que aparece '" + patron + "': " +
                contarSubcadenas(cadena, patron));
    }
}
