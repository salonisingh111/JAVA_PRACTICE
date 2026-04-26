package Strings;

import java.util.*;

public class CombinedLength{
   public static void main(String args[]) {
    System.out.println("enter your strings array");
     Scanner sc = new Scanner (System.in);
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;


     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }


     System.out.println(totLength);
   }
}

