import java.util.Scanner;
import java.util.Random;

public class java0429_04 {
    static Scanner sc=new Scanner(System.in);
    static Random rnd=new Random();
    public static void main(String[] args){

        // #7-9(Simple Version)
        // int x;
        // do{
        //     int n=readPlusInt();

        //     System.out.print("Reverse number is ");
        //     while(n>0){
        //         System.out.print(n%10);
        //         n=n/10;
        //     }
        //     System.out.println();
        //     do{
        //         System.out.print("Again? <Yes..1/No..0>");
        //         x=sc.nextInt();
        //     }while(x!=0 && x!=1);
        // }while(x==1);

        // #7-10
        int x=rnd.nextInt(900)+100;
        int y=rnd.nextInt(900)+100;
        int z=rnd.nextInt(900)+100;
        int k=rnd.nextInt(4);
        int answer;
        int num;
        
        while(true){
            System.out.println("Exercise!");
            answer=RanAnswer(k,x,y,z);
            num=sc.nextInt();
            while(true){
                if(answer==num){
                    System.out.println("WoW!");
                    break;
                }
                else{
                    System.out.println("???");;
                    answer=RanAnswer(k,x,y,z);
                    num=sc.nextInt();
                }
            }
            System.out.print("Again?<Yes...1/No...0>:");
            int e=sc.nextInt();
            if(e==0) break;
            else if(e==1){
                x=rnd.nextInt(900)+100;
                y=rnd.nextInt(900)+100;
                z=rnd.nextInt(900)+100;
                k=rnd.nextInt(4);
            }
        }
    }

    static int RanAnswer(int k,int x,int y,int z){
        switch(k){
            case 0:
                System.out.print(x+"+"+y+"+"+z+"=");
                return x+y+z;
            case 1:
                System.out.print(x+"+"+y+"-"+z+"=");
                return x+y-z;
            case 2:
                System.out.print(x+"-"+y+"+"+z+"=");
                return x-y+z;
            case 3:
                System.out.print(x+"-"+y+"-"+z+"=");
                return x-y-z;
            default:
                return -1;
        }
    }

    static int readPlusInt(){
        int x;
        do{
            System.out.print("Positive number : ");
            x=sc.nextInt();
        }while(x<=0);

        return x;
    }
}
