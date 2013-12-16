package Framework;

import Recurso.RecursoFabricaConcreta;

public class FachadaRecurso {
     RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
     
    public void criarProdutoFachada (int tipoRecurso){ 
        fabricaconcreta.criarProduto(tipoRecurso);
    }
    
    public void alterarProdutoFachada (String NumeroPatrimonioAlterar){
        fabricaconcreta.alteraRecurso(NumeroPatrimonioAlterar);
    
    }
    
    public void buscarRecursoFachada (String NumeroPatrimonioBuscar){
        fabricaconcreta.buscarRecurso(NumeroPatrimonioBuscar);
        
    
    }
    
    public void excluirRecursoFachada (String NumeroPatrimonioExcluir){

        fabricaconcreta.excluirRecurso(NumeroPatrimonioExcluir);
    }
}
