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
public class assignment1Java2 {
    public static void main(String[] args){
       int[] array=new int[1000]; // array of thoussand lines
       line line=new line();// new class
       
       // setting the value
       line.setStartX(0);  
       line.setEndX(0);
       line.setStartY(0);
       line.setEndY(1);
       // for loop for 1000 lines
       for(int i=1;i<=array.length;i++){                   
         System.out.println("The co-ordinate for "+i+" is from X-axis: ("+line.getStartX()+","+line.getStartY()+ ") to Y-axis:("+line.getEndX()+","+line.getEndY()+")");
          
       }
    }
    
}
