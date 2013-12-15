package Usuario;

import Framework.UsuarioFabricaAbstrata;
import Framework.UsuarioProdutoAbstrato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioFabricaConcreta extends UsuarioFabricaAbstrata{
    
    ArrayList<UsuarioProdutoConcreto> usuarioscadastrados = new ArrayList<UsuarioProdutoConcreto> ();

    @Override
    public UsuarioProdutoAbstrato factoryMethod(int tipoUsuario) {       
        switch (tipoUsuario){
           case 1:
               UsuarioProfessor usuarioprofessor = new UsuarioProfessor(null, null, tipoUsuario, null, null);
               usuarioprofessor.setNome(JOptionPane.showInputDialog("Nome do Professor"));
               usuarioprofessor.setMatricula(JOptionPane.showInputDialog("Matricula do Professor"));
                usuarioprofessor.setAreaAtuacao(JOptionPane.showInputDialog("Area de atuacao"));
               usuarioprofessor.setMateriaLeciona(JOptionPane.showInputDialog("Materia que Leciona"));
               return usuarioprofessor; 
           
           case 2:  
                UsuarioAluno usuarioaluno = new UsuarioAluno(null, null, tipoUsuario, null, null);               
                usuarioaluno.setNome(JOptionPane.showInputDialog("Nome do Aluno"));
                usuarioaluno.setMatricula(JOptionPane.showInputDialog("Matricula do Aluno"));
                usuarioaluno.setSemestreEntrada(JOptionPane.showInputDialog("Informe semestre do aluno"));
                usuarioaluno.setCurso(JOptionPane.showInputDialog("Informe o curso do aluno"));
                return usuarioaluno;
           
           default: 
                   return null;
               
    }    }

     public void criarUsuario(int tipoUsuario){
    	         
	        // Create the factory object
	        UsuarioFabricaConcreta fabrica = new UsuarioFabricaConcreta();
	        
	        // criando produto abstrato         
	        UsuarioProdutoConcreto produto = null; 
                
                produto = (UsuarioProdutoConcreto) fabrica.factoryMethod(tipoUsuario);
                usuarioscadastrados.add(produto);  
            
    }

        public ArrayList<UsuarioProdutoConcreto> getUsuariosCadastrados() {
        return usuarioscadastrados;
    }

    public void setUsuariosCadastrados(ArrayList<UsuarioProdutoConcreto> UsuariosCadastrados) {
        this.usuarioscadastrados = UsuariosCadastrados;
    }

    
    
}
