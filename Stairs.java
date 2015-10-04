import java.io.*;
import java.util.*;

class Stairs
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try{
            n = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("not numeric val");
        }
        int a = 0; int b = 0;
        int d = n;
        if(n>=1 && n<=100){
            for(int t = 0; t < n; t++) {
                b = 0;
                while(d >= b  ){
                        System.out.print(' '); 
                    b++;
                } 
                d = n-t-1; 
                while(a <= t ){
                    System.out.print('#'); 
                    a++;
                }
                a = 0;

                System.out.println('\n');
            }
        } else { System.out.print("given value must be under 100 and over 1");}  
    }
}