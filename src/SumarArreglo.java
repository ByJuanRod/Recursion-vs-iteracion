import java.util.Scanner;

public class SumarArreglo {

    // Versión iterativa
    public static int sumarIterativo(int[] a){
        int total = 0;
        for (int j : a) {
            total += j;
        }
        return total;
    }

    // Versión recursiva
    public static int sumarRecursivo(int[] arreglo){
        return sumarRecursivoR(arreglo, arreglo.length - 1);
    }

    // Función recursiva auxiliar
    public static int sumarRecursivoR(int[] arreglo, int elemento){
        if(elemento == 0){
            return arreglo[0];
        }
        else{
            return arreglo[elemento] + sumarRecursivoR(arreglo, elemento-1);
        }
    }

    public static void entradaSuma(Scanner scanner){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
        System.out.println("=== PROGRAMA PARA SUMAR ELEMENTOS DE UN ARREGLO ===");
        System.out.println("Ingrese los valores del arreglo separados por espacios:");

        String entrada = scanner.nextLine();

        String[] partes = entrada.split(" ");
        int[] arreglo = new int[partes.length];

        // Convertir las partes a enteros.
        for (int i = 0; i < partes.length; i++) {
            arreglo[i] = Integer.parseInt(partes[i]);
        }

        // Calcular suma usando iteración y recursión.
        int resultadoIterativo = sumarIterativo(arreglo);
        int resultadoRecursivo = sumarRecursivo(arreglo);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Arreglo ingresado: " + java.util.Arrays.toString(arreglo));
        System.out.println("Suma (método iterativo): " + resultadoIterativo);
        System.out.println("Suma (método recursivo): " + resultadoRecursivo);
        System.out.println("\n\n");

    }
}