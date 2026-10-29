import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, 
 * el número de minutos consumidos en el mes."
 * @author Paula Aguirre
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMinutos, minutosMes, valorPlanilla;
        System.out.print("Deme el costo por minutos: ");
        costoMinutos = tcl.nextDouble();
        System.out.print("Deme el numero de minutos consumidos al mes: ");
        minutosMes = tcl.nextDouble();
        valorPlanilla = (costoMinutos * minutosMes);
        System.out.print("El valor de su planilla de telefono es: " + valorPlanilla + "$");
    }
 }
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme el costo por minutos: 0.15
Deme el numero de minutos consumidos al mes: 180
El valor de su planilla de telefono es: 27.0$
BUILD SUCCESSFUL (total time: 7 seconds)
*/