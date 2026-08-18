import java.util.Scanner;

public class Calculadora {

    public static double sumar(double num1, double num2){
        return num1 + num2;
    }

    public static double resta(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static void main(String[] args){
        int num1,num2;
        double resultado;

        System.out.println("Hola Leonel!");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingres un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Valor de la variable: "+ num1);

        System.out.println("Ingres un numero 2: ");
        num2 = teclado.nextInt();
        System.out.println("Valor de la variable 2: "+ num2);

        resultado = sumar(num1, num2);
        System.out.println("Resultado de la suma: " + resultado);

        teclado.close();
    }
}
