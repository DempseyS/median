import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class Yas //finds median of ArrayList
{
    // instance variables - replace the example below with your own

    public static void main(String [] args){
        Scanner reader = new Scanner (System.in);
        Random rand = new Random();

        ArrayList <Integer> nums = new ArrayList();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 10; i++){
            nums.add(new Integer(rand.nextInt(10)));
        }
        for (int i = 0; i< 10; i++)
            System.out.print("" + nums.get(i)+",");
            System.out.println("median = " + median(nums));
    }

    public static int min(ArrayList <Integer> nums){
        int g = nums.get(0);
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) < g)
                g = nums.get(i);

        return g;
    }

    public static int max(ArrayList <Integer> nums){
        int g = nums.get(0);
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) > g)
                g = nums.get(i);

        return g;
    }


    public static double median(ArrayList <Integer> nums){

        int x = max(nums);
        int y = min(nums);

        double a = ((double)x-y)/2;
        return y+a;





    }









}
