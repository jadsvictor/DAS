package Framework;

import Framework.RecursoFabricaAbstrata;
import Recurso.RecursoFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;

	 
public class cliente {
	 
	   public static void main(String[] args){
int tipoRecurso;
int escolha;

RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();

// escolha entre usuario e recurso
do{
         escolha = Integer.parseInt(JOptionPane.showInputDialog("Cadastro:" +
                                                                    "\n 1 - Solicitante"+
                                                                    "\n 2 - Recurso"+
                                                                    "\n 3 - Sair"));
         
         switch(escolha){
        case 1:
            
            break;
        case 2:
            CadastroRecurso();
            break;
        default:
            break;
           }
}while(escolha != 3);

    
//for(int i=0; i<2; i++){
do{
        tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                               + "\n1-Projetor"
                                                               + "\n2 - sala"
                                                                +"\n3 - sair"));
           
       
         
       fabricaconcreta.criarProduto(tipoRecurso);
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
           
       public static void CadastroRecurso(){
           
       }    
}
