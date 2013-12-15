package Framework;
import Usuario.UsuarioFabricaConcreta;

public class FachadaUsuario {
    
 UsuarioFabricaConcreta fabricaconcreta = new UsuarioFabricaConcreta();
 
    public void criarProdutoFachada (int tipoRecurso){ 
        fabricaconcreta.criarUsuario(tipoRecurso);
    }
    
     public void alterarProdutoFachada (String Matricula){
        fabricaconcreta.alteraUsuario(Matricula);
    
    }
    
}
