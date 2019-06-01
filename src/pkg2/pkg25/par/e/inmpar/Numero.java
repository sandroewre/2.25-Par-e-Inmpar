/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg25.par.e.inmpar;

/**
 *
 * @author Sandro
 */
public class Numero {
 int a;

    
 public Numero(int a){
        this.a=a;
    
}
    
    public void setnumero(int a ){
        this.a=a;
    }
    public int getnumero(){
        return  a;
    }
        public String MostrarResulados (){
           if(a % 2 == 0){
               return  " un numero par";
           }
           else {
               return " un numero impar";
           }
        }
    
}

