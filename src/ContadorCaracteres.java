import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Contadorcaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el texto a analizar");
        String stexto;
        stexto = scan.next();
        System.out.println(stexto);
        int contadorvocales = 0;

            for (int x = 0; x < stexto.length(); x++) {
                if ((stexto.charAt(x) == 'a') || (stexto.charAt(x) == 'e') || (stexto.charAt(x) == 'i') || (stexto.charAt(x) == 'o') || (stexto.charAt(x) == 'u')) {
                    contadorvocales++;
                }
            }
        System.out.println("La cantidad de vocales es: "+contadorvocales);
        System.out.println("La cantidad de consonantes: "+(stexto.length()-contadorvocales));
    }}

