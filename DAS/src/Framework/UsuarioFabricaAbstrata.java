package Framework;

import Usuario.UsuarioFabricaConcreta;
import java.util.ArrayList;

public abstract class UsuarioFabricaAbstrata {
    
    ArrayList<UsuarioProdutoAbstrato> UsuariosCadastrados = new ArrayList<UsuarioProdutoAbstrato> ();

    public abstract UsuarioProdutoAbstrato factoryMethod (int tipoUsuario);
    
     public void criarUsuario (int tipoUsuario){
    	         
	        // Create the factory object
	        UsuarioFabricaConcreta fabrica = new UsuarioFabricaConcreta();
	        
	        // criando produto abstrato         
	        UsuarioProdutoAbstrato produto = null;        
                
                produto = fabrica.factoryMethod(tipoUsuario);
         
           
            UsuariosCadastrados.add(produto);  
            
    }
    
}
