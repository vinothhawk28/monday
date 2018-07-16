package guvi;
import java.util.*;
public class octal {
	public static void main(String[] args) {
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		int l=a.length();
	    if(l%2!=0){
	    	a="0"+a;
	    }
	   int t=Integer.parseInt(a,2);
	   String octa = Integer.toOctalString(t);
	   System.out.println(octa);
}
}
