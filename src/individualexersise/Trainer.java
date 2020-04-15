/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualexersise;

import individualexersise.AboutAll;

import java.util.ArrayList;


public class Trainer extends AboutAll {

   
    String trainerName;
    String trainerSurname;
  public  int trainerCourse;

    public Trainer(String trainerName, String trainerSurname, int trainerCourse) {
        
        this.trainerName = trainerName;
        this.trainerSurname = trainerSurname;
        this.trainerCourse = trainerCourse;
    }

    @Override
    public String toString() {
        return "Trainer{" + "The name of the trainer is " + trainerName + ",and surname " + trainerSurname + ", this semester will teach in course " + trainerCourse + '}';
    }

    
    }


    

    
    

    

   
    


      

//  
//    
//
  

  

    
  
    

