package Framework;

import Usuario.UsuarioFabricaConcreta;
import java.util.ArrayList;

public abstract class UsuarioFabricaAbstrata {
    
   

    public abstract UsuarioProdutoAbstrato factoryMethod (int tipoUsuario);
       
}
