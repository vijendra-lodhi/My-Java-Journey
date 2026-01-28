import java.util.Scanner;
public class L1_piramid {
    
    Scanner input = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter the no of cols : ");
        Scanner input = new Scanner(System.in);

        int data = input.nextInt();
        int col = data-1;
        int row  = col/2;
       

        for(int i=0; i<=row; i++){
            for(int j=0; j<=col; j++){
                if( row-i <= j && row+i >= j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
    

}
