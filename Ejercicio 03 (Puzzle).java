import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        puzzle();
    }    
    
    // Método a desarrollar
    public static void puzzle() {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Introduce un valor entero: ");
        num = input.nextInt();
        System.out.println("El valor anterior es: ");
        System.out.println(num - 1);
        System.out.println("El valor introducido es: ");
        System.out.println(num);
        System.out.println("El valor posterior es: ");
        num = num + 2;
        num = num - 1;
        System.out.println(num);
        
    }
}