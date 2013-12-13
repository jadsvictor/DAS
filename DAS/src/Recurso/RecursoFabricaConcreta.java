package Recurso;

import Framework.RecursoFabricaAbstrata;
import Framework.RecursoProdutoAbstrato;



public class RecursoFabricaConcreta extends RecursoFabricaAbstrata {

    @Override
    public  RecursoProdutoAbstrato factoryMethod(int tipoRecurso) {
       switch (tipoRecurso){
           case 1:
               return new RecursoProjetor(tipoRecurso, null, null, null, null); 
           
           case 2:    
               return new RecursoSala(tipoRecurso, null, null, null,null, tipoRecurso, null);
           
           default: 
                   return null;
               
    }
    }
}
