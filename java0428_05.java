import java.util.Scanner;
import java.util.Random;

public class java0428_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();

        //#6-21
        // System.out.println("6명의 국어, 수학 점수를 입력하세요");

        // int[][] point = new int[6][2];
        // int[] sumStudent = new int[6];
        // int[] sumSubject = new int[2];

        // for (int i = 0; i < 6; i++){
        //     System.out.print(i+1+"번 국어:");
        //     point[i][0] = sc.nextInt();
        //     System.out.print("    수학:");
        //     point[i][1] = sc.nextInt();

        //     sumStudent[i] = point[i][0] + point[i][1];//학생점수
        //     sumSubject[0] += point[i][0];   //국어점수합
        //     sumSubject[1] += point[i][1];   //수학점수합

        // }

        //     System.out.println("No.\t국어\t수학\t평균");
        //     for (int i = 0; i < 6; i++) {
        //     System.out.print((i+1)+"\t"+point[i][0]+"\t\t"+point[i][1]+"\t\t"+(double)sumStudent[i]/2);
        //     System.out.println();
        //     }
        //     System.out.println("평균 "+(double)sumSubject[0]/6+"\t"+(double)sumSubject[1]/6);

        //# 6-21
        int[][] scores=new int [3][5];
        int[][] avgsum=new int [3][2];

        System.out.print("Class?(max 4) : ");
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++){
            System.out.print("How many student?(max 6) : ");
            int st_num=sc.nextInt();
            for(int j=0;j<st_num;j++){
                System.out.print("Class "+(i+1)+" No."+(j+1)+"'s score : ");
                scores[i][j]=sc.nextInt();
                avgsum[i][0]++;
                avgsum[i][1]=avgsum[i][1]+scores[i][j];
            }
        }

        System.out.println("===========");

        for(int i=0;i<num;i++){
            System.out.println("Class "+(i+1)+": Sum = "+avgsum[i][1]+" Avg = "+(avgsum[i][1]/avgsum[i][0]));
        }
        int tot_sum=avgsum[0][1]+avgsum[1][1]+avgsum[2][1];
        int tot_num=avgsum[0][0]+avgsum[1][0]+avgsum[2][0];
        System.out.println("Total : Sum = "+tot_sum+" Avg = "+tot_sum/tot_num);

    }
}
