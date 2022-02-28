public class exercise1
{
    public static void main(String[] args)
    {
        final int MIN=100;
        final int MAX=999;
        int i, j, k, sum, temp;
        for(i=MIN; i<=MAX; i++)
        {
            for(j=0, k=i, sum=0; j<3; j++)
            {
                temp=k%10;
                sum+=temp*temp*temp;
                k=k/10;
            }
            if(sum==i)
                System.out.print(" "+sum+" ");
        }
    }
}
