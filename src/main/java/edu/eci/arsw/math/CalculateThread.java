package edu.eci.arsw.math;

import java.util.Arrays;
import java.lang.Thread;

/**
 *
 * @author juanbogota
 */
public class CalculateThread extends Thread{

    private int start;
    private int DigitsPerSum;
    public static void calculateThread(int start, int DigitsPerSum){
        start = start;
        DigitsPerSum = DigitsPerSum;
    }

    @Override
    public void run(){
        for(int i = 0; i <= DigitsPerSum; i++){
             c = PiDigits.getDigits(start, DigitsPerSum);

        }

    }
    
}