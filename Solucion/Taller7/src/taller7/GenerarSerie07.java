package Taller7;
import java.util.Scanner;
public class GenerarSerie07 {
    public static void main(String[] args) {
        double numerador=1;
        double denominador=1;
        double sumatoria=0;
        String signo="-";
        System.out.print("Sumatoria= ");
        while (denominador<=10){
            System.out.print(signo+"("+numerador+"/"+denominador+")");
            if (denominador%2==0){
                sumatoria=sumatoria+(numerador/denominador);
                signo="-";
            }else{
                sumatoria=sumatoria+(-(numerador/denominador));
                signo="+";
            } 
            denominador++;
        }
        System.out.println(".");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Sumatoria= "+sumatoria);
    }
}
