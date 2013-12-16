package Framework;

public abstract class RecursoProdutoAbstrato {
	
        private int tipoRecurso;
	public String nomeRecurso;
	public String descricaoRecurso;
	public String numeroPatrimonio;

    public RecursoProdutoAbstrato(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio) {
        this.tipoRecurso = tipoRecurso;
        this.nomeRecurso = nomeRecurso;
        this.descricaoRecurso = descricaoRecurso;
        this.numeroPatrimonio = numeroPatrimonio;
    }

    public int getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(int tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getNomeRecurso() {
        return nomeRecurso;
    }

    public void setNomeRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }

    public String getDescricaoRecurso() {
        return descricaoRecurso;
    }

    public void setDescricaoRecurso(String descricaoRecurso) {
        this.descricaoRecurso = descricaoRecurso;
    }

    public String getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNumeroPatrimonio(String numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }

   public String Imprimir() {
            return "\nRecurso:" + 
                "\n nome do Recurso = " + nomeRecurso + 
                "\n descricao do Recurso = " + descricaoRecurso + 
                "\n numero do Patrimonio = " + numeroPatrimonio ;
           }  

     
        

}
