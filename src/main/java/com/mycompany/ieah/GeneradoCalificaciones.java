/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ieah;

/**
 *
 * @author T107
 */

public class GeneradoCalificaciones {
    Evaluacion e;

    public GeneradoCalificaciones() {
       
    }

    public GeneradoCalificaciones(Evaluacion e) {
        this.e = e;
        
  new Evaluacion("Petra","5.8");
  new Evaluacion("Jose","7.4");
  new Evaluacion("Roberta","8.6");  
    }
 
}











public class Insertar {
    public static void main(String args[]){
    SessionFactory sesion=    NewHibernateUtil.getSessionFactory();
  Session mala=  sesion.openSession();
  Transaction t=mala.beginTransaction();
  
                 mala.save(new Trabajador("juan", "campos", "martinez"));
             t.commit();
                 sesion.close();
                 System.out.println("Se ha guardado este trabajadorcito");
    }
}
