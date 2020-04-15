/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualexersise;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Μαρια
 */
public class AllTheClassesInOne extends AboutAll{
    
    Course course;
    ArrayList<Student>student=new ArrayList <>();
    ArrayList <Trainer>trainer=new ArrayList<>();
    ArrayList <Assigment>aassigment=new ArrayList<>();

    public AllTheClassesInOne(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Assigment> getAassigment() {
        return aassigment;
    }

    public void setAassigment(ArrayList<Assigment> aassigment) {
        this.aassigment = aassigment;
    }

 public static void dateChecker(String input) throws ParseException { String format = "dd/MM/yyyy";SimpleDateFormat df = new SimpleDateFormat(format);
Date date = df.parse(input);
Calendar cal = Calendar.getInstance();
cal.setTime(date);
int daySc = cal.get(Calendar.DAY_OF_WEEK);
int yearSc = cal.get(Calendar.WEEK_OF_YEAR);        
System.out.println(daySc);        
System.out.println(yearSc); 
if ( daySc==1) {  yearSc = yearSc - 1;
  }
 }
    }

