package Framework;

import Framework.RecursoFabricaAbstrata;
import Recurso.RecursoFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;

	 
public class cliente {
	 
	   public static void main(String[] args){
int tipoRecurso;
RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();

//for(int i=0; i<2; i++){
do{
        tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                               + "\n1-Projetor"
                                                               + "\n2 - sala"
                                                                +"\n3 - sair"));
           
       
         
       fabricaconcreta.criarProduto(tipoRecurso);
       
       //exibir recurso cadastrado
       fabricaconcreta.getRecursosCadastrados();
       JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().toString());
        
 }while(tipoRecurso != 3);

      fabricaconcreta.getRecursosCadastrados();
       for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) {  
           // System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).nomeRecurso); 
            //System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).descricaoRecurso);
            //System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio);
           // System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).toString());
            JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().get(i).toString());
            
            
  
        }  
           }
}
