import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int search=sc.nextInt();

    int[] dataArray={11,13,17,19,23,29,31};
    Bsearch(dataArray,search);
  }
  public static void Bsearch(int[] arr,int search){
    int head=0;
    int tail=arr.length-1;
    int center;

    while (head<=tail){
      center=(head+tail)/2;
      if (arr[center]==search){
        System.out.println(center+"번째의 요소가 일치");
        break;
      }
      if(arr[center]<search){
        head=center+1;
      }else{
        tail=center-1;
      }
    }
    if(head>tail){
      System.out.println("찾지 못했습니다.");
    }
  }
}
