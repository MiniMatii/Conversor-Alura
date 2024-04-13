package Principal;

import java.io.IOException;
//import java.net.http.HttpResponse;
import java.util.Scanner;


import modulos.consulta_moneda;
import modulos.datos_moneda;
//import modulos.modif;
/**
 * ConversorPrincipal
 */
public class ConversorPrincipal{
   public static void main(String[] args) throws IOException, InterruptedException  {

      Scanner lectura_tipoMoneda = new Scanner(System.in);
      Scanner lectura_tipoMonedaSolicitada = new Scanner(System.in);
      Scanner lectura_cantMoneda = new Scanner(System.in);
      
      
      while (true) {
         System.out.println("Ingrese la moneda nativa: ");
         var tipoMonedaNativa = lectura_tipoMoneda.nextLine();

         System.out.println("Introducir los 3 caracteres de la moneda: ");
         var tipoMonedaSolicitada = lectura_tipoMonedaSolicitada.nextLine();
         
         System.out.println("Introduzca la cantidad de monedas a convertir: ");
         var cant_moneda = Integer.valueOf(lectura_cantMoneda.nextLine());
         
         datos_moneda moneda = consulta_moneda.consulta_mon(tipoMonedaNativa,tipoMonedaSolicitada, cant_moneda);
         
         System.out.println("Moneda ingresada: "+ tipoMonedaNativa);
         
         System.out.println("Cantidad a convertir: " + cant_moneda);

         System.out.println(moneda.toString());
        
         //System.out.println("Desea consultar otra moneda? ");
   }
}
}