package Framework;


import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
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
            CadastroRecurso();
            break;
        case 2:
            
            BuscarRecurso ();
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
        FachadaRecurso f = new FachadaRecurso ();
        //RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
        
        do{
                tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                                           + "\n1-Projetor"
                                                                           + "\n2 - sala"
                                                                            +"\n3 - sair"));
           
       
                
                f.criarProdutoFachada(tipoRecurso);
                //fabricaconcreta.criarProduto(tipoRecurso);
       
                 //exibir recurso cadastrado
                 //fabricaconcreta.getRecursosCadastrados();
                
                JOptionPane.showMessageDialog(null,f.fabricaconcreta.getRecursosCadastrados().toString());
                //JOptionPane.showMessageDialog(null, fabricaconcreta.getRecursosCadastrados().toString());
        
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
           FachadaRecurso f = new FachadaRecurso ();         
           do{
               tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de Solicitante:"+
                                                                           "\n 1 - Professor."+
                                                                           "\n 2 - Aluno."
                                                                          +"\n 3- Sair"));
               
               f.criarProdutoFachada(tipoUsuario);
               
               //exibir solicitante cadastrado
               JOptionPane.showMessageDialog(null, f.fabricaconcreta.getRecursosCadastrados().toString());
               
           }while(tipoUsuario != 3);
           
           
       }
             
 //Ele procura um recurso pelo numero de patrimonio, se achar um numero igual, entao 
 // ele exclui o que estava na memoria e cria um novo
       public static void alteraRecurso (){
       
                FachadaRecurso f = new FachadaRecurso ();
                String NumeroPatrimonioAlterar;
                NumeroPatrimonioAlterar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja alterar: ");
                f.alterarProdutoFachada(NumeroPatrimonioAlterar);
} 
       
       public static void BuscarRecurso (){
               
               FachadaRecurso f = new FachadaRecurso ();              
               String NumeroPatrimonioBuscar;
               NumeroPatrimonioBuscar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja buscar: ");
               f.buscarRecursoFachada(NumeroPatrimonioBuscar);
} 
       
        public static void BuscarUsuario (){
               String MatriculaBuscar;
               FachadaUsuario f = new FachadaUsuario ();  
               MatriculaBuscar = JOptionPane.showInputDialog("Informe o numero da matricula do usuario que deseja pesquisar ");
              f.buscarProdutoFachada(MatriculaBuscar);
} 

       public static void alteraUsuario (){
               
               FachadaUsuario f = new FachadaUsuario ();                            
               String MatriculaAlterar;
               MatriculaAlterar = JOptionPane.showInputDialog("Informe a matricula do usuario que deseja alterar: ");
               f.alterarProdutoFachada(MatriculaAlterar);
          
} 

} 

 

       





