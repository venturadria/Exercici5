import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);

        int[] numerosentrada = new int[7];
        int maxim = numerosentrada[0];
        int minim = numerosentrada[0];
        int indexmax = 0;
        int indexmin = 0;

        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix el número " + (i + 1) + ":");
            numerosentrada[i] = llegir.nextInt();
        }

        for (int i = 0; i < numerosentrada.length; i++) {
            if (numerosentrada[i] > maxim) {
                maxim = numerosentrada[i];
                indexmax = i;
            }
            if (numerosentrada[i] < minim) {
                minim = numerosentrada[i];
                indexmin = i;
            }
        }

        System.out.println("Has introduït els números:");
        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.print(" " + numerosentrada[i] + " (Índex " + i + ")");
        }
        System.out.println(".");

        System.out.println("Màxim: " + maxim + " a l'índex " + indexmax + ".");
        System.out.println("Mínim: " + minim + " a l'índex "  + indexmin + ".");
    }
}
