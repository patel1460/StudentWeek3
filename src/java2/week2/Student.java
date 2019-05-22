/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.week2;

/**
 *
 * @author Savan
 */
public class Student {
   
    public static int numOfStudents=0;
    private String id;
    private String name;
    private int grade;
    
    Student(){
    
    }
     
    Student(String id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        numOfStudents++;
    }
    
    public String setId(){
        return id;
    }
    public String setName(){
        return name;
    }
    public int setGrade(){
        return grade;
    }
    public String getId(){
        return id;
    }
     public String getName(){
        return name;
    }
     public int  getGrade(){
        return grade;
    }
     public void setGrade(int grade){
         return nomOfStudents;
     }
    
    

    
}
