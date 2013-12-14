package Framework;

import Framework.RecursoFabricaAbstrata;
import Recurso.RecursoFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;

	 
public class cliente {
	 
	   public static void main(String[] args){
int tipoRecurso;
RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();

for(int i=0; i<2; i++){
	   tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                               + "1-Projetor"
                                                               + "2 - sala"));
           
       
           
       fabricaconcreta.criarProduto(tipoRecurso);
       }

      fabricaconcreta.getRecursosCadastrados();
       for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) {  
            System.out.println(fabricaconcreta.getRecursosCadastrados().get(i));  
  
        }  
           }
}
