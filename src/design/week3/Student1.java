/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.week3;

/**
 *
 * @author Savan
 */
public class Student1 {
 private int ID;
 private String firstName;
 private int MaxCourse;
 private boolean PartTime;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the MaxCourse
     */
    public int getMaxCourse() {
        return MaxCourse;
    }

    /**
     * @param MaxCourse the MaxCourse to set
     */
    public void setMaxCourse(int MaxCourse) {
        this.MaxCourse = MaxCourse;
    }

    /**
     * @return the PartTime
     */
    public boolean isPartTime() {
        return PartTime;
    }

    /**
     * @param PartTime the PartTime to set
     */
    public void setPartTime(boolean PartTime) {
        this.PartTime = PartTime;
    }

    
}
