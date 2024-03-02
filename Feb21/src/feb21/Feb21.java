/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb21;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ahmed
 */
public class Feb21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int []n ={5,2,3,-1,0,4,6};
        //-1,0,2,3,4,5,6
        Arrays.sort(n);
        System.out.println(Arrays.binarySearch(n, 2));
                System.out.println(Arrays.binarySearch(n,1 ));

                int[] numbers1 = new int[8];
                Arrays.fill(numbers1, 3);
                                int[] numbers2 = new int[3];
                                                Arrays.fill(numbers2, 1);


print(numbers1);                
print(numbers2);
                
        char[] c = {'a','b','c'};
System.out.println("\n"+c[2]);
int[]numbers={0,1};
change(numbers);
print(numbers);
getnumbers();
print(numbers);

//2D

     int [][]integers = new int[1][2];
         integers[0][1]=1;
          
         
         int [][]integers2 = {{3,5,7},{10,2,9}};
         System.out.println(Arrays.toString(integers2));
         printArray(integers2);
    }
    public static void change(int [] numbers){
        numbers[0]=1;
        numbers[1]=0;
    }
    public static void print(int[]numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(+numbers[i]+" ");
        }
    }
    public static void printArray(int[][]integers){
        for(int i =0;i<integers.length;i++){
            for(int j=0;j<integers[i].length;j++){
                System.out.print(integers[i][j]+" ");
            }
                            System.out.println();

        }
    }
  
        public static int[] getnumbers(){
     int []numbers = {1,2,3,4,5};
     return numbers;
    }
        
        
}
