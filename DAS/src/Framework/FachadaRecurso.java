package Framework;

import Recurso.RecursoFabricaConcreta;

public class FachadaRecurso {
    
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
     private RecursoProdutoAbstrato produto;
     
    public void criarProdutoFachada (int tipoRecurso){ 
        fabricaconcreta.criarProduto(tipoRecurso);
    }
}
