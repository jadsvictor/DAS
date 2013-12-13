package Recurso;

import Framework.RecursoProdutoAbstrato;

public class RecursoSala extends RecursoProdutoAbstrato{
        
        private String numeroSala;
	private int andarSala;
	private String nomePredio;

    public RecursoSala(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio,String numeroSala, int andarSala, String nomePredio) {
        super(tipoRecurso, nomeRecurso, descricaoRecurso, numeroPatrimonio);
        this.numeroSala = numeroSala;
        this.andarSala = andarSala;
        this.nomePredio = nomePredio;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getAndarSala() {
        return andarSala;
    }

    public void setAndarSala(int andarSala) {
        this.andarSala = andarSala;
    }

    public String getNomePredio() {
        return nomePredio;
    }

    public void setNomePredio(String nomePredio) {
        this.nomePredio = nomePredio;
    }
        
        
}
