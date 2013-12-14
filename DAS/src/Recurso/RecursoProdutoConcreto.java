package Recurso;

import Framework.RecursoProdutoAbstrato;

public class RecursoProdutoConcreto extends RecursoProdutoAbstrato {

    public RecursoProdutoConcreto(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio) {
        super(tipoRecurso, nomeRecurso, descricaoRecurso, numeroPatrimonio);
    }
    
}
