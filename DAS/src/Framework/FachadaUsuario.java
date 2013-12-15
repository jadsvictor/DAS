package Framework;
import Usuario.UsuarioFabricaConcreta;

public class FachadaUsuario {
    
 UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
 
    public void criarProdutoFachada (int tipoUsuario){ 
        fabricaconcreta.criarUsuario(tipoUsuario);
    }
    
     public void alterarProdutoFachada (String MatriculaAlterar){
        fabricaconcreta.alteraUsuario(MatriculaAlterar);
    }
    
     public void buscarProdutoFachada (String MatriculaAlterar){
         fabricaconcreta.buscarUsuario(MatriculaAlterar);
     }
     
     public void excluirProdutoFachada(String MatriculaExcluir){
         fabricaconcreta.excluirUsuario(MatriculaExcluir);
     }
     
}
