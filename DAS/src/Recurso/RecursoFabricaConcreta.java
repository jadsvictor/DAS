package Recurso;

import Framework.RecursoFabricaAbstrata;
import Framework.RecursoProdutoAbstrato;



public class RecursoFabricaConcreta extends RecursoFabricaAbstrata {

    @Override
    public  RecursoProdutoAbstrato factoryMethod(int tipoRecurso) {
       switch (tipoRecurso){
           case 1:
               return new RecursoProjetor(); 
           
           case 2:    
               return new RecursoSala();
           
           default: 
                   return null;
               
    }
    }
}
