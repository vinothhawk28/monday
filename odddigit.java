package guvi;
import java.util.*;
public class odddigit {
public static void main(String[] args) {
int l;
int a=0,sum=0,d=0;
Scanner in=new Scanner(System.in);
l=in.nextInt();
while(l!=0)
{
a=l%10;
sum=a;
if(sum%2!=0){
	d=sum;
	System.out.print(d+" ");
}
l=l/10;
}
}
}
