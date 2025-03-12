class ternary{   // ternary or condinal operator ?:

    public static void main (String args[] ){

        int a=7;
        int b =6;

        int result = 0;
        // if(a>b)
        // System.out.println(10);
        // else 
        // System.out.println(20);

       result =  a>b ? 10 : 20;       // true 
        System.out.println(result);

        System.out.println();

       result =  a<b ? 10 : 20;       // false 
        System.out.println(result);

        }
    }
// is elseif else are same as in cpp
//  if expression is true it excutes 2 nd statement 
// other wise 3 rd statement is excuted .