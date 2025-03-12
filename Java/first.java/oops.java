class addition{
    int a;
      public int add(int n1,int n2){
        int r = n1 + n2 ;
        return r ;

      }
}


class oops {
    public static void main (String args[]){
        int num1=5;
        int num2=6;

        addition calc = new addition();
        int result = calc.add(num1,num2);

      // int result = calc.add( 5 , 6 );
        
        System.out.println(result);

    }
}