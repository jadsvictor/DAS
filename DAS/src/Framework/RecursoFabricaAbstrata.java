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
                             fabricaconcreta.criarProduto(tipoRecursoAlterar);   
                      }
                 } 
     }      
      public void buscarRecurso(String NumeroPatrimonioBuscar){
      
              RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
              int i=0;                
                 for (i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) { 
                      if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(NumeroPatrimonioBuscar)){
                      JOptionPane.showMessageDialog(null,fabricaconcreta.getRecursosCadastrados().get(i).toString());    
                       }
                 }
                 cliente.menuPrincipal();
                 
    }
    
      public void excluirRecurso(String NumeroPatrimonioExcluir){
          RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
          
          int i =0;
          int excluir;
          for(i=0; i< fabricaconcreta.getRecursosCadastrados().size(); i++){
              if(fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(NumeroPatrimonioExcluir)){
                  JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().get(i).toString());
                  
                      excluir = Integer.parseInt(JOptionPane.showInputDialog("Deseja remover o Recurso?"
                                                                            + "1 - sim"
                                                                            + "2 - nao"));
                    switch(excluir){
                        case 1:
                              fabricaconcreta.getRecursosCadastrados().remove(i);
                            JOptionPane.showMessageDialog(null, "Recurso excluido com sucesso!");
                            break;
                        case 2:
                            cliente.menuPrincipal();
                            break;
                        default:
                             break;
                    }  
                  
              }
          }
          
      }
      
    public void setRecursosCadastrados(ArrayList<RecursoProdutoConcreto> RecursosCadastrados) {
        this.RecursosCadastrados = RecursosCadastrados;
    }
    
    public ArrayList<RecursoProdutoConcreto> getRecursosCadastrados() {
        return RecursosCadastrados;
    }
    
    
}
