package Laba2;
import java.lang.*;
public class TestBall1 {
    public static void main(String[] args){
        Ball1 b1 = new Ball1(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
