package Ejercicio1;

public class sufijoComun {
        // Sufijo común más largo
    public static String sufijoComunMasLargo(String c1, String c2) {
        int i = c1.length() - 1;
        int j = c2.length() - 1;
        StringBuilder sufijo = new StringBuilder();

        while (i >= 0 && j >= 0 && c1.charAt(i) == c2.charAt(j)) {
            sufijo.insert(0, c1.charAt(i));
            i--;
            j--;
        }
        return sufijo.toString();
    }

    public static void main(String[] args) {
        String c1 = "computadora";
        String c2 = "laptopora";
        System.out.println("Sufijo común más largo: " + sufijoComunMasLargo(c1, c2));
    }

}
