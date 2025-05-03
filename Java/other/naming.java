class A {

    public A(){
       System.out.println("object created ");
    }

    public void show(){
        System.out.println("in A show ");
    }
}


class naming{

        public static void main ( String arg[]){
            //  int marks = 99;
            //  int marks ;
            //   marks = 99;
            //  it can written as 
            //  A obj ;
            //  obj = new A();

            //  here the object is created in line 
            //   new A();  not the whole line

        // A obj = new A();   // reference object 
        new A();  // anonymous object 

        new A().show();

        new A();   // every time it is called it creates the new object .




    }
}


// Camel casing
// class and interface - Calculator ( Capital letters)
// variable and method - starts from small letters
// constants - ( all capitals ) PIE , BRAND . 
// maintaing conventions makes readble
// Human()  --> like this represents the constructor   
// showMyMarks  ( small and capital combination )
// show_My_Marks 
// MyData 