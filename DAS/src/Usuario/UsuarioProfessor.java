package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioProfessor extends UsuarioProdutoConcreto{

    String materiaLeciona;
    String areaAtuacao;

    public UsuarioProfessor(String materiaLeciona, String areaAtuacao, int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
        this.materiaLeciona = materiaLeciona;
        this.areaAtuacao = areaAtuacao;
    }

    public String getMateriaLeciona() {
        return materiaLeciona;
    }

    public void setMateriaLeciona(String materiaLeciona) {
        this.materiaLeciona = materiaLeciona;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
       
     public String toString() {
            return "Tipo de Usuario:Professor" + 
                "\n Nome do Professor = " + nome + 
                "\n Matricula do Professor = " + matricula +
                "\n Area de atuacao = " + areaAtuacao +    
                "\n Matéria Lecionada = " +  materiaLeciona;
           }  
}
