package Framework;

public class UsuarioProdutoAbstrato {
	
        private int tipoUsuario;
	public String nome;
	public String matricula;

    public UsuarioProdutoAbstrato(int tipoUsuario, String nome, String matricula) {
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
    public String Imprimir() {
            return "Usuario:" + 
                "\n Tipo do Usuario = " + tipoUsuario + 
                "\n Nome do Usuario = " + nome + 
                "\n Matricula do Usuario = " + matricula ;
           }  
}
