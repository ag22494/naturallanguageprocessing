package naturallanguageprocessing;
import java.util.Scanner;
public class nlp { 
	  

		private static Scanner in;
		private static Scanner in1;


		public static String soundex(String s) { 
	        char[] x = s.toUpperCase().toCharArray();
	        char firstLetter = x[0];
	        
	        // convert letters to numeric code
	        for (int i = 1; i < x.length; i++) {
	            switch (x[i]) {
	                case 'B':
	                case 'F':
	                case 'P':
	                case 'V': { x[i] = '1'; break; }

	                case 'C':
	                case 'G':
	                case 'J':
	                case 'K':
	                case 'Q':
	                case 'S':
	                case 'X':
	                case 'Z': { x[i] = '2'; break; }

	                case 'D':
	                case 'T': { x[i] = '3'; break; }

	                case 'L': { x[i] = '4'; break; }

	                case 'M':
	                case 'N': { x[i] = '5'; break; }

	                case 'R': { x[i] = '6'; break; }
	                
	                case 'न': { x[i] = 'N'; break; }
	                
	                case 'ू':
	                case 'ु': { x[i] = '8'; break; }
	                
	                case 'प': { x[i] = '9'; break; }
	                
	                case 'र': { x[i] = '1'; break; }

	                default:  { x[i] = '0'; break; }
	            }
	        }

	        
	        String output =firstLetter+"" ;
	        for (int i = 1; i < x.length; i++)
	     
	                output += x[i];

	        
	        
	        return output;
	    }


	    public static void main(String[] args) {
	    	String name1,name2;
	    	in = new Scanner(System.in);
	    	in1 = new Scanner(System.in);

	        System.out.print("enter a string1");
	        name1=in.nextLine();
	        String code1 = soundex(name1);
	        System.out.println(code1);

	        
	        System.out.print("enter a string2");
	        name2=in1.nextLine();        
	        String code2 = soundex(name2);
	        System.out.println(code2);
	        
	     /*   System.out.print("enter a string3");
	        name3=in.nextLine();	     
	        String code3 = soundex(name3);
	        System.out.println(code3);
	    	*/
	        
	        

	    }
	}


