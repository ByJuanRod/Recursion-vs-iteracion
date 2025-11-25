import java.util.Random;
import java.util.Scanner;

public class MaximoArreglo {
    // Versión Original
    public static int maximoRecursivo(int a[], int i, int j){
        if(i == j)
            return a[i];

        int mid = (i + j) / 2;
        int left = maximoRecursivo(a,i,mid);
        int  right = maximoRecursivo(a,mid + 1,j);

        return Math.max(left,right);
    }

    // Versión Iterativa
    public static int maximoIterativo(int a[]){
        int maximo = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > maximo) {
                maximo = j;
            }
        }

        return maximo;
    }

    public static void entradaMaximoArreglo(Scanner scanner) {
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
        Random random = new Random();

        System.out.println("=== PROGRAMA PARA ENCONTRAR EL MÁXIMO EN UN ARREGLO ===");
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.print("Arreglo generado: [");

        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(1000);
            System.out.print(arreglo[i]);

            if (i < n - 1) System.out.print(", ");

        }
        System.out.println("]");

        // Calcular máximo usando versión recursiva y la iterativa
        int maxRecursivo = maximoRecursivo(arreglo, 0, arreglo.length - 1);
        int maxIterativo = maximoIterativo(arreglo);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Máximo (versión recursiva): " + maxRecursivo);
        System.out.println("Máximo (versión iterativa): " + maxIterativo);
        System.out.println("\n\n");
    }

}
