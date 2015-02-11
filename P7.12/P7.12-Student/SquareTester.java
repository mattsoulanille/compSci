
/**
 * Write a description of class SquareTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SquareTester
{
    public static void main(String[] args)
    {
        Square mySquare = new Square();
        mySquare.add(16); mySquare.add(3); mySquare.add(2); mySquare.add(13);
        mySquare.add(5); mySquare.add(10); mySquare.add(11); mySquare.add(8);
        mySquare.add(9); mySquare.add(6); mySquare.add(7); mySquare.add(12);
        mySquare.add(4); mySquare.add(15); mySquare.add(14); mySquare.add(1);
        if (mySquare.isMagic()) System.out.println("It's magic!");
        else System.out.println("Not magic. :(");
        
        System.out.println("-----");
        
        mySquare = new Square();
        mySquare.add(16); mySquare.add(3); mySquare.add(2); mySquare.add(13);
        mySquare.add(5); mySquare.add(10); mySquare.add(11); mySquare.add(8);
        mySquare.add(4); mySquare.add(6); mySquare.add(7); mySquare.add(12);
        mySquare.add(9); mySquare.add(15); mySquare.add(14); mySquare.add(1);
        if (mySquare.isMagic()) System.out.println("It's magic!");
        else System.out.println("Not magic. :(");
        
        System.out.println("-----");
        
        mySquare = new Square();
        mySquare.add(16); mySquare.add(3); mySquare.add(2); mySquare.add(13);
        mySquare.add(5); mySquare.add(10); mySquare.add(11); mySquare.add(8);
        mySquare.add(9); mySquare.add(6); mySquare.add(7); mySquare.add(12);
        mySquare.add(4); mySquare.add(15); mySquare.add(14);
        if (mySquare.isMagic()) System.out.println("It's magic!");
        else System.out.println("Not magic. :(");
        
        System.out.println("-----");
        
        mySquare = new Square();
        mySquare.add(16); mySquare.add(3); mySquare.add(2); mySquare.add(13);
        mySquare.add(5); mySquare.add(10); mySquare.add(11); mySquare.add(8);
        mySquare.add(9); mySquare.add(6); mySquare.add(6); mySquare.add(12);
        mySquare.add(4); mySquare.add(15); mySquare.add(14); mySquare.add(1);
        if (mySquare.isMagic()) System.out.println("It's magic!");
        else System.out.println("Not magic. :(");
        
    }
}
