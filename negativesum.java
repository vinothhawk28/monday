package guvi;
import java.util.*;
public class negativesum {
public static void main(String[] args) {
	int a,sum=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=in.nextInt();
	sum=sum+b[i];
	}
	System.out.println(sum);	
}
}
