public class euclid{
    public int euc1(int x,int y){
        int t;
        t=x%y;
        while(t!=0){
            x=y;
            y=t;
            t=x%y;
        }
        return y;
    }

    public int euc2(int x,int y){
        if(x%y==0)
            return y;
        else
            return euc2(x,x%y);
    }

    public static void main(String[] args){
        euclid ec=new euclid();
        System.out.println(ec.euc1(12,8));
        System.out.println(ec.euc2(12,8));
    }
}