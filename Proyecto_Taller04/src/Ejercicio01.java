import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Paula Aguirre
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Deme la base: ");
        base = tcl.nextDouble();
        System.out.print("Deme la altura: ");
        altura =  tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.print("Area= " + area);
    }
 }
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme la base: 12.6
Deme la altura: 18.7
Area= 117.80999999999999BUILD SUCCESSFUL (total time: 14 seconds)
 */