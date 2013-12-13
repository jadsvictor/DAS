package Framework;

import Recurso.RecursoFabricaConcreta;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class RecursoFabricaAbstrata {
    
    ArrayList<RecursoProdutoAbstrato> RecursosCadastrados = new ArrayList<RecursoProdutoAbstrato> ();
    
    public abstract RecursoProdutoAbstrato factoryMethod (int tipoRecurso);
    
    public RecursoProdutoAbstrato criarProduto (int tipoRecurso){
    	         
	        // Create the factory object
	        RecursoFabricaConcreta fabrica = new RecursoFabricaConcreta();
	         
	        // criando produto abstrato         
	        RecursoProdutoAbstrato produto = null;        

            produto = fabrica.factoryMethod(tipoRecurso);  
            return produto;
       
    }
    
}
