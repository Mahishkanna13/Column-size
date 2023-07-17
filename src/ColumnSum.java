import java.util.Scanner;

public class ColumnSum {
    public static int[] Sum(int[][] Array,int rowsize,int columnsize)
    {
        int result[]=new int[columnsize];
        for(int j=0;j<columnsize;j++)
        {
            int sum=0;
            for (int i=0;i<rowsize;i++)
            {
                sum+=Array[i][j];

            }
            result[j]=sum;
            sum=0;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Rowsize=scanner.nextInt();
        int Columnsize=scanner.nextInt();
        int Array[][]=new int[Rowsize][Columnsize];
        for(int i=0;i<Rowsize;i++)
        {
            for(int j=0;j<Columnsize;j++)
            {
                Array[i][j]=scanner.nextInt();
            }
        }
        int [] output=Sum(Array,Rowsize,Columnsize);
        for (int i=0;i<output.length;i++)
        {
            System.out.print(output[i]+" ");
        }

    }
}
