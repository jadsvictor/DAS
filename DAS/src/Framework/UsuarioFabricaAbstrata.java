package Framework;

import Usuario.UsuarioFabricaConcreta;
import Usuario.UsuarioProdutoConcreto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class UsuarioFabricaAbstrata {
  
 protected static ArrayList<UsuarioProdutoConcreto> usuarioscadastrados = new ArrayList<UsuarioProdutoConcreto> ();
 
     public abstract UsuarioProdutoAbstrato factoryMethod (int tipoUsuario);
    
     public void criarUsuario(int tipoUsuario){
    	         
	        // Create the factory object
	        UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
	        
	        // criando produto abstrato         
	        UsuarioProdutoConcreto produto = null; 
                
                produto = (UsuarioProdutoConcreto) fabricaconcretaU.factoryMethod(tipoUsuario);
                //usuarioscadastrados.add(produto);  
            
    }

     public void buscarUsuario (String MatriculaBuscar){
               boolean achou=false;
               UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();               
               int i;
                 for (i = 0; i < fabricaconcretaU.getUsuariosCadastrados().size(); i++) {  
                      if (fabricaconcretaU.getUsuariosCadastrados().get(i).getMatricula().equals(MatriculaBuscar)){
                  
                          JOptionPane.showMessageDialog(null,fabricaconcretaU.getUsuariosCadastrados().get(i).toString());
                achou=true; 
                      
                      } 
                 }
                 
                 if (achou==false){
                     JOptionPane.showMessageDialog(null, "Matricula não encontrada!");
                     cliente.menuUsuario();
                 }      
     }
       
     public void alteraUsuario (String MatriculaAlterar){
                boolean achou=false;
               int tipoUsuarioAlterar=0;
               UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
               fabricaconcretaU.getUsuariosCadastrados();
                    for (int i = 0; i < fabricaconcretaU.getUsuariosCadastrados().size(); i++) {  
                      if (fabricaconcretaU.getUsuariosCadastrados().get(i).getMatricula().equals(MatriculaAlterar)){
                          achou=true;   
                          tipoUsuarioAlterar = fabricaconcretaU.getUsuariosCadastrados().get(i).getTipoUsuario();
                           fabricaconcretaU.getUsuariosCadastrados().get(i).setMatricula(JOptionPane.showInputDialog("Informe novo numero de matricula"));
                             fabricaconcretaU.getUsuariosCadastrados().get(i).setNome(JOptionPane.showInputDialog("Informe novo nome"));
                          switch (tipoUsuarioAlterar){
                              case 1:
                                   fabricaconcretaU.getUsuariosCadastrados().get(i).setMateriaLeciona(JOptionPane.showInputDialog("Informe as novas materias lecionadas"));
                                  fabricaconcretaU.getUsuariosCadastrados().get(i).setAreaAtuacao(JOptionPane.showInputDialog("Informe a nova area de atuacao"));
                              break;
                              case 2:
                                 fabricaconcretaU.getUsuariosCadastrados().get(i).setSemestreEntrada(JOptionPane.showInputDialog("Informe o novo semestre de entrada"));
                                 fabricaconcretaU.getUsuariosCadastrados().get(i).setCurso(JOptionPane.showInputDialog("Informe o novo curso"));
                               break;
                          }
                            
                          cliente.menuUsuario();
                      }
                 } 
               if (achou==false){
                     JOptionPane.showMessageDialog(null, "Matricula não encontrada!");
                     cliente.menuUsuario();
                 }        
     }
     
     public void excluirUsuario(String MatriculaExcluir){
          UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
           boolean achou=false;
          int i =0;
          int excluir;
          for(i=0; i< fabricaconcretaU.getUsuariosCadastrados().size(); i++){
              if(fabricaconcretaU.getUsuariosCadastrados().get(i).matricula.equals(MatriculaExcluir)){
                  JOptionPane.showMessageDialog(null, fabricaconcretaU.getUsuariosCadastrados().get(i).toString());
                  achou=true;
                      excluir = Integer.parseInt(JOptionPane.showInputDialog("Deseja remover o usuário?"
                                                                            + "1 - sim"
                                                                            + "2 - nao"));
                    switch(excluir){
                        case 1:
                              fabricaconcretaU.getUsuariosCadastrados().remove(i);
                            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
                            break;
                        case 2:
                            cliente.menuUsuario();
                            break;
                        default:
                             break;
                    }  
              }
          }
          
          if (achou==false){
                     JOptionPane.showMessageDialog(null, "Matricula não encontrada!");
                     cliente.menuUsuario();
                 }      
     }
      
     public ArrayList<UsuarioProdutoConcreto> getUsuariosCadastrados() {
        return usuarioscadastrados;
    }
     
     public void setUsuariosCadastrados(ArrayList<UsuarioProdutoConcreto> UsuariosCadastrados) {
        this.usuarioscadastrados = UsuariosCadastrados;
    }

}
