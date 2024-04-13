package Principal;

import java.io.IOException;

import java.util.Scanner;

import modulos.consulta_moneda;
import modulos.datos_moneda;
import modulos.Menu;

public class ConversorPrincipal {
   public static void main(String[] args) throws IOException, InterruptedException {

      Scanner lectura_tipoMoneda = new Scanner(System.in);
      Scanner lectura_tipoMonedaSolicitada = new Scanner(System.in);
      Scanner lectura_cantMoneda = new Scanner(System.in);
      Scanner op = new Scanner(System.in);
      boolean cond = true;
      Scanner op_Ppal = new Scanner(System.in);
      int i = 9;

      while (i != 0) {
         Menu menu = new Menu();
         menu.menu_Pal();
         var op_Ppal1 = Integer.valueOf(op_Ppal.nextLine());

         switch (op_Ppal1) {
            case 1:
               System.out.println("Funcion bajo construccion, no disponible en esta version..."); 
               break;
            case 2:
               while (cond != false) {

                  System.out.println("Ingrese la moneda nativa: ");
                  var tipoMonedaNativa = lectura_tipoMoneda.nextLine();

                  System.out.println("Introducir los 3 caracteres de la moneda: ");
                  var tipoMonedaSolicitada = lectura_tipoMonedaSolicitada.nextLine();

                  System.out.println("Introduzca la cantidad de monedas a convertir: ");
                  var cant_moneda = Integer.valueOf(lectura_cantMoneda.nextLine());

                  datos_moneda moneda = consulta_moneda.consulta_mon(tipoMonedaNativa, tipoMonedaSolicitada,
                        cant_moneda);

                  //System.out.println("Moneda ingresada: " + tipoMonedaNativa);

                  //System.out.println("Cantidad a convertir: " + cant_moneda);

                  System.out.println(moneda.toString());

                  System.out.println("¿Desea consultar otra moneda? \n 1-Si \n 2-No");
                  var op1 = Integer.valueOf(op.nextLine());

                  if (op1 == 2) {
                     cond = false;
                  }
                  
               }
               break;
               default:
               i = 0;
               break;
            }
         }
         
         System.out.println("Gracias por utilizar nuestro algoritmo ;)...");
      }

}