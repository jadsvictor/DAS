package Framework;

import Framework.RecursoFabricaAbstrata;
import Recurso.RecursoFabricaConcreta;
import Usuario.UsuarioFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;

	 
public class cliente {
	 
	   public static void main(String[] args){

int escolha;



// escolha entre usuario e recurso
do{
         escolha = Integer.parseInt(JOptionPane.showInputDialog("Cadastro:" +
                                                                    "\n 1 - Solicitante"+
                                                                    "\n 2 - Recurso"+
                                                                    "\n 3 - Sair"));
         
         switch(escolha){
        case 1:
            cadastroSolicitante();
            break;
        case 2:
            CadastroRecurso();
            break;
        default:
            break;
           }
}while(escolha != 3);

/*    
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
        
 }while(tipoRecurso != 3);*/

        
           }
           
       public static void CadastroRecurso(){
        int tipoRecurso;
        RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
        
        do{
                tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                                           + "\n1-Projetor"
                                                                           + "\n2 - sala"
                                                                            +"\n3 - sair"));
           
       
         
                fabricaconcreta.criarProduto(tipoRecurso);
       
                 //exibir recurso cadastrado
                 //fabricaconcreta.getRecursosCadastrados();
                JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().toString());
        
            }while(tipoRecurso != 3);
        /*
        fabricaconcreta.getRecursosCadastrados();
        for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) {  
           // System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).nomeRecurso); 
            //System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).descricaoRecurso);
            //System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio);
           // System.out.println(fabricaconcreta.getRecursosCadastrados().get(i).toString());
            JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().get(i).toString());
            
            
  
        }*/
       }    
       
       public static void cadastroSolicitante(){
           int tipoUsuario;
           UsuarioFabricaConcreta UFabricaConcreta = new UsuarioFabricaConcreta();
           
           do{
               tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de Solicitante:"+
                                                                           "\n 1 - Professor."+
                                                                           "\n 2 - Aluno."
                                                                          +"\n 3- Sair"));
               
               UFabricaConcreta.criarUsuario(tipoUsuario);
               
               //exibir solicitante cadastrado
               JOptionPane.showMessageDialog(null, UFabricaConcreta.getUsuariosCadastrados().toString());
               
           }while(tipoUsuario != 3);
       }
}
