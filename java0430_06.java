import java.util.Scanner;
import java.util.Random;

abstract class Player{
    int hand;
}

class Human extends Player{
    Scanner sc=new Scanner(System.in);

    public int humanhand(){
        do{
            System.out.print("GaBaBo! 0..Ba/1..Ga/2..Bo");
            hand=sc.nextInt();
        }while(hand <0 || hand >2);
        return hand;
    }
}

class Computer extends Player{
    Random rand=new Random();
    public int ComputerHand(){
        return rand.nextInt(3);
    }
}

public class java0430_06 {
    public static void main(String[] args){
        Human hp = new Human();
        Computer cp = new Computer();

        int humanHand = hp.humanhand();
        int computerHand = cp.ComputerHand();
        String hands[]={"Gawee","Bawee","Boh"};

        System.out.println("I'm "+hands[humanHand]+", and You're"+hands[computerHand]);
    }
}
