import java.io.*;
import java.util.*;

public class ForLoopPractice {	
	
	public static void LastnameFirstnameForLoops(){

	//Problem #1
		
		System.out.println("Problem #1");
		
		int a=0;
		int value=0;
		String output="";
		
		for(a=0; a<=3; a++){
			value=1+a*3;
			output=output+value+" ";
			//System.out.println(output);
		}
		
		System.out.println(output);
		
		output="";
		
		for(a=0; a<=4; a++){
			value=10-2*a;
			output=output+value+" ";
		}
		
		System.out.println(output);
		
		output="";
		
		for(a=0; a<=4; a++){
			value=4+2*a;
			output=output+value+" ";
		}
		
		System.out.println(output);
		System.out.println();
		
	//Problem #2
		
		System.out.println("Problem #2");
		
		int c=0;
		
		for(c=0; c<3; c++){
			
			int b=0;
			String output2="";
			
			for(b=0;b<5; b++){
				output2=output2+"*";			
			}
			System.out.print(output2);
			System.out.println();
		}
		System.out.println();
		
	//Problem #3
		
		System.out.println("Problem #3");
		
		
		int rows=10;	//how many rows do you want
		int wide=1;		//at what width each for each step
		
		
        for (int i = 0; i <= rows; i++) { 				/*tells how many rows will exist*/
            /*if(i==0){
            	for(int k=1; k<=rows*wide-1; k++){		//adds the star at the top
            		System.out.print(" ");
            	}
            	System.out.print("*");
            }*/
            for (int j = 1; j <= rows*wide - wide*i; j++) {			/*tells how many spaces will be pushed out from side*/
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2*wide * i - 1; j++) {		/*tells what to print, increasing by two each time i increases*/
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
    //Problem #4 
        
        System.out.println("Problem #4");
	    
        for(int i=1;i<=7;i++){
        	for(int z=1;z<=i;z++){
        		System.out.print(i);
        	}
        	System.out.println();
        	//System.out.println()
        }
        
        System.out.println();

        
    //Problem #5
        
        System.out.println("Problem #5");
        
        int n1=1;
        int n2=0;
        int n3=0;
        
        for(int i=1;i<=12;i++){
        	n3=n1+n2;
        	System.out.print(n3+"   ");
        	n1=n2;
        	n2=n3;
        }
        
        System.out.println();
        System.out.println((double)177%100%10/2);
        System.out.println(177%100%10/2);
        System.out.println(8/9);
		
	}
	
	
}
