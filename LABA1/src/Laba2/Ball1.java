package Laba2;
import java.lang.*;
public class Ball1 {
    private double x = 0.0;
    private double y = 0.0;

    public Ball1(){}
    public Ball1 (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override public String toString(){
        return "Ball1 @ ("+this.x+", "+this.y+").";
    }
}
