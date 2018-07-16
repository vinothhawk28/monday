package guvi;
import java.util.*;
public class roundoff {
public static void main(String[] args) {
	double a;
	int d=0;
	Scanner in=new Scanner(System.in);
	a=in.nextDouble();
	double s=a-(int)a;
	if(s>=0.1){
		d=(int)a+1;
	System.out.println(d);	}
	else if(s<=0.1){
		d=(int)a-1;
		System.out.println(d);
	}
	else{
		d=(int)a;
		System.out.println(d);
	}
	}
}

