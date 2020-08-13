
package corversion.de.unidades;

import java.util.Scanner;

public class CorversionDeUnidades {

   
    public static void main(String[] args) {
        
    Scanner Teclado =new Scanner(System.in);
    
    int opc;
    double  Pulgadas, Pies, Centimetros, Legua, Yarda;
    
    System.out.println("Ingrese la opción que desea");
    System.out. println("1.Pies a Pulgadas");
    System.out. println("2.Centimetros a Pulgadas");
    System.out. println("3.Lenguas a Pulgadas");
    System.out. println("4.Yardas a Pulgadas");
    
    opc= Teclado. nextInt();
    
    switch(opc){
        
        case 1:
            System.out. println("Ingrese la catidad de Pies a Convertir");
            Pies = Teclado.nextDouble();
            Pulgadas = Pies*0.0833;
            System.out. println(Pies+"Pies equivalesn a"+Pulgadas+"Pulgadas");
            break;
        case 2:
            System.out. println("Ingrese la catidad de Centímetros a Convertir");
            Centimetros = Teclado.nextDouble();
            Pulgadas = Centimetros*2.54;
            System.out. println(Centimetros+"Centimetros equivalesn a"+Pulgadas+"Pulgadas");
            break;
            
         case 3:
            System.out. println("Ingrese la catidad de Leguas a Convertir");
            Legua = Teclado.nextDouble();
            Pulgadas = Legua*190080.02;
            System.out. println(Legua+"Leguas equivalesn a"+Pulgadas+"Pulgadas");
            break;
            
        case 4:
            System.out. println("Ingrese la catidad de Yardas a Convertir");
            Yarda = Teclado.nextDouble();
            Pulgadas = Yarda*36;
            System.out. println(Yarda+"Yardas equivalesn a"+Pulgadas+"Pulgadas");
            break;
            
        default:
            System.out. println("La opción seleccionada no es válida");
    }
    
       
    }
    
}
