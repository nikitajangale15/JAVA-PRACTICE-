public class lowertriangular {
    public static void main(String[] s)
    {
        for (int i=1; i<6 ; i++)
        {
            for (int j=1; j< 6; j++)
            {
                if (i>=j)
                {
                    System.out.print(j);
                }
            }
           System.out.println();
        }
    }
}
