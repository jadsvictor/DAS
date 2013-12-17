package Recurso;


public class RecursoSala extends RecursoProdutoConcreto{
        
        private String numeroSala;
	private String andarSala;
	private String nomePredio;

    public RecursoSala(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio,String numeroSala, String andarSala, String nomePredio) {
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

    public String getAndarSala() {
        return andarSala;
    }

    public void setAndarSala(String andarSala) {
        this.andarSala = andarSala;
    }

    public String getNomePredio() {
        return nomePredio;
    }

    public void setNomePredio(String nomePredio) {
        this.nomePredio = nomePredio;
    }

    @Override
    public String toString() {
        return "\nTipo de Recurso: Sala" + 
                "\n nome da Sala: "+nomeRecurso+
                "\n descricao da Sala: "+descricaoRecurso+
                "\n numero do Patrimonio: "+numeroPatrimonio+
                "\n numero da Sala: " + numeroSala + 
                "\n andar da Sala: " + andarSala + 
                "\n nomePredio: " + nomePredio ;
    }
        
        
}
