import java.util.Scanner;

public class java0428_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Class? : ");
        int classNum = sc.nextInt();
        int[][] point = new int[classNum][];
        int totNumber = 0;

        for (int i = 0 ; i < point.length ; i ++){
            System.out.print(i+1+"class's Student : ");
            int num = sc.nextInt();

            point[i] = new int[num];
            totNumber += num;

                for (int j = 0; j < point[i].length; j++){
                    System.out.print((i+1) + "class's No."+ (j+1) +"Score :");
                    point[i][j] = sc.nextInt();
                }
        }
        System.out.println("  Class  | Sum    Average");
        System.out.println("-------------------------");
        int total = 0;
        for (int i = 0 ; i < point.length; i++) {
            int sum = 0;
            for (int j = 0; j <point[i].length; j++) {
                sum += point[i][j];
            }
            total += sum;
            System.out.printf("Class %2d | %5d %5.1f\n",i+1,sum, (double)sum/point[i].length);
        }
        System.out.println("-------------------------");
        System.out.printf("   Sum   | %5d %5.1f\n",total, (double)total/totNumber);

    }

}

