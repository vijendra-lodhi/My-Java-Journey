class l40_encap{
    public static void main(String args[]){
        beauty obj = new beauty();

        obj.setman("Power");

        System.out.println(obj.getman());
    
        
    }
}

class beauty{
    String man;

    String getman(){
        return man;
    }
    void setman(String value){
        man = value;

    }
}