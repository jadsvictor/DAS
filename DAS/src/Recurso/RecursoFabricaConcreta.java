package Recurso;

import Framework.RecursoFabricaAbstrata;
import Framework.RecursoProdutoAbstrato;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class RecursoFabricaConcreta extends RecursoFabricaAbstrata {
    
    @Override
    public  RecursoProdutoAbstrato factoryMethod(int tipoRecurso) {
       switch (tipoRecurso){
           case 1:
               RecursoProjetor recursoprojetor = new RecursoProjetor(tipoRecurso, null, null, null, null);
               recursoprojetor.setDescricaoRecurso(JOptionPane.showInputDialog("Descrição do Projetor"));
               recursoprojetor.setMarca(JOptionPane.showInputDialog("Marca do Projetor"));
               recursoprojetor.setNomeRecurso(JOptionPane.showInputDialog("Informe o Nome"));
               recursoprojetor.setNumeroPatrimonio(JOptionPane.showInputDialog("Informe o Numero do patrimonio"));
               RecursosCadastrados.add(recursoprojetor);
               JOptionPane.showMessageDialog(null, recursoprojetor.toString());
              return recursoprojetor; 
              
           case 2:  
               //cria produto
                RecursoSala recursosala = new RecursoSala(tipoRecurso, null, null, null,null, null, null);
                
                recursosala.setDescricaoRecurso(JOptionPane.showInputDialog("Descrição da Sala"));
                recursosala.setNomeRecurso(JOptionPane.showInputDialog("Informe o Nome"));
                recursosala.setNumeroPatrimonio(JOptionPane.showInputDialog("Informe o Numero do patrimonio"));
                recursosala.setAndarSala(JOptionPane.showInputDialog("Informe o andar da sala"));
                recursosala.setNomePredio(JOptionPane.showInputDialog("Informe o nome do predio"));
                recursosala.setNumeroSala(JOptionPane.showInputDialog("Informe o Numero da sala"));
                RecursosCadastrados.add(recursosala);
                JOptionPane.showMessageDialog(null, recursosala.toString());
               return recursosala;
               
           
           default: 
                   return null;
               
    }         
    }

    
    
}
