class L4_string {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "vijendra";
        s1.number = 56;
        s1.standard = 12;

        System.out.println(s1.name +"  "+s1.number+" "+s1.standard);
        
    }
}

class Student{
    String name ;
    int number ;
    int standard ;

}
