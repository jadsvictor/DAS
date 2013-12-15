package Framework;
import Usuario.UsuarioFabricaConcreta;

public class FachadaUsuario {
    
 UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
 
    public void criarProdutoFachada (int tipoUsuario){ 
        fabricaconcretaU.criarUsuario(tipoUsuario);
    }
    
     public void alterarProdutoFachada (String MatriculaAlterar){
        fabricaconcretaU.alteraUsuario(MatriculaAlterar);
    }
    
     public void buscarProdutoFachada (String MatriculaAlterar){
         fabricaconcretaU.buscarUsuario(MatriculaAlterar);
     }
     
     public void excluirProdutoFachada(String MatriculaExcluir){
         fabricaconcretaU.excluirUsuario(MatriculaExcluir);
     }
     
}
