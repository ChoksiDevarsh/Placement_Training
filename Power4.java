package Java.Placement_Training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (Math.pow(i, 4) == n) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
