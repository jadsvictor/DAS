package Framework;

import Recurso.RecursoFabricaConcreta;
import Recurso.RecursoProdutoConcreto;
import Usuario.UsuarioProdutoConcreto;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Alocacao {
  
 static ArrayList<Alocacao> alocacao = new ArrayList<Alocacao> ();  
    
    String recurso;
    String usuario;
    Date dataInicio;
    Date dataFim;
    String horaInicio;
    String horaFim;

public void alocar (){
    
    RecursoFabricaConcreta fabricaconcreta = new RecursoFabricaConcreta();
    String numeroPatrimonioAlocar= null;
    numeroPatrimonioAlocar = JOptionPane.showInputDialog("Informe o numero do patrimonio do recurso que deseja alocar");
        for (int i = 0; i < fabricaconcreta.getRecursosCadastrados().size(); i++) { 
             if (fabricaconcreta.getRecursosCadastrados().get(i).numeroPatrimonio.equals(numeroPatrimonioAlocar)){
                 recurso = numeroPatrimonioAlocar;
             }
        }    
}
    
    public Alocacao(Date dataInicio, Date dataFim, String horaInicio, String horaFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
    
}


