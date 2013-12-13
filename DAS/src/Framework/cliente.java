package Framework;

import Framework.RecursoFabricaAbstrata;
import Recurso.RecursoFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;
	 
public class cliente {
	 
	   public static void main(String[] args){
int tipoRecurso;

	   tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                               + "1-Projetor"
                                                               + "2 - sala"));
           
       RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
           
       fabricaconcreta.criarProduto(tipoRecurso);
           }
}
