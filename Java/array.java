// Note by default int value for array is zero

public class array{
    public static void main(String arg[]) {
        
        int nums[][] = new int [3][4];

        for(int i=0;i<3;i++){
            for (int j = 0 ; j<4;j++){

              nums[i][j] = (int) (Math.random()*100);  // math.random gives the value in double so convert to double.
              
            }
            
        }

System.out.println();

        for(int i=0;i<3;i++){
            for (int j = 0 ; j<4;j++){

                System.out.print(nums[i][j] + " ");
            }
           System.out.println();    
        }
    }
}