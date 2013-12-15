package Framework;

import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
import Usuario.UsuarioProdutoConcreto;
import Usuario.UsuarioFabricaConcreta;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Alocacao {
  
 static ArrayList<Alocacao> alocacoes = new ArrayList<Alocacao> ();  
    
    String recurso;
    String usuario;
    String alocarData;

public void alocar (){
    
    Alocacao alocacao= null;
    String numeroPatrimonioAlocar= null;
    String matriculaUsuarioAlocar= null;
    boolean produtoJaAlocado = false;
    boolean achouRecurso = false;
    boolean achouUsuario = false ;
    
    //pesquisando recurso 
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
    numeroPatrimonioAlocar = JOptionPane.showInputDialog("Informe o numero do patrimonio do recurso que deseja alocar");
        for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size() || achouRecurso == false ; i++) { 
             if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(numeroPatrimonioAlocar)){
                 alocacao.setRecurso(numeroPatrimonioAlocar);
                 achouRecurso = true;
             }
        }
        if (achouRecurso==false){
            JOptionPane.showMessageDialog(null, "Numero do patrimonio nao encontrado");
        }
        
    //pesquisando usuario
    UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
    matriculaUsuarioAlocar = JOptionPane.showInputDialog("Inform a matricula do usuario que deseja alocar");
        for (int j = 0; j < fabricaconcretaU.getUsuariosCadastrados().size()|| achouUsuario==false; j++) {  
             if (fabricaconcretaU.getUsuariosCadastrados().get(j).getMatricula().equals(matriculaUsuarioAlocar)){
                 alocacao.setUsuario(matriculaUsuarioAlocar);
                 achouUsuario = true;
             } 
        }
         if (achouUsuario==false){
            JOptionPane.showMessageDialog(null, "Matricula do usuario nao encontrado");
             }
         
    //definindoDatas
        alocacao.setAlocarData(JOptionPane.showInputDialog("Informe o dia que o recurso sera alocado"));
        
       
       // metodo verificar
       if (achouRecurso==true && achouUsuario==true){
        for (int k=0; k<alocacoes.size();k++){
            if (alocacoes.get(k).getRecurso().equals(alocacao.getRecurso())){
                if (alocacoes.get(k).getAlocarData().equals(alocacao.getAlocarData())){
                    JOptionPane.showMessageDialog(null, "Produto já esta alocado para essa data");
                    produtoJaAlocado =true;
                }
            }
        }
        if (produtoJaAlocado==false){
          alocacoes.add(alocacao);
        }     
      }
}

    public Alocacao(String recurso, String usuario, String alocarData) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.alocarData = alocarData;
    }

    public static ArrayList<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public static void setAlocacoes(ArrayList<Alocacao> alocacoes) {
        Alocacao.alocacoes = alocacoes;
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


