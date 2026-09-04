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
            byte[] c = PiDigits.getDigits(1, 1000000, 2);
        }
    }

    @Override
    public void start(){

    }
}