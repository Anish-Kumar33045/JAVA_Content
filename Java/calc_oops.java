// method  overloading concept

 class calculator{

public int add(int a ,int b){ 
    return a+b ;
}

public int add(int a , int b , int c){  // depends upon no. of parameters
    return a+b+c ;
}

public double  add(double a , int b){    // it depends on datatype
    return a+b ;
}


}




public class calc_oops {


public static void main (String a[]){

calculator obj = new calculator();
int r = obj.add(5,8);
System.out.println(r);

}

}