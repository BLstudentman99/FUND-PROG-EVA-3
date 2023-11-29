/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_valor_maximo;

/**
 *
 * @author g61
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        
        System.out.println(buscarMaximo(100, 200));
        
        int resu = buscarMaximo(100, 200);
        System.out.println(resu);
        
        buscarMaximo(100,200);
        
    }
     public static int buscarMaximo(int val1, int val2) {
     /*if(val1 > val2)
         return val1;
     else 
         return val2;*/
     
     int resultado;
     if(val1 > val2)
         resultado = val1;
     else
         resultado = val2;
     return resultado;
     
     
     }  
}
    
    

