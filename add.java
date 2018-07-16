package guvi;
import java.util.Scanner;
public class sumoflast {
public static void main(String[] args) {
	int a,d=0,w=0;
	String h=null;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	String t=Integer.toString(a);
    int r=t.length();
	d=Integer.parseInt(String.valueOf(t.charAt(0)))+Integer.parseInt(String.valueOf(t.charAt(r-1)));	
	System.out.println(d);
	
}
}
