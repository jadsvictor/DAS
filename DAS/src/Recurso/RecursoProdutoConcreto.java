/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recurso;

import Framework.RecursoProdutoAbstrato;

/**
 *
 * @author Ramaiane
 */
public class RecursoProdutoConcreto extends RecursoProdutoAbstrato {

    public RecursoProdutoConcreto(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio) {
        super(tipoRecurso, nomeRecurso, descricaoRecurso, numeroPatrimonio);
    }
    
}
