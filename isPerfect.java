public class isPerfect {
    public void isPerfectN(int x){
        boolean perfect=true;
        int toplam=0;
        for (int i =1;i<x;i++)
        {
            if(x%i==0)
            toplam +=i;
            if(toplam==x)
            {
                perfect=true;

            }
            else
                perfect=false;
        }
        if (perfect)
        {
            System.out.println("This is Perfect Number");
        }
        else
            System.out.println("This isn't Perfect");

    }
}
