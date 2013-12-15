package Framework;


import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
import Usuario.UsuarioFabricaConcreta;
import java.util.Scanner;
import javax.swing.JOptionPane;

	 
public class cliente {
	
       public static void main(String[] args){
           
int escolha;

// escolha funçoes 
do{
         escolha = Integer.parseInt(JOptionPane.showInputDialog("Cadastro:" +
                                                                    "\n 1 - Funçoes Recurso"+
                                                                    "\n 2 - Funcores Usuario"+
                                                                    "\n 3 - Alocar Recurso"
                                                                   + "\n 4 - Sair"));
         
         switch(escolha){
        case 1:
            menuRecurso();
            break;
        case 2:
            
           menuUsuario();
            break;
        case 3:
            
            break;
        default:
            break;
           }
}while(escolha != 4);


        
           }

       public static void menuUsuario(){
           int escolha;
           do{
              escolha = Integer.parseInt(JOptionPane.showInputDialog("SOLICITANTE:"
                                                                    + "\n 1 - Cadastro de Solicitante."
                                                                    + "\n 2 - Buscar Solicitante"
                                                                    + "\n 3 - Alterar Solicitante"
                                                                    + "\n 4 - Excluir Solicitante"
                                                                    + "\n 5 - Voltar"));
              
              switch(escolha){
                  case 1:
                        cadastroSolicitante();
                        break;
                    case 2: 
                         BuscarUsuario ();
                        break;
                    case 3:
                        alteraUsuario ();
                        break;
                    case 4: 
                        excluirUsuario();
                        break;
                    default:
                        break;
              }
           } while(escolha != 5);
       }
       
       public static void menuRecurso(){
           int escolha;

            // escolha entre usuario e recurso
        do{
                 escolha = Integer.parseInt(JOptionPane.showInputDialog("RECURSO:" +
                                                                        "\n 1 - cadastro recurso"+
                                                                        "\n 2 - buscar Recurso"+
                                                                        "\n 3 - Alterar Recurso"+
                                                                        "\n 4 - excluir recuros"
                                                                       + "\n 5 - voltar"));
         
                    switch(escolha){
                    case 1:
                        CadastroRecurso();
                        break;
                    case 2: 
                         BuscarRecurso ();
                        break;
                    case 3:
                        alteraRecurso ();
                        break;
                    case 4: 
                        excluirRecurso();
                        break;
                    default:
                        break;
                    }
            }while(escolha != 5);
       }
           
       public static void CadastroRecurso(){
        int tipoRecurso;
        FachadaRecurso fCR = new FachadaRecurso ();
        //RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
        
        do{
                tipoRecurso = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo do Recurso"
                                                                           + "\n1-Projetor"
                                                                           + "\n2 - sala"
                                                                            +"\n3 - Voltar"));
           
       
                
                fCR.criarProdutoFachada(tipoRecurso);
                //fabricaconcreta.criarProduto(tipoRecurso);
       
                 //exibir recurso cadastrado
                 //fabricaconcreta.getRecursosCadastrados();
                
                JOptionPane.showMessageDialog(null,fCR.fabricaconcreta.getRecursosCadastrados().toString());
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
           FachadaUsuario fCS = new FachadaUsuario ();         
           do{
               tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de Solicitante:"+
                                                                           "\n 1 - Professor."+
                                                                           "\n 2 - Aluno."
                                                                          +"\n 3- Voltar"));
               
               fCS.criarProdutoFachada(tipoUsuario);
               
               //exibir solicitante cadastrado
               JOptionPane.showMessageDialog(null, fCS.fabricaconcretaU.getUsuariosCadastrados().toString());
               
           }while(tipoUsuario != 3);
           
           
       }
             
 //Ele procura um recurso pelo numero de patrimonio, se achar um numero igual, entao 
 // ele exclui o que estava na memoria e cria um novo
       public static void alteraRecurso (){
       
                FachadaRecurso fAR = new FachadaRecurso ();
                String NumeroPatrimonioAlterar;
                NumeroPatrimonioAlterar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja alterar: ");
                fAR.alterarProdutoFachada(NumeroPatrimonioAlterar);
} 
       
       public static void BuscarRecurso (){
               
               FachadaRecurso fBR = new FachadaRecurso ();              
               String NumeroPatrimonioBuscar;
               NumeroPatrimonioBuscar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja buscar: ");
               fBR.buscarRecursoFachada(NumeroPatrimonioBuscar);
               
              //menuRecurso();
               
               
} 
       
        public static void BuscarUsuario (){
               String MatriculaBuscar;
               FachadaUsuario fBU = new FachadaUsuario ();  
               MatriculaBuscar = JOptionPane.showInputDialog("Informe o numero da matricula do usuario que deseja pesquisar ");
              fBU.buscarProdutoFachada(MatriculaBuscar);
              
              //SmenuPrincipal();
} 

       public static void alteraUsuario (){
               
               FachadaUsuario fAU = new FachadaUsuario ();                            
               String MatriculaAlterar;
               MatriculaAlterar = JOptionPane.showInputDialog("Informe a matricula do usuario que deseja alterar: ");
               fAU.alterarProdutoFachada(MatriculaAlterar);
          
} 
       public static void excluirRecurso(){
           FachadaRecurso fER = new FachadaRecurso();
           String NumeroPatrimonioExcluir;
           NumeroPatrimonioExcluir = JOptionPane.showInputDialog("Informe o numero de serie do Recurso que desja excluir: ");
           fER.excluirRecursoFachada(NumeroPatrimonioExcluir);
          
       }
       
       public static void excluirUsuario(){
           FachadaUsuario fEU = new FachadaUsuario();
           String MatriculaExcluir;
           MatriculaExcluir = JOptionPane.showInputDialog("Informe a matricula do usuario que deseja excluir:");
           fEU.excluirProdutoFachada(MatriculaExcluir);
       }

} 

 

       





