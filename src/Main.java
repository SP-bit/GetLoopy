public class Main
{
    public static void main(String[] args)
    {
        for(int count=5; count>0; count-- ) {
            for (int row = 0; row < count; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}