package First_Lab;

import java.util.Scanner;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int []arr =new int [4];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
