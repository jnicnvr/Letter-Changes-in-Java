/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static char[] splitStringsMethod() 
    {
        Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    // String str = "GeeksFor1!";
	    
        char[] ch = new char[str.length()]; 

        for (int i = 0; i < str.length(); i++)
        { 
            if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
            {
                
                ch[i] = Character.toUpperCase(str.charAt(i));
            }
            else
            {
                 ch[i] = str.charAt(i);
            }
        }
      return ch;
    }
    
    
	public static void main(String[] args) {
       char ch[] = splitStringsMethod(); 

        for (char c : ch) {
            
              if(Character.isDigit(c)) 
              {
                System.out.print(c);
              }
              else if(!Character.isLetter(c) && !Character.isDigit(c)) 
              {
                System.out.print(c);
              }
              else
              {
                c++; 
                System.out.print(c);
               }
                          
        }
	}
}
