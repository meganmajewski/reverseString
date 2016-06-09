/*
	This project takes in user input string and outputs the string in reverse
*/

import java.util.*; 
import java.io.*;
class Main {  
  public static String FirstReverse(String str) { 
  
    String[] strArray = str.split("");
    StringBuilder builder= new StringBuilder();
    
    
    for(int i=strArray.length-1;i>=0; i--){
       builder.append(strArray[i]);
    }
    String reverse=builder.toString();
    return reverse;  
  } 
  
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}//end Main