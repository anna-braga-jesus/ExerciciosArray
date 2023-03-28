package ArraysMultidimensionais;

import java.util.Random;
import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        System.out.print("Número: ");
        for(int i = 0; i < numeros.length; i++){
            int num = random.nextInt(100);
            numeros[i] = num;
        }
        System.out.print("Números aleatórios: ");
        for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }

        System.out.print("Sucessores dos números aleatórios: ");
        for (int elemento : numeros) {
            System.out.print((elemento + 1) + " ");
        }

        System.out.print("Antecessores dos números aleatórios: ");
        for (int elemento : numeros) {
            System.out.print((elemento - 1) + " ");
        }
    }
}
