public class L2_TwoDarray {
    public static void main(String args[]){
        int row = 3;
        int col = 5;
        int[][] array = new int[row][col];

        for(int i=0; i<array.length; i++){     
            for(int j=0; j<array[i].length; j++){
                array[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
