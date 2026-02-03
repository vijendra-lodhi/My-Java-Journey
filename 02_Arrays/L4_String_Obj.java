class L4_String_Obj{
    public static void main(String args[]){

        student s1 = new student();
        s1.student_name = "vijendra";
        s1.number = 76;
        s1.age = 24;

        student s2 = new student();
        s2.student_name = "karan";
        s2.number = 23;
        s2.age = 29;

        student s3 = new student();
        s3.student_name = "Manshi";
        s3.number = 76;
        s3.age = 25;

        student[] array = new student[3];

        array[0] = s1;
        array[1] = s2;
        array[2] = s3;

        for(int i=0; i<array.length; i++){
            System.out.print(array[i].student_name+ " : "+array[i].number+ " : "+array[i].age +"\n");
        }

    }

}

class student{
    String student_name;
    int number;
    int age;
}