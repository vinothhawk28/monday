package guvi;
import java.util.*;
public class vowelscon {
public static void main(String[] args) {
	String a,h="";
	Scanner in=new Scanner(System.in);
	a=in.next();
	String r=a.toLowerCase();
	String o=r.replaceAll("[a,e,i,o,u]","");
	
	char ch;
	for(int i=0;i<a.length();i++){
		ch=r.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		h=h+ch;
		}
		}
	System.out.println(h+o);
}
}
