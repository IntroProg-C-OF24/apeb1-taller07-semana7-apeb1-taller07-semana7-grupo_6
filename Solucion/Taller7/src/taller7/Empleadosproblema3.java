package Taller7;
import java.util.Scanner;
public class Problema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] diasTrabajados = new int[5];
        double[] costoDiaTrabajo = new double[5];
        double[] valorCancelar = new double[5];
        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese el nombre del empleado" + i);
            nombres[i] = teclado.nextLine();
            System.out.print("Ingrese el número de días trabajados por " + nombres[i] + ": ");
            diasTrabajados[i] = teclado.nextInt();
            System.out.print("Ingrese el costo del día de trabajo para " + nombres[i] + ": ");
            costoDiaTrabajo[i] = teclado.nextDouble();
            valorCancelar[i] = diasTrabajados[i] * costoDiaTrabajo[i];
            teclado.nextLine();
            
        }
        System.out.println("Reporte de Pagos:");
        System.out.println("Nombre Días Costo_Día tTotal a Pagar");

        for (int i = 1; i < 5; i++) {
            System.out.println(nombres[i] + " /" + diasTrabajados[i] + " / " + costoDiaTrabajo[i] + " / " + valorCancelar[i]);
        }
        
    }

}
