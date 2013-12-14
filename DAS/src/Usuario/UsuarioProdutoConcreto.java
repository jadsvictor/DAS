package Usuario;

import Framework.UsuarioProdutoAbstrato;

public class UsuarioProdutoConcreto extends UsuarioProdutoAbstrato{

    public UsuarioProdutoConcreto(int tipoUsuario, String nome, String matricula) {
        super(tipoUsuario, nome, matricula);
    }


}
