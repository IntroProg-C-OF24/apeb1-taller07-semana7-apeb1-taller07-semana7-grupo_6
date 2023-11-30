package Taller7;
import java.util.Scanner;
public class jugadoresList04 {
    public static void main(String[] args) {
        int numjugadores=0;
        double sumaEdades=0;
        double sumaAlturas=0;
        boolean continuar=true;
        while (continuar){
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = teclado.nextLine();    
        System.out.println("Ingrese la posición que juega: ");
        String posicion = teclado.nextLine();    
        System.out.println("Ingrese la edad del jugador: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese la altura del jugador: ");
        double estatura = teclado.nextDouble();
        numjugadores=numjugadores+1;
        System.out.println(numjugadores + ". " + nombre + " -" + posicion + "-. "+"edad " + edad + ", estatura " + estatura);
        System.out.println("Desea continuar? (si/no)");
        String respuesta = teclado.next();
        if (respuesta.equals("no"))
            continuar=false;
        sumaEdades = sumaEdades+edad;
        sumaAlturas = sumaAlturas+estatura;
        }
        System.out.println("Promedio edades: "+sumaEdades/numjugadores);
        System.out.println("Promedio de estaturas: "+sumaAlturas/numjugadores);
    }
}