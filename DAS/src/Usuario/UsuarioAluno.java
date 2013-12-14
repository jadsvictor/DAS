package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioAluno extends UsuarioProdutoAbstrato {
		
    int semestreCursando;

    public UsuarioAluno(int semestreCursando, int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
        this.semestreCursando = semestreCursando;
    }

    public int getSemestreCursando() {
        return semestreCursando;
    }

    public void setSemestreCursando(int semestreCursando) {
        this.semestreCursando = semestreCursando;
    }
   
    public String toString() {
            return "Tipo de Usuario:Aluno" + 
                "\n Nome do Aluno = " + nome + 
                "\n Matricula do Aluno = " + matricula +
                "\n Semestre Cursando = " +  semestreCursando;
           }  
}
