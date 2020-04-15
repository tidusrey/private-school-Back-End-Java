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
public class Student extends AboutAll {
      String name;
    String surname;
    int fees;
    String birthday;
    int lesson;

    public Student(String name, String surname, int fees, String birthday, int lesson) {
        this.name = name;
        this.surname = surname;
        this.fees = fees;
        this.birthday = birthday;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", fees=" + fees + ", birthday=" + birthday + ", lesson=" + lesson + '}';
    }
 
    
    }
    
