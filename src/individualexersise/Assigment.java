/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualexersise;

import individualexersise.AboutAll;

/**
 *
 * @author Μαρια
 */
public class Assigment  extends AboutAll {
    
    
      String assigmentName ;
String description="5 pages essay";
String subDateTime="04/12/2019";
   int OralMark=20;
   int totalMark=100;

    public String getAssigmentName() {
        return assigmentName;
    }

    public Assigment(String assigmentName, String description, String subDateTime, int OralMark, int totalMark) {
        this.assigmentName = assigmentName;
        this.description = description;
        this.subDateTime = subDateTime;
        this.OralMark = OralMark;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assigment{" + "assigmentName=" + assigmentName + ", description=" + description + ", subDateTime=" + subDateTime + ", OralMark=" + OralMark + ", totalMark=" + totalMark + '}';
    }

    public void setAssigmentName(String assigmentName) {
        this.assigmentName = assigmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return OralMark;
    }

    public void setOralMark(int OralMark) {
        this.OralMark = OralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }
    

   
    }
    


