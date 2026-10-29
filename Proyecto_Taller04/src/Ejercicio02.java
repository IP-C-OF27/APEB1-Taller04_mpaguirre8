import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Paula Aguirre
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastohijo1, gastohijo2, gastohijo3, gastototal;
        System.out.print("Ingrese los gastos de cada hijo: ");
        gastohijo1 = tcl.nextDouble();
        gastohijo2 = tcl.nextDouble();
        gastohijo3 = tcl.nextDouble();
        gastototal = (gastohijo1 + gastohijo2 + gastohijo3);
        System.out.print("El total de los gastos es: " + gastototal);
    }
 }
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese los gastos de cada hijo: 127 94 57
El total de los gastos es: 278.0BUILD SUCCESSFUL (total time: 8 seconds)
*/