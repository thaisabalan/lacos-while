package sp.senai.br.atividade1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MinhaAtividade {
    
        static int valor;
        
        public static boolean validarValor(double valor){ 
            
            if(valor <= 0) {
                return false;
            }
        
                return true;
                
        }
        
    public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
                
                int valor = 0;
                int m = 0;
                
                int i = 0;

                 while(i < 10){ 
                     
                     valor += teclado.nextInt();
                     
                     if(validarValor(valor) == false){
                         System.out.println("\n valor invalido \n");
                     }
                    i ++;
                 }
                 
                 m = valor / 10;
                    
                 System.out.printf("\n O valor total e: %d", valor, "\n");
                 System.out.printf("\n E a media e:" + m + "\n");
                    
    System.exit(0); 
	}
}