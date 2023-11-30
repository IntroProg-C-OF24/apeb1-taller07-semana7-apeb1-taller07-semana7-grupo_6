package Taller7;
import java.util.Scanner;
public class ventaTienda06 {
    public static void main(String[] args) {
        int venta=1, cliente;
        double costComputadora;
        while (venta<=7){
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Nombre del cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Costo computadora");
        double costo = teclado.nextInt();
        System.out.println("Tipo de cliente: ");
        cliente=teclado.nextInt();
        System.out.println("-Nombre: "+nombre);
        System.out.println("-Costo computadora: "+costo);
        if (cliente==1){
            costo=(costo-(costo*10)/100);
            System.out.println("Cliente tipo "+cliente+", compra computadora con un precio de "+costo+"$");
        }else{
            costo=(costo-(costo*20)/100);
            System.out.println("Cliente tipo "+cliente+", compra computadora con un precio de "+costo+"$");
        }   
        venta++;    
        }
    }
}