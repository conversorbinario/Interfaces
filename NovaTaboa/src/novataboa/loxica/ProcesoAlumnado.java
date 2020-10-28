/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novataboa.loxica;

import java.util.ArrayList;
import java.util.List;
import novataboa.dto.Alumno;

/**
 *
 * @author manuel
 */
public class ProcesoAlumnado {
    
    
   private static ArrayList<Alumno> alumnado = new ArrayList<>();
    
   
     public static void engadirAlumno(Alumno cliente) {
        alumnado.add(cliente);
    }
      // StudentTableModelGeneric stm= (StudentTableModelGeneric)jTable1.getModel();
     //   jTable1.setModel(stm);

    public static ArrayList<Alumno> getAlumnado() {
        return alumnado;
    }
    
}
