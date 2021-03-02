public class stringgetchar{
public static void main(String [] args)
{
	String s1=new String("hello javatpoint how are you");
	char[] ch=new char[10];
	try{
	    s1.getChars(6,16,ch,0);
	    System.out.println(ch);
	}catch(Exception ex){
		System.out.println(ex);
	}
	}
}
