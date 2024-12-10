import java.util.Scanner;

public class dm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of English:");
        float a=sc.nextFloat();   
        System.out.println("Enter the marks of pysics:");
        float b=sc.nextFloat();
        System.out.println("enter the marks of maths:");
        float c=sc.nextFloat();

        float sum=a+b+c;
        System.out.println("the sum of three subject is:");
        System.out.println(sum);
   
        float per=sum/300;
        System.out.println("The percentage of three subject is:");
        System.out.println(per);
        sc.close();
            
    }
    
}
