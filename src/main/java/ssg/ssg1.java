package ssg;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ssg1 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

 int []a={0,2,3,0,12,0};
 int[]b=new int[a.length];
        int sayaç=0;
        for (int w:a) {
            if (w!=0){
                b[sayaç]=w;
                sayaç++;
            }

        }
        System.out.println(Arrays.toString(b));
    }
        }







