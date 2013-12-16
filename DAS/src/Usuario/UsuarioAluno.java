package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioAluno extends UsuarioProdutoConcreto{
		
    String semestreEntrada;
    String curso;

    public UsuarioAluno(String semestreEntrada, String curso, int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
        this.semestreEntrada = semestreEntrada;
        this.curso = curso;
    }

    public String getSemestreEntrada() {
        return semestreEntrada;
    }

    public void setSemestreEntrada(String semestreEntrada) {
        this.semestreEntrada = semestreEntrada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
    public String toString() {
            return "\nTipo de Usuario:Aluno" + 
                "\n Nome do Aluno = " + nome + 
                "\n Matricula do Aluno = " + matricula +
                "\n Curso do Aluno = " + curso +
                "\n Semestre de Entrada = " +  semestreEntrada;
           }  
}
