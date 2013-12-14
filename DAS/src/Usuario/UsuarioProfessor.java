package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioProfessor extends UsuarioProdutoAbstrato {

    String materiaLeciona;

    public UsuarioProfessor(String materiaLeciona, int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
        this.materiaLeciona = materiaLeciona;
    }

    public String getMateriaLeciona() {
        return materiaLeciona;
    }

    public void setMateriaLeciona(String materiaLeciona) {
        this.materiaLeciona = materiaLeciona;
    }
    
     public String toString() {
            return "Tipo de Usuario:Professor" + 
                "\n Nome do Professor = " + nome + 
                "\n Matricula do Professor = " + matricula +
                "\n Matéria Lecionada = " +  materiaLeciona;
           }  
}
