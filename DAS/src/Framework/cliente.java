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
           UsuarioFabricaConcreta usuarioscadastrados = new UsuarioFabricaConcreta();
           
           do{
               tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de Solicitante:"+
                                                                           "\n 1 - Professor."+
                                                                           "\n 2 - Aluno."
                                                                          +"\n 3- Sair"));
               
               usuarioscadastrados.criarUsuario(tipoUsuario);
               
               //exibir solicitante cadastrado
               JOptionPane.showMessageDialog(null, usuarioscadastrados.getUsuariosCadastrados().toString());
               
           }while(tipoUsuario != 3);
           
           
       }
             
 //Ele procura um recurso pelo numero de patrimonio, se achar um numero igual, entao 
 // ele exclui o que estava na memoria e cria um novo
       public static void alteraRecurso (){
               
               RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
               String NumeroPatrimonioAlterar;
               int tipoRecursoAlterar=0;
               boolean encontrou=false;
               int i;
               NumeroPatrimonioAlterar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja alterar: ");
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
       
       public static void BuscarRecurso (){
               
               RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
               String NumeroPatrimonioBuscar;
               int i=0;
               NumeroPatrimonioBuscar = JOptionPane.showInputDialog("Informe o numero de serio do Recurso que deseja buscar: ");
               fabricaconcreta.getRecursosCadastrados();
                 for (i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) { 
                      if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(NumeroPatrimonioBuscar)){
                      JOptionPane.showMessageDialog(null,fabricaconcreta.getRecursosCadastrados().get(i).toString());    
                       }
                 }

} 
       
        public static void BuscarUsuario (){
               
               UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
               String MatriculaBuscar;
               int i;
               MatriculaBuscar = JOptionPane.showInputDialog("Informe o numero da matricula do usuario que deseja pesquisar ");
               fabricaconcreta.getUsuariosCadastrados();
                 for (i = 0; i < fabricaconcreta.getUsuariosCadastrados().size(); i++) {  
                      if (fabricaconcreta.getUsuariosCadastrados().get(i).getMatricula().equals(MatriculaBuscar)){
                   JOptionPane.showMessageDialog(null,fabricaconcreta.getUsuariosCadastrados().get(i).toString());
               } 
                 }
} 

       public static void alteraUsuario (){
               
               UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
               String MatriculaAlterar;
               int tipoRecursoAlterar=0;
               boolean encontrou=false;
               int i;
               MatriculaAlterar = JOptionPane.showInputDialog("Informe a matricula do usuario que deseja alterar: ");
               fabricaconcreta.getUsuariosCadastrados();
              
                 for (i = 0; i < fabricaconcreta.getUsuariosCadastrados().size() || encontrou!=true; i++) {  
                      if (fabricaconcreta.getUsuariosCadastrados().get(i).getMatricula()==MatriculaAlterar){
                             tipoRecursoAlterar = fabricaconcreta.getUsuariosCadastrados().get(i).getTipoUsuario();
                             fabricaconcreta.getUsuariosCadastrados().remove(i);
                                encontrou=true;
                       }
                 }  
                    if(encontrou==true){
                    fabricaconcreta.criarUsuario(tipoRecursoAlterar);
                    }
               
                             

} 

} 

 

       





