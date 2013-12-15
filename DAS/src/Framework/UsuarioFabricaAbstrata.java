package Framework;

import Usuario.UsuarioFabricaConcreta;
import Usuario.UsuarioProdutoConcreto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class UsuarioFabricaAbstrata {
  
 static ArrayList<UsuarioProdutoConcreto> usuarioscadastrados = new ArrayList<UsuarioProdutoConcreto> ();
 
     public abstract UsuarioProdutoAbstrato factoryMethod (int tipoRecurso);
    
     public void criarUsuario(int tipoUsuario){
    	         
	        // Create the factory object
	        UsuarioFabricaConcreta fabrica = new UsuarioFabricaConcreta();
	        
	        // criando produto abstrato         
	        UsuarioProdutoConcreto produto = null; 
                
                produto = (UsuarioProdutoConcreto) fabrica.factoryMethod(tipoUsuario);
                usuarioscadastrados.add(produto);  
            
    }

     public void buscarUsuario (String MatriculaBuscar){
      
               UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();               
               int i;
                 for (i = 0; i < fabricaconcreta.getUsuariosCadastrados().size(); i++) {  
                      if (fabricaconcreta.getUsuariosCadastrados().get(i).getMatricula().equals(MatriculaBuscar)){
                   JOptionPane.showMessageDialog(null,fabricaconcreta.getUsuariosCadastrados().get(i).toString());
               } 
                 }
         
     }
       
     public void alteraUsuario (String MatriculaAlterar){
               
               int tipoUsuarioAlterar=0;
               boolean encontrou=false;
               int i;
               UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
               fabricaconcreta.getUsuariosCadastrados();
                    for (i = 0; i < fabricaconcreta.getUsuariosCadastrados().size() || encontrou!=true; i++) {  
                      if (fabricaconcreta.getUsuariosCadastrados().get(i).getMatricula()==MatriculaAlterar){
                             tipoUsuarioAlterar = fabricaconcreta.getUsuariosCadastrados().get(i).getTipoUsuario();
                             fabricaconcreta.getUsuariosCadastrados().remove(i);
                                encontrou=true;
                       }
                 }  
                    if(encontrou==true){
                    fabricaconcreta.criarUsuario(tipoUsuarioAlterar);
                    }  
}
      
     public ArrayList<UsuarioProdutoConcreto> getUsuariosCadastrados() {
        return usuarioscadastrados;
    }
     
     public void setUsuariosCadastrados(ArrayList<UsuarioProdutoConcreto> UsuariosCadastrados) {
        this.usuarioscadastrados = UsuariosCadastrados;
    }

}
