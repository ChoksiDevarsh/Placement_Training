package Java.Placement_Training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ascii {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];

        for(int i = 0; i < arr.length;i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        int[] result = new int[4];
        for(int i = 0; i< arr.length;i++){
            System.out.println((char)arr[i]+"-"+arr[i]);
            result[i] = (char)arr[i];
        }
        
    }
}
