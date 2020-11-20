package backJun;

import java.util.Scanner;

public class WhileHap {

    public static void main(String[] args) {
        int i=0;
        Scanner scan = new Scanner(System.in);

        while(i<5){
            i=i+1;
            int jung = scan.nextInt();
            int su = scan.nextInt();

            System.out.println(jung+su);
        }
    }
}