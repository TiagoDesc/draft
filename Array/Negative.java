package Array;

import java.util.Scanner;

public class Negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
            if (vet[i] < 0) {
                System.out.println("Os números negativos são: " + vet[i]);
            }
        }
    }

}
