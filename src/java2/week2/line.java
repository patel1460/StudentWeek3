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
public class line {
  private  int id;
   private int startX;
   private int startY;
   private int endX;
    private int endY;
     private byte thickness;

  
     
     line(){
          }
     
    line(int id){
        this.id=id;
    }
    line(int id,int startX,int startY,int endX, int endY){
    this.id=id;
    this.startX=startX;
    this.startY=startY;
    this.endX=endX;
    this.endY=endY;
   
    }
    line(int id,int startX,int startY,int endX, int endY,byte thickness){
    this.id=id;
    this.startX=startX;
    this.startY=startY;
    this.endX=endX;
    this.endY=endY;
    this.thickness=thickness;
    }
    
      public void setId(int id) {
        this.id = id;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setThickness(byte thickness) {
        this.thickness = thickness;
    }

    public int getId() {
        return id;
    }

    public int getStartX() {
        return startX+=25;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX+=25;
    }

    public int getEndY() {
        return endY;
    }

    public byte getThickness() {
        return thickness;
    }
    
}
