package Usuario;

import Framework.UsuarioFabricaAbstrata;
import Framework.UsuarioProdutoAbstrato;
import javax.swing.JOptionPane;

public class UsuarioFabricaConcreta extends UsuarioFabricaAbstrata{

    @Override
    public UsuarioProdutoAbstrato factoryMethod(int tipoUsuario) {       
        switch (tipoUsuario){
           case 1:
               UsuarioProfessor usuarioprofessor = new UsuarioProfessor(null, tipoUsuario, null, null);
               usuarioprofessor.setNome(JOptionPane.showInputDialog("Nome do Professor"));
               usuarioprofessor.setMatricula(JOptionPane.showInputDialog("Matricula do Professor"));
               usuarioprofessor.setMateriaLeciona(JOptionPane.showInputDialog("Materia que Leciona"));
               return usuarioprofessor; 
           
           case 2:  
                UsuarioAluno usuarioaluno = new UsuarioAluno(0, tipoUsuario, null, null);               
                usuarioaluno.setNome(JOptionPane.showInputDialog("Nome do Aluno"));
                usuarioaluno.setMatricula(JOptionPane.showInputDialog("Matricula do Aluno"));
                usuarioaluno.setSemestreCursando(Integer.parseInt(JOptionPane.showInputDialog("Informe semestre do aluno")));
                return usuarioaluno;
           
           default: 
                   return null;
               
    }    }

}
