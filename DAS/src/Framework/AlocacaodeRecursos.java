package Framework;

import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
import Usuario.UsuarioProdutoConcreto;
import Usuario.UsuarioFabricaConcreta;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class AlocacaodeRecursos {
  
 static ArrayList<AlocacaodeRecursos> alocacoes = new ArrayList<AlocacaodeRecursos> ();  
    
    String recurso;
    String usuario;
    String alocarData;   

    public AlocacaodeRecursos(String recurso, String usuario, String alocarData) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.alocarData = alocarData;
    }

    public static ArrayList<AlocacaodeRecursos> getAlocacoes() {
        return alocacoes;
    }

    public static void setAlocacoes(ArrayList<AlocacaodeRecursos> alocacoes) {
        AlocacaodeRecursos.alocacoes = alocacoes;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAlocarData() {
        return alocarData;
    }

    public void setAlocarData(String alocarData) {
        this.alocarData = alocarData;
    }

    
  
    
}


