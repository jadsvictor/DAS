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
}
