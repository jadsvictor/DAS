package Framework;
import Usuario.UsuarioFabricaConcreta;

public class FachadaUsuario {
    
 UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
 
    public void criarProdutoFachada (int tipoRecurso){ 
        fabricaconcreta.criarUsuario(tipoRecurso);
    }
    
     public void alterarProdutoFachada (String MatriculaAlterar){
        fabricaconcreta.alteraUsuario(MatriculaAlterar);
    }
    
     public void buscarProdutoFachada (String MatriculaAlterar){
         fabricaconcreta.buscarUsuario(MatriculaAlterar);
     }
     
}
