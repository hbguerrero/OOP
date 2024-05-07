package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion1
{

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingrese N1");
            int n1 = leer.nextInt();
            System.out.println("Ingrese N2");
            int n2 = leer.nextInt();

            int resultado = n1 / n2;

            //int resultado = 4/0;
            System.out.println("Resultado" + resultado);
        } catch (InputMismatchException e) {
            System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        } catch (ArithmeticException e) {
            System.err.println("Error!!!: No se puede dividir entre cero");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);        
        } finally {
            System.out.println("Se revisó la división");
        }
    }
}