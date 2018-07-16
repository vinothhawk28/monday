package vinoth;
import java.util.*;
public class pali {
public static void main(String[] args) {
	String s,rev="";
	int i,j=0;
	Scanner in=new Scanner(System.in);
	s=in.next();
	int l=s.length();
	for( i=l-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev)){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}			
}
}
