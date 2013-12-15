package Framework;

import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class RecursoFabricaAbstrata {
    
     static ArrayList<RecursoProdutoConcreto> RecursosCadastrados = new ArrayList<RecursoProdutoConcreto> ();

     public abstract RecursoProdutoAbstrato factoryMethod (int tipoRecurso);
    
     public void criarProduto (int tipoRecurso){
       
	        // Create the factory object
	        RecursoFabricaConcreta fabrica = new RecursoFabricaConcreta();
	        
	        // criando produto abstrato         
	        RecursoProdutoConcreto produto = null; 
                
               produto = (RecursoProdutoConcreto) fabrica.factoryMethod(tipoRecurso);
                RecursosCadastrados.add(produto);  
            
    }

      public void alteraRecurso (String NumeroPatrimonioAlterar){
               
               int tipoRecursoAlterar=0;
               boolean encontrou=false;
               int i;
               RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();             
               fabricaconcreta.getRecursosCadastrados();
                 for (i = 0; i < fabricaconcreta.getRecursosCadastrados().size() || encontrou!=true; i++) {  
                      if (fabricaconcreta.getRecursosCadastrados().get(i).getNumeroPatrimonio()==NumeroPatrimonioAlterar){
                             tipoRecursoAlterar = fabricaconcreta.getRecursosCadastrados().get(i).getTipoRecurso();
                             fabricaconcreta.getRecursosCadastrados().remove(i);
                                encontrou=true;
                       }
                 }
                    if(encontrou==true){
                    fabricaconcreta.criarProduto(tipoRecursoAlterar);
                    }
} 
    public void setRecursosCadastrados(ArrayList<RecursoProdutoConcreto> RecursosCadastrados) {
        this.RecursosCadastrados = RecursosCadastrados;
    }
    
    public ArrayList<RecursoProdutoConcreto> getRecursosCadastrados() {
        return RecursosCadastrados;
    }
    
    
}
