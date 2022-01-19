package First_Lab;

import java.util.Scanner;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class Using_Methods {
    public static void main(String[] args) {

        int []Array =new int [4];
        Input_Array_Elements(Array);
        Print_Array_Elements(Array);
    }
    public static void Print_Array_Elements(int []x){
        System.out.println("Array Elements are:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"\t");
        }
    }
    public static void Input_Array_Elements(int []y){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter 4 Elements");
        for (int i = 0; i <y.length ; i++) {
            y[i]=input.nextInt();
        }
    }
}
