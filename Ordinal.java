public class Ordinal {
    public static void main(String[] args){
        //int a=(1) ? (((2) ? : ((3) ? ((4) ? : ):"3rd") : "2nd")) : "1st");
        int a=1;
        String b=(a==1)? "st":(a==2)? "nd":(a==3)? "rd" :"th";

        System.out.println(a+b);
    }
}
