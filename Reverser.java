import java.util.*;
import java.io.*;

public class Reverser{
    public static void main(String [] args)throws Exception{
        Scanner scanner = new Scanner(new File("arraynumbers.text"));
        PrintWriter output = new PrintWriter("reversed.text");

        int header= scanner.nextInt();
        output.println(header);

        //read the array
        int[] array = new int[header];
        for(int i = 0; i < array.length;i++){
            array[i]= scanner.nextInt();
        }
        reverse(array);

        for(int i = 0;i < header;i++){
            output.println(array[i]);
        }
        output.close();
    }
    static void reverse(int[] array){
        for(int i = 0;i < mid(array);i++){
            swap(array,i,mirror(i, array.length));
        }
    }

    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static int mirror(int i, int length){
        return length - 1 - i;
    }

    static int mid(int[] array){
        return array.length / 2 ;
    }
}
