package Framework;

import Recurso.RecursoFabricaConcreta;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class RecursoFabricaAbstrata {
    
    ArrayList<RecursoProdutoAbstrato> RecursosCadastrados = new ArrayList<RecursoProdutoAbstrato> ();
    
    public abstract RecursoProdutoAbstrato factoryMethod (int tipoRecurso);
    
    public void criarProduto (int tipoRecurso){
    	         
	        // Create the factory object
	        RecursoFabricaConcreta fabrica = new RecursoFabricaConcreta();
	         
	        // criando produto abstrato         
	        RecursoProdutoAbstrato produto = null;        
                
                fabrica.factoryMethod(tipoRecurso);
         
           
            RecursosCadastrados.add(produto);  
            
    }

    public ArrayList<RecursoProdutoAbstrato> getRecursosCadastrados() {
        return RecursosCadastrados;
    }

    public void setRecursosCadastrados(ArrayList<RecursoProdutoAbstrato> RecursosCadastrados) {
        this.RecursosCadastrados = RecursosCadastrados;
    }
    
}
