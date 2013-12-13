package Framework;

import Recurso.RecursoFabricaConcreta;
import java.util.Scanner;
	 
public class cliente {
	 
	   public static void main(String[] args){
	         
	        // Create the factory object
	        RecursoFabricaConcreta fabrica = new RecursoFabricaConcreta();
	         
	        // criando produto abstrato         
	        RecursoProdutoAbstrato produto = null;        
	        Scanner userInput = new Scanner(System.in);
	                  
	            int tipoRecurso = 1;
	         
            produto = fabrica.factoryMethod(tipoRecurso);
	    System.out.print( tipoRecurso+ ":  " + produto);      
          
	           
	         
	        }
           }
