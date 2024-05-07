package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingrese N1");
            int n1 = leer.nextInt();
            System.out.println("Ingrese N2");
            int n2 = leer.nextInt();

            int resultado = n1 / n2;

            //int resultado = 4/0;
            System.out.println(resultado);
//       } catch (Exception e) {
        } catch (InputMismatchException e) {
//          } catch (InputMismatchException | ArithmeticException e) {
            System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        } 

    }

}
