package guvi;
import java.util.*;
public class fact {
public static void main(String[] args) {
	int a,x=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	for(int i=1;i<=a;i++){
		if(a%i==0){
			x=i;
			System.out.print(x+" ");
		}
	}
}
}
