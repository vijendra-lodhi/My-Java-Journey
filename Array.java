public class Array
{
    public static void main(String args[])
    {

        int[] array = new int[5];
        for(int i=0; i<5; i++){
            array[i] = (int)(Math.random()*100); 
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ "  ");
        } 
        
    }

}