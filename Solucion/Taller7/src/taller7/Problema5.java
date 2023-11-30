
package Taller7;
import java.util.Scanner;
public class Problema5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[4];
        double[] promedioDeCiclo = new double[4];
        String[] estado = new String[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
            nombres[i] = teclado.nextLine();
            
            System.out.print("Ingrese el promedio del ciclo para " + nombres[i] + ": ");
            promedioDeCiclo[i] = teclado.nextDouble();
            teclado.nextLine();
            if (promedioDeCiclo[i] >= 7) {
                estado[i] = "Aprobado";
            } else {
                estado[i] = "Reprobado";
            }
        }
        System.out.println("Nombre de estudiantes");
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i] + "/" + promedioDeCiclo[i] + "/" + estado[i] + "/");
        }
    }
}
