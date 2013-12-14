package Recurso;

import Framework.RecursoProdutoAbstrato;


public class RecursoProjetor extends RecursoProdutoConcreto {
	
	private String marca;

    public RecursoProjetor(int tipoRecurso, String nomeRecurso, String descricaoRecurso, String numeroPatrimonio, String marca) {
        super(tipoRecurso, nomeRecurso, descricaoRecurso, numeroPatrimonio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
        
        public String toString() {
            return "Recurso: Projetor" + 
                "\n nome do Recurso: "+nomeRecurso+
                "\n descricao do Recurso: "+descricaoRecurso+
                "\n numero do Patrimonio: "+numeroPatrimonio+
                "\n marca: " + marca;
                    
           }          
               
                
    }
    
    


