/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg25.par.e.inmpar;

import java.util.Scanner;

/**
 *
 * @author Sandro
 */
public class ParEInmpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner (System.in);
         System.out.println("Ingrese un numero");
         int entero = sc.nextInt();
        
        
       Numero numero1 = new Numero(entero);
        System.out.println("   Numero   Resultado       ");
        System.out.println("El Numero que inserto es: "+numero1.getnumero());
         System.out.println("ES : "+numero1.MostrarResulados ());
    }
    
}
