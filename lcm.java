# lcm
import java.io.*;
import java.util.*;
public class lcm{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,c=0;
System.out.println("Enter the 1st number:");
int k=sc.nextInt();
System.out.println("Enter the 2nd number:");
int m=sc.nextInt();
System.out.print("\n");
c=k*m;
int d=c;
for(i=0;i<=c;i++){
if(i%k==0 && i%m==0 &&i<d)
d=i;
}
System.out.println("The LCM is:"+d);
}
}
