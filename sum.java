package guvi;
import java.util.*;
public class odd {
public static void main(String[] args) {
	int a,b,d=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	for(int i=a;i<=b;i++){
		if(i%2!=0){
			d=d+i;		
		} }System.out.println(d);
	
}
}
