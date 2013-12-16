package Framework;

import Recurso.RecursoFabricaConcreta;
import Usuario.UsuarioFabricaConcreta;
import java.util.ArrayList;
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
                 break;
             }
        }
    //pesquisando usuario
    UsuarioFabricaConcreta fabricaconcretaU = new UsuarioFabricaConcreta();
    alocacao.usuario = JOptionPane.showInputDialog("Inform a matricula do usuario que deseja alocar");
        for (int j = 0; j < fabricaconcretaU.getUsuariosCadastrados().size(); j++) {  
             if (fabricaconcretaU.getUsuariosCadastrados().get(j).getMatricula().equals(alocacao.usuario)){
                 achouUsuario = true;
                 break;
             } 
        }
    
    //definindoDatas
        alocacao.alocarData = JOptionPane.showInputDialog("informar data");
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
            JOptionPane.showMessageDialog(null,alocacao.toString());
          alocacoes.add(alocacao);
        }     
      }    }
     
     public static void removerAlocacao(){
     
        boolean produtoJaAlocado = false;
    boolean achouRecurso = false;
    boolean achouUsuario = false ;
    
    //pesquisando recurso 
    
    AlocacaodeRecursos alocacao = new AlocacaodeRecursos(null,null,null);
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
    fabricaconcreta.getRecursosCadastrados();
    alocacao.recurso = JOptionPane.showInputDialog("Informe o numero do patrimonio do recurso que deseja desalocar");
        for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) { 
             if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(alocacao.recurso)){
                 achouRecurso = true;
                 break;
             }
        }
    
    //definindoDatas
        alocacao.alocarData = JOptionPane.showInputDialog("informar data");
       // metodo verificar
       if (achouRecurso==true){
        for (int k=0; k<alocacoes.size();k++){
            if (alocacoes.get(k).getRecurso().equals(alocacao.getRecurso())){
                if (alocacoes.get(k).getAlocarData().equals(alocacao.getAlocarData())){
                    int confirma = Integer.parseInt(JOptionPane.showInputDialog("Confirmar exclusao de alocacao? \n1-sim \n2-nao "));
                    if (confirma==1){
                    alocacoes.remove(k);
                    }
                
                }
            }
        }
      }  
     
     }
     
     public static void listarAlocacao(){
     
      AlocacaodeRecursos alocacao = new AlocacaodeRecursos(null,null,null);
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
    fabricaconcreta.getRecursosCadastrados();
    for (int l=0; l<alocacoes.size();l++){
    
        JOptionPane.showMessageDialog(null, alocacoes.get(l).toString());
    }
     
     }

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
        return "\nAlocacaodeRecursos:" + 
                "\nrecurso: " + recurso + 
                "\nSolicitante: " + usuario + 
                "\nDia: " + alocarData;
    }

    
  
    
}


