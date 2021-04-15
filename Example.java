import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Example {
    public static void main(String[] args){
        //System.out.println("H\nong");
        // Q2-1
        // Solution 1
        // System.out.println("82+17="+(82+17));
        // System.out.println("82-17="+(82-17));
        // Solution 2
        // System.out.print("82+17=");
        // System.out.println(82+17);
        // System.out.print("82-17=");
        // System.out.println(82-17);

        //Q2-2
        // int x=63;
        // int y=18;
        // System.out.println("x is "+x);
        // System.out.println("y is "+y);
        // System.out.println("Sum is "+(x+y));
        // System.out.println("Average is "+((x+y)/2));

        //Q2-3
        // double x=63.4;
        // double y=18.3;
        // System.out.println("x is "+x);
        // System.out.println("y is "+y);
        // System.out.println("Sum is "+(x+y));
        // System.out.println("Average is "+((x+y)/2));

        //Q2-4
        // int x=63;
        // int y=18;
        // int z=52;
        // System.out.println("x is "+x);
        // System.out.println("y is "+y);
        // System.out.println("z is "+z);
        // System.out.println("Sum is "+(x+y+z));
        // System.out.println("Average is "+((x+y+z)/3));

        //Q2-5
        // Scanner sc=new Scanner(System.in);
        // int num;
        // System.out.print("Input : ");
        // num=sc.nextInt();
        // System.out.println("Your input is "+num);

        //Q2-6
        // Scanner sc=new Scanner(System.in);
        // int num;
        // System.out.print("Input : ");
        // num=sc.nextInt();
        // System.out.println("Plus 10 is "+(num+10));
        // System.out.println("Minus 10 is "+(num-10));

        //Q2-7
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input : ");
        // int num=sc.nextInt();
        // System.out.println("Final - "+(int)(num/10));
        // System.out.println("Only final "+(num%10));
        // Method 2 - String
        // String n=sc.next();
        // System.out.println(n.substring(0,n.length()-1));
        // System.out.println(n.substring(n.length()-1,n.length()));

        //Q2-8 : skip

        //Q2-9
        // Scanner sc1=new Scanner(System.in);
        // Scanner sc2=new Scanner(System.in);
        // System.out.print("num1 : ");
        // double num1=sc1.nextDouble();
        // System.out.print("num2 : ");
        // double num2=sc2.nextDouble();
        // System.out.println("Result is "+(num1*num2)/2);

        //Q2-10
        // Scanner sc=new Scanner(System.in);
        // System.out.print("num : ");
        // double num=sc.nextDouble();
        // final double PI=3.14;
        // System.out.println("Result1 is "+(num*num*4*PI));
        // System.out.println("Result2 is "+(num*num*num*4/3*PI));

        //Q2-11
        // Random rand=new Random();

        // int x=1+rand.nextInt(9);
        // int y=-1-rand.nextInt(9);
        // int z=rand.nextInt(89)+10; // nextInt(89) : 0~89 -> nextInt(89)+10 : 10~99

        // System.out.println("Create 3 Random number!");
        // System.out.println("positive number : "+x);
        // System.out.println("negative number : "+y);
        // System.out.println("positive number : "+z);

        //Q2-12
        // Scanner sc=new Scanner(System.in);
        // Random rnd=new Random();
        // System.out.print("Number ? ");
        // int num=sc.nextInt();
        // int r=rnd.nextInt(11);

        // System.out.println("value is "+(num-5+r));

        //Q2-13 : x
        //Q2-14
        // Scanner sc=new Scanner(System.in);
        // System.out.print("First name? ");
        // String str1=sc.next();
        // System.out.print("Last name? ");
        // String str2=sc.next();
        // System.out.print12("Hello, "+str1+" "+str2);

        //Q2-16
        // String s1="ABC";
        // String s2="XYZ";

        //Q3-1
        // Scanner sc=new Scanner(System.in);
        // System.out.print(" Input? : ");
        // int n=sc.nextInt();

        // if(n<0){
        //     System.out.print("This value is negative number");
        // }

        //Q3-2
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input? ");
        // int n=sc.nextInt();

        // if(n<0){
        //     System.out.println("This value is "+(-1*n));
        // }else{
        //     System.out.println("This value is "+n);
        // }

        //Q3-3
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number 1? ");
        // int n1=sc.nextInt();
        // System.out.print("Input number 2? ");
        // int n2=sc.nextInt();
        // if(n1%n2==0){
        //     System.out.println(n2+" is "+n1+"'s number");
        // }else{
        //     System.out.println(n2+" is not"+n1+"'s number");
        // }

        //Q3-4
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number 1? ");
        // int n1=sc.nextInt();
        // System.out.print("Input number 2? ");
        // int n2=sc.nextInt();
        // if(n1%n2!=0){
        //     System.out.println(n2+" is not"+n1+"'s number");
        // }else{
        //     System.out.println(n2+" is "+n1+"'s number");
        // }

        //Q3-5
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input? ");
        // int num=sc.nextInt();
        // if(num==0){
        //     System.out.println(num+" is zero");
        // }else if(num>0){
        //     System.out.println(num+" is positive number");
        // }else{
        //     System.out.println(num+" is negative number");
        // }

        //Q3-6 - skip
        //Q3-7
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a? ");
        // int a=sc.nextInt();
        // System.out.print("Input number b? ");
        // int b=sc.nextInt();
        
        // if(a>b){
        //     System.out.println("a is bigger than b");
        // }else if(a<b){
        //     System.out.println("b is bigger than a");
        // }else{
        //     System.out.println("a and b is equal");
        // }

        //Q3-8
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input? ");
        // int num=sc.nextInt();

        // if(num%10==0){
        //     System.out.println("This value is 10's number");
        // }else{
        //     System.out.println("This value is not 10's number");
        // }

        //Q3-9
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input? ");
        // int num=sc.nextInt();

        // if(num%10==0 && num>0){
        //     System.out.println("This value is 10's number");
        // }else if(num%10!=0 && num>0){
        //     System.out.println("This value is not 10's number");
        // }else if(num<0){
        //     System.out.println("This value is negative number");
        // }

        //Q3-11
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input Score : ");
        // int score=sc.nextInt();

        // if(score>80 && score<=100){
        //     System.out.println("Su");
        // }
        // else if(score>70 && score<=80){
        //     System.out.println("Woo");
        // }
        // else if(score>60 && score<=70){
        //     System.out.println("Mi");
        // }
        // else if(score>50 && score<=60){
        //     System.out.println("Yang");
        // }
        // else if(score<=50){
        //     System.out.println("Ga");
        // }else{
        //     System.out.println("Wrong Score");
        // }

        //Q3-13
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a : ");
        // int a=sc.nextInt();
        // System.out.print("Input number b : ");
        // int b=sc.nextInt();

        // if((a-b)>=0){
        //     System.out.println("Minus between two numbers is "+(a-b));
        // }else if((a-b)<0){
        //     System.out.println("Minus between two numbers is "+(b-a));
        // }

        //Quiz : no if

        // System.out.println("Result is "+(Math.abs(a-b)));

        //Q3-15
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a : ");
        // int a=sc.nextInt();
        // System.out.print("Input number b : ");
        // int b=sc.nextInt();
        // System.out.print("Input number c : ");
        // int c=sc.nextInt();

        // int min;
        // min=a;

        // if(b<min){
        //     min=b;
        //     if(c<min){
        //         min=c;
        //     }
        // }else if(c<min){
        //     min=c;
        // }
        // System.out.println("Min number is "+min);

        //Q3-16

        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a : ");
        // int a=sc.nextInt();
        // System.out.print("Input number b : ");
        // int b=sc.nextInt();
        // System.out.print("Input number c : ");
        // int c=sc.nextInt();

        // int center=a;
        // if(center>b){
        //     if(center>c){
        //         if(b>c)
        //         center=b;
        //         else if(b<c)
        //         center=c;
        //     }
        // }
        // else if(center<b){
        //     if(center<c){
        //         if(b>c)
        //         center=c;
        //         else if(b<c)
        //         center=b;
        //     }
        // }
        // System.out.println("Middle value is "+center);

        //Q3-18
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a : ");
        // int a=sc.nextInt();
        // System.out.print("Input number b : ");
        // int b=sc.nextInt();

        // // method 1
        // int temp;

        // if(b>a){
        //     temp=b;
        //     b=a;
        //     a=temp;
        // }

        // System.out.println("Sort Complete!");
        // System.out.println("Number a is "+a);
        // System.out.println("Number b is "+b);

        // method 2
        // if(b>a){
        //     System.out.println("Number a is "+b);
        //     System.out.println("Number b is "+a);
        // }else if(a>b){
        //     System.out.println("Number a is "+a);
        //     System.out.println("Number b is "+b);
        // }

        //Q3-19
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input number a : ");
        // int a=sc.nextInt();
        // System.out.print("Input number b : ");
        // int b=sc.nextInt();
        // System.out.print("Input number c : ");
        // int c=sc.nextInt();

        // System.out.println("Sort Complete!");

        // if (a>=b && b>=c){
        //     System.out.println("Number a is "+c);
        //     System.out.println("Number b is "+b);
        //     System.out.println("Number c is "+a);
        // }else if(a>=c && c>=b){
        //     System.out.println("Number a is "+b);
        //     System.out.println("Number b is "+c);
        //     System.out.println("Number c is "+a);
        // }else if(b>=a && a>=c){
        //     System.out.println("Number a is "+c);
        //     System.out.println("Number b is "+a);
        //     System.out.println("Number c is "+b);
        // }else if(b>=c && c>=a){
        //     System.out.println("Number a is "+a);
        //     System.out.println("Number b is "+c);
        //     System.out.println("Number c is "+b);
        // }else if(c>=a && a>=b){
        //     System.out.println("Number a is "+b);
        //     System.out.println("Number b is "+a);
        //     System.out.println("Number c is "+c);
        // }else if(c>=b && b>=a){
        //     System.out.println("Number a is "+a);
        //     System.out.println("Number b is "+b);
        //     System.out.println("Number c is "+c);
        // }

        //Q3-19 : Best Answer
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number a : ");
        int a=sc.nextInt();
        System.out.print("Input number b : ");
        int b=sc.nextInt();
        System.out.print("Input number c : ");
        int c=sc.nextInt();

        if (a>b){
            int t=a; a=b; b=t;
        }
        if(b>c){
            int t=b; b=c; c=t;
        }
        if(a>b){
            int t=a; a=b; b=t;
        }

    }
}
