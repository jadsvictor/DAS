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
    
     public static void Alocacao() {

    boolean produtoJaAlocado = false;
    boolean achouRecurso = false;
    boolean achouUsuario = false ;
    
    //pesquisando recurso 
    
    AlocacaodeRecursos alocacao = new AlocacaodeRecursos(null,null,null);
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
    fabricaconcreta.getRecursosCadastrados();
    alocacao.recurso = JOptionPane.showInputDialog("Informe o numero do patrimonio do recurso que deseja alocar");
        for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) { 
             if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(alocacao.recurso)){
                 achouRecurso = true;
                 JOptionPane.showMessageDialog(null, "entrou no laco");
                 break;
             }
        }
        JOptionPane.showMessageDialog(null, "saiu do laco");
    //pesquisando usuario
    UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
    alocacao.usuario = JOptionPane.showInputDialog("Inform a matricula do usuario que deseja alocar");
        for (int j = 0; j < fabricaconcretaU.getUsuariosCadastrados().size(); j++) {  
             if (fabricaconcretaU.getUsuariosCadastrados().get(j).getMatricula().equals(alocacao.usuario)){
                JOptionPane.showMessageDialog(null, "entrou no laco2");                 
                 achouUsuario = true;
                 break;
             } 
             JOptionPane.showMessageDialog(null, "saiu do laco2");
        }
    
         JOptionPane.showMessageDialog(null, "saiu do usuario");
    //definindoDatas
        alocacao.alocarData = JOptionPane.showInputDialog("informar data");
       JOptionPane.showMessageDialog(null, "seto data");
       // metodo verificar
       if (achouRecurso==true && achouUsuario==true){
           JOptionPane.showMessageDialog(null, "entro no if true");
        for (int k=0; k<alocacoes.size();k++){
            JOptionPane.showMessageDialog(null, "entro no for");
            if (alocacoes.get(k).getRecurso().equals(alocacao.getRecurso())){
                if (alocacoes.get(k).getAlocarData().equals(alocacao.getAlocarData())){
                    JOptionPane.showMessageDialog(null, "Produto já esta alocado para essa data");
                    produtoJaAlocado =true;
                }
            }
        }
        if (produtoJaAlocado==false){
            JOptionPane.showMessageDialog(null, "aloco");
          alocacoes.add(alocacao);
        }     
      }    }

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

    @Override
    public String toString() {
        return "AlocacaodeRecursos:" + 
                "recurso: " + recurso + 
                "Solicitante: " + usuario + 
                "Dia: " + alocarData;
    }

    
  
    
}


