class Student 
{
    String name ;
    int age ;
    int rollno ;
}


class Demos{
    public static void main ( String arg[])
    {
      Student s1 = new Student();
      s1.name   = " Rocky ";
      s1.rollno = 01;
      s1.age    = 18;

      Student s2 = new Student();
      s2.name   = "Rani";
      s2.rollno = 02;
      s2.age    = 21;

      Student s3 = new Student();
      s3.name   = "rakesh";
      s3.rollno = 03;
      s3.age    =19;

      Student s4 = new Student();
      s4.name   = "Mahesh";
      s4.rollno = 04;
      s4.age    =23;

      Student students[] = new Student [4];
      students[0]=s1;
      students[1]=s2;
      students[2]=s3;
      students[3]=s4;
      

      for(int i=0; i<3; i++){
        System.out.println(students[i].name + " : " + students[i].rollno);
      }

      for(int i=0; i<students.length; i++){
        System.out.println(students[i].name + " : " + students[i].age);
      }

    
      for(Student stud : students){
      System.out.println(stud.name + " : "+ stud.rollno);  // enhanced for loop
       }
       

      //  for(int i=1;i<5;i++){
      //   System.out.println(students[i]);    // prints something
      //  }


    }
}



