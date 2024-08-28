class NestedWhile
{
    public static void main(String[] args) 
    {
        int i=0;
        while(i<=4)
        {
            System.out.println("hi"+i);
                int j=0;
                while(j<=2)
                {
                    System.out.println("Hello"+j);
                    j++;
                }
            i++;
        }
    }
}