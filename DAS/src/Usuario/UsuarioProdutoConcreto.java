package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioProdutoConcreto extends UsuarioProdutoAbstrato{

    public UsuarioProdutoConcreto(int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
    }

    public void setMateriaLeciona(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAreaAtuacao(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSemestreEntrada(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCurso(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
