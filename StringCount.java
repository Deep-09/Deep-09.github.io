/*Program for counting maximum number of words in a sentence.*/

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringCount {
       public static int countWords(String str)
       {
    	   int count=0,max=0,i;
    	   String string;
    	   System.out.println("Sentences in given text are :");
    	   StringTokenizer token=new StringTokenizer(str,".?!");
    	   while(token.hasMoreTokens())
    	   {
    		   string =token.nextToken();
    		   System.out.println(string);
    		   char ch[]= new char[string.length()];
    		   for(i=0;i<string.length();i++)
    		   { 
    			   ch[i]= string.charAt(i);
    	            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
    			   {
    				   count++;
    			   }
    		   }
    		   if(max<count)
    		   {
    			   max=count;
    		   }
    		   count=0;
    	   }
    	   return max;
       }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text to count maximum words in a sentence :");
		String str=sc.nextLine();
		int result= countWords(str);
		System.out.println("Maximum number of words in a given sentence is :\n"+result);
	}

}
