import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("=== Programa de Recursión VS Iteración ===");
            System.out.println("1. Programa de Sumar Valores En Un Arreglo.");
            System.out.println("2. Programa de para Obtener Máximos En Un Arreglo.");
            System.out.println("3. Programa de Invertir Cadenas.");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            switch(opcion){
                case 1: SumarArreglo.entradaSuma(sc); break;
                case 2: MaximoArreglo.entradaMaximoArreglo(sc); break;
                case 3: InvertirCadena.entradaInvertirCadena(sc); break;
            }
        }while(opcion <= 3 && opcion >= 1);

        sc.close();

    }
}