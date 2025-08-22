package view;

import controller.Function;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Function fn = new Function();
        int size = (int)((Math.random() * 100000) % 10);
        int[] vec = new int[size];
        for (int i = 0; i < size; i++) {
            vec[i] = (int)((Math.random() * 100000) % 100);
        }

        System.out.print("|");
        for (int num : vec) {
            System.out.print(num + "|");
        }
        System.out.println();

        System.out.print("O menor valor é ");
        System.out.print(fn.find(vec, size - 1, vec[size - 1]));
        System.out.print("\n");
    }
}
