class forLoop{
    public static void main(String args[]){
        int[] array = new int[6];

        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*100);
        }

        for(int n :array){
            System.out.println(n);
        }

    }
}