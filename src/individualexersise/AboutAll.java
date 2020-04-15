/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualexersise;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Μαρια
 */
public class AboutAll extends Object{

   
     public static void choice(){
                ArrayList<Student>allStudents=new ArrayList<>();
                allStudents.add(new Student("Greg","Bouradas",2500,"22/06/1988",2));
                allStudents.add(new Student("Nikos","Papaiwanou",2500,"22/04*1990",1));
                allStudents.add(new Student("Anastasios","Protopappas",2500,"14/08/1985",4));
                allStudents.add(new Student("Maria","Kaloghrou",2500,"02/02/1989",3));
                allStudents.add(new Student("Dimitris","Katsimalis",2500,"10/12/2000",3));
                allStudents.add(new Student("Despoina","Synodinou",2500,"15/09/1992",2));
                allStudents.add(new Student("Euaggelos","Mpotsios",2500,"05/06/1993",1));
                allStudents.add(new Student("Alexandra","Mylo",2500,"07/08/1996",2));
                allStudents.add(new Student("Gewrgia","Giakoumatou",2500,"17/03/1990",4));
                allStudents.add(new Student("Kwstas","Poluxroniou",2500,"01/01/2000",3));
       
    
            ArrayList<Course>courses =new ArrayList<>();
            courses.add(new Course("Cb9","Java","Full time","22/06/2019","28/06/2019"));
            courses.add(new Course ("Cb9","Java","Part time","22/06/2019","28/06/2019"));
            courses.add(new Course("Cb9","C#","Full time","22/06/2019","28/06/2019"));
            courses.add(new Course("Cb9","C#","Part ime","22/06/2019","28/06/2019"));
   
        
                      ArrayList<Trainer> allTrainer=new ArrayList<>();
                      allTrainer.add(new Trainer("George","Iraklidhs",4));
                      allTrainer.add(new Trainer("Nikos","Papadopoulos",3));
                      allTrainer.add(new Trainer("Anarguros","Trapp",2));
                      allTrainer.add(new Trainer("Gregory","Pasparakis",1));
        
 ArrayList <Assigment>allAssigments=new ArrayList<>();
    allAssigments.add(new Assigment ("Torture in modern history","5 pages essay","04/12/2019",20,100));
    allAssigments.add(new Assigment("Torture of students days before Christmas","5 pages essay","04/12/2019",20,100));
    allAssigments.add(new Assigment ("Torture in ancient Greece","5 pages essay","04/12/2019",20,100));
    allAssigments.add(new Assigment ("Torture in form of Programming","5 pages essay","04/12/2019",20,100)); 
 

           
    Scanner sc=new Scanner (System.in);
        int choiceentry;

do {
    System.out.println("");
    System.out.println("Please enter");
    System.out.println("Press 1. For entering a new student"
          );
    System.out.println("Press 2. For printing out the list of our students");
    System.out.println("Press 3. Current students in each class");
    System.out.println("Press 4. For printing out the list of our trainers or adding another");
    System.out.println("Press 5. For printing our courses or adding another");
    System.out.println("Press 6. For printing which course has each trainer inside"); 
    System.out.println("Press 7. For printing the list of assignments or adding another");
    System.out.println("Press 8. For printing the list of which assigment exist in each course");
    System.out.println("Press 9..For printing which assigment has each student");

    System.out.println("Press 11.For terminating the program");
    choiceentry = sc.nextInt();
int x;
      OUTER:
      switch (choiceentry) {
          
          
          case 1://μαθητες και λιστες
                       
              System.out.println("For   entering a new student press 1.");
              int syntheticStudents;
              syntheticStudents=sc.nextInt();
              
              
              if(syntheticStudents==1){
              
              
              System.out.println("Insert the name of our new student");
              String name=sc.next();
              
              System.out.println("insert the surname of our new student");
              String surName =sc.next();
              
              System.out.println("Enter the fees needed for the semester");
              int fees=sc.nextInt();
              
              System.out.println("Enter please  the date of birth");
              String date=sc.next();
              for(Object a:courses){
              System.out.println(a);}

              int course=sc.nextInt();

              switch (course) {
                  case 1:
                     if (course==1){
                        
                         // System.out.println(courses.get(0));
              for(Student st : allStudents){
                  
                  if(st.lesson==1){
                     // System.out.println(st);
                     
                  }}}
                      
                      break;
                  case 2:
                       if (course==2){
                        // System.out.println(courses.get(1));
              for(Student st : allStudents){
                  
                  if(st.lesson==2){
                     // System.out.println(st);
                     
                  }}}
                      break;
                  case 3:
                      if (course==3){
                      // System.out.println(courses.get(2));
              for(Student st : allStudents){
                  
                  if(st.lesson==3){
                     // System.out.println(st);
                       System.out.println("-------------");
                  }}
                      }
                     
                      break;
                  case 4:
                      if(course==4){
                    // System.out.println(courses.get(3));
                      System.out.println("-------------");
              for(Student st : allStudents){
                  
                  if(st.lesson==4){
                    //  System.out.println(st);
                      System.out.println("-------------");
                  }}
                      }
                      
               Student st01 = new Student(name, surName,fees,date,course);
              allStudents.add(st01);
             System.out.println(st01);
                      break;
                  default:
                      System.out.println("Wrong input try again");
             break;
              }
                  System.out.println("Do you want an extra course ?");
                  System.out.println("Press 1. For yes adding another");
                  System.out.println("Press 2.For no and return to the menu" );
              int extraCourse=sc.nextInt();
              switch(extraCourse){
                  case 1:
                   
                     if (extraCourse==1){
                          System.out.println("Insert the name of our new student");
              String aname=sc.next();
              
              System.out.println("insert the surname of our new student");
              String asurName =sc.next();
              
              System.out.println("Enter the fees needed for the semester");
              int afees=sc.nextInt();
              
              System.out.println("Enter please  the date of birth as dd/mm/yy");
              String adate=sc.next();
                         System.out.println("Press a number:for each course");
              for(Object a:courses){
              System.out.println(a);}

               int acourse=sc.nextInt();
             
             
              switch (acourse) {
                  case 1:
                     if (acourse==1){
                        
                          System.out.println(courses.get(0));
              for(Student st : allStudents){
                  
                  if(st.lesson==1){
                      System.out.println(st);
                        System.out.println("-------------");
                  }}}
                      
                      break;
                  case 2:
                       if (acourse==2){
                         System.out.println(courses.get(1));
              for(Student st : allStudents){
                  
                  if(st.lesson==2){
                      System.out.println(st);
                        System.out.println("-------------");
                  }}}
                      break;
                  case 3:
                      if (acourse==3){
                       System.out.println(courses.get(2));
              for(Student st : allStudents){
                  
                  if(st.lesson==3){
                      System.out.println(st);
                        System.out.println("-------------");
                  }}
                      }
                     
                      break;
                  case 4:
                      if(acourse==4){
                     System.out.println(courses.get(3));
              for(Student st : allStudents){
                  
                  if(st.lesson==4){
                      System.out.println(st);
                        System.out.println("-------------");
                  }}}
                      
                      
              Student st01 = new Student(name, surName,fees,date,course);
              allStudents.add(st01);
            System.out.println(st01);
              Student st02 = new Student(aname, asurName,afees,adate,acourse);
              allStudents.add(st02);
              System.out.println(st02);
                      
                      break;
                  default:
                      System.out.println("Invalid option,please choose again");
                   
                      break;
              }}
            
            
                  case 2:
                      if(extraCourse==2)
              
                          System.out.println("Your entry has been saved");
                      
              
             break;
                  default:
                      System.out.println("You can only input "+"\n1.For adding another course "+"\n2.For completing the entry");
                      System.out.println("Please try again");
              }}
             
          
          case 2:// λιστα με ολους τους μαθητες
       for(Object o :allStudents )
                  System.out.println(o);
            
            
              System.out.println("***********************");
   
            
break;
          case 3://καθε μαθητηες σε τι course ανηκει
              
              System.out.println("-------------");
              System.out.println(courses.get(0));
              for(Student st : allStudents){
                  
                  if(st.lesson==1){
                      System.out.println(st);
                        
                  }}
                System.out.println("-------------");
              System.out.println(courses.get(1));
              for(Student st : allStudents){
                  
                  if(st.lesson==2){
                      System.out.println(st);
                      
                  }}  
            ;System.out.println("-------------");
          System.out.println(courses.get(2));
          for(Student st : allStudents){
                  
                  if(st.lesson==3){
                      System.out.println(st);
                        
                  }}
                 
                  System.out.println("-------------");
              System.out.println(courses.get(3));
          for(Student st : allStudents){
                  
                  if(st.lesson==4){
                      System.out.println(st);
                       
                  }}   
         
                System.out.println("-------------");
                 
              for(Student st:allStudents){
                  if(st.lesson==5){
                     System.out.println(courses.get(4));
                      System.out.println(st);
                      
                  }}
            
                  System.out.println("-------------");
                 
              for(Student st:allStudents){
                  if(st.lesson==6){
                       System.out.println(courses.get(5));
                      System.out.println(st);
                    
                  }}
      
            break;
        
     
          case 4://επιλογη και διαλογη σε trainers
              
              
              
              int trainerDrill;
              System.out.println("Do you want to use :");
              System.out.println("1.for synthetic data ");
              System.out.println("2.for adding new trainers in our School");
              System.out.println("3.Return to the menu");
              trainerDrill=sc.nextInt();
              switch (trainerDrill) {
                  case 1:

                      allTrainer.forEach((f) -> {
                          System.out.println(f);
    });
break;
                  case 2:
                      System.out.println("Enter the name of the new Trainer");
                      String trainerName=sc.next();
                      System.out.println("The surname of the new trainer");
                      String trainerSurname=sc.next();
                      System.out.println("Enter which course will he train");
                      for (Object st:courses){
                           System.out.println(st);
                      }

                      int trainerCourse=sc.nextInt();
                      

                        if (trainerCourse==1){
                     
                          System.out.println(courses.get(0));}
        
                    else   if (trainerCourse==2){
//                      
                           System.out.println(courses.get(1));
                  System.out.println("-------------");   }
                      
                  else    if (trainerCourse==3){
                   
                           System.out.println(courses.get(2));  System.out.println("-------------");}
                     
                     
                   else   if(trainerCourse==4){
                        
                            System.out.println(courses.get(3));  System.out.println("-------------");}
                          
                   
                   else if (trainerCourse==5){
                       courses.get(4);
                       for(Trainer tr:allTrainer){
                           System.out.println(tr);
                       }
//                      courses.get(4);
                            System.out.println(courses.get(4));
                              System.out.println("-------------");
                   }
                        else{
                      System.out.println("Invalid option,please choose again after entering the menu");
                      break;
                    } 
                     
                       Trainer tr01=new Trainer (trainerName,trainerSurname,trainerCourse);
                              allTrainer.add(tr01);
                              System.out.println(tr01);
                   break;  
         
                  default:
                      System.out.println("wrong input please try again ");
                    break;
              }
         break;
                
       
          case 5: System.out.println("\nAvailable options are "
                       +"\nPress 1.(for synthetic data) "
                 +"\nPress 2.(for adding new courses) "+"\nPress 3.(for returning in menu) ");
             
              int choose=sc.nextInt();
              String title="CB9";
              String stream;
              String type;
              String startsDate;
              String endsDate;
//                    
           if (choose==1){
                System.out.println("Available courses for the semester are:");
               courses.forEach((c) -> {
                  
                   System.out.println(c);
              });}       
      
           else if(choose==2){
              
            
               System.out.println("Write the new programm");
               stream=sc.next();
               
           
               System.out.println("Enter 1.for Full or 2. for Part "
              +"\nFull programm is completed in 3 months 40 hours per week"
             +"\nPart programm is completed in 6 months 20 hours per week");
              int choise=sc.nextInt();
             
                  
               do{
              switch (choise){
                 
                  case 1:
                      type="Full";
                      startsDate="14/10/2019";
                      endsDate="14/01/2020";
                      System.out.println("the name of this semester is"+title+"\n the name of the programm is "+stream+
                              "\n you chose the "+type+" programm "+
                              "with starting date"+startsDate+"\n and will be end at " +endsDate);
                      break;
                  case 2:
                      type="Part";
                      startsDate="14/10/2019";
                      endsDate="14/04/2020";
                      System.out.println("the name of this semester is"+title+"\n the name of the programm is "+stream+
                              "\n you chose the "+type+" programm "+
                              "with starting date"+startsDate+"\n and will be end at " +endsDate);
                    
                      Course sc01=new Course(title,stream,type,startsDate,endsDate);
                      courses.add(sc01);
                      break;
                        
                  default:
                      System.out.println("Wrong input please try again using the correct parameters");
        
              }
              
             
                     
                              }while(choise!=2 && choise<0);}
         
        
                
               else{ System.out.println("Wrong input"+"\nAvailable options are "
                       +"\nPress 1.(for synthetic data) "
                 +"\nPress 2.(for adding new courses) "+"\nPress 3.(for returning in menu) ");}
           
break;
             
          case 6: System.out.println(courses.get(0));
              for(Trainer tr2 : allTrainer){
                  
                  if(tr2.trainerCourse==1){
                      System.out.println(tr2);
                  }}
                System.out.println("-------------");
              System.out.println(courses.get(1));
              for(Trainer tr2 : allTrainer){
                  
                  if(tr2.trainerCourse==2){
                      System.out.println(tr2);
                  }}
                System.out.println("-------------");
         System.out.println(courses.get(2));
              for(Trainer tr2 : allTrainer){
                  
                  if(tr2.trainerCourse==3){
                      System.out.println(tr2);
                  }}
                System.out.println("-------------");
                   System.out.println(courses.get(3));
              for(Trainer tr2 : allTrainer){
                  
                  if(tr2.trainerCourse==4){
                      System.out.println(tr2);
                  }}
  System.out.println("-------------");
                 break;
             
          case 7:
                  
              System.out.println("Choose between the options of ");
              System.out.println("1.Use synthetic data for printing a list of assigments");
              System.out.println("2.input new assigments for the courses");
              int nextAssigment;
              nextAssigment=sc.nextInt();
            
              
              if (nextAssigment==1){
                  
                  for (Object q :allAssigments){
                      System.out.println(q);
                      
                  }
              }
              
              else if (nextAssigment == 2){
                  System.out.println("Write the subject of the assigment with no space between");
                  System.out.println("for example:thehistoryofgreece");
                  String assigmentName=sc.next();

                  
                  
                  Assigment ass01=new Assigment (assigmentName,"5 pages essay","04/12/2019",20,100);
                  allAssigments.add(ass01);
                  for(Object p:allAssigments){
                      System.out.println(p);
                      System.out.println("-------------");
                  }
              }
           
              else {
                  System.out.println("Invalid input return to the menu"
                          );
              }
              
              System.out.println("***********************");
              break;
          case 8:
           
                      courses.get(0).equals(allAssigments.get(0));
                      courses.get(1).equals(allAssigments.get(1));
                      courses.get(2).equals(allAssigments.get(2));
                      courses.get(3).equals(allAssigments.get(3));
                      System.out.println(courses.get(0));
                      System.out.println(allAssigments.get(0));
      System.out.println("-------------");
                      System.out.println(courses.get(1));
                      System.out.println(allAssigments.get(1));
  System.out.println("-------------");
                      System.out.println(courses.get(2));
                      System.out.println(allAssigments.get(2));
   System.out.println("-------------");
                      System.out.println(courses.get(3));
                      System.out.println(allAssigments.get(3));
               System.out.println("-------------");
//                      for(Course s:courses){
//                          for(Assigment a:allAssigments){
//                              if{
//                              courses.get(s).equals.allAssigments.get(a);}
//                          }
//                      }
                      
                      break;
          case 9: 
               System.out.println("-------------");
              System.out.println(allAssigments.get(0));
               for(Student st:allStudents){
                  if(st.lesson==1){
                    allAssigments.get(0);
                      System.out.println(st);
                       
                  }} System.out.println("-------------");
            System.out.println(allAssigments.get(1));
            for(Student st:allStudents){
                  if(st.lesson==2){
                    allAssigments.get(1);
                      System.out.println(st);
                      
                  }} System.out.println("-------------");
           System.out.println(allAssigments.get(2));
            for(Student st:allStudents){
                  if(st.lesson==3){
                    allAssigments.get(2);
                      System.out.println(st);
                       
                  }}
            System.out.println("-------------");
           System.out.println(allAssigments.get(3));
                       for(Student st:allStudents){
                  if(st.lesson==4){
                    allAssigments.get(3);
                      System.out.println(st);
                       
                  }}
  
             break;
          case 10:
              System.out.println("Found the method needed more time for experiments");
//AllTheClassesInOne.dateChecker(type);
       break;
          case 11: 
              System.out.println("Thank you for choosing our services");
              System.out.println("Needeed more time ");
              System.out.println("Merry christmassssssss");
              System.out.println("Eternal programm is over");
              // .. exit program
              break;
          default:
              
              System.out.println("\"Choice must be a value between 1 and .11\"");
      }
} while (choiceentry != 11);

  
                     
}

}
