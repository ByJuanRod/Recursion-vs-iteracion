import java.util.Scanner;

public class InvertirCadena {

    // Versión iterativa
    public static String invertirCadenaIterativo(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i-- ){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Versión Recursiva
    public static String invertirCadenaRecursivo(String str){
        // Caso base: cadena vacía o de un solo carácter
        if(str == null || str.length() <= 1){
            return str;
        }

        // Caso recursivo
        return invertirCadenaRecursivo(str.substring(1)) + str.charAt(0);
    }

    public static void entradaInvertirCadena(Scanner scanner) {
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
        System.out.println("=== PROGRAMA PARA INVERTIR CADENAS ===");
        System.out.print("Ingrese una cadena: ");
        String entrada = scanner.nextLine();

        // Usar versión iterativa y recursiva
        String resultadoIterativo = invertirCadenaIterativo(entrada);
        String resultadoRecursivo = invertirCadenaRecursivo(entrada);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cadena original: " + entrada);
        System.out.println("Cadena invertida (iterativo): " + resultadoIterativo);
        System.out.println("Cadena invertida (recursivo): " + resultadoRecursivo);
        System.out.println("\n\n");
    }
}