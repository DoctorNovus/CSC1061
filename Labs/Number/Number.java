package Labs.Number;

import java.util.Scanner;

public class Number {
    private int num;

    public Number(int n) {
        num = n;
    }

    public String toString() {
        /* Type your code here */
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num = n;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputNum = scnr.nextInt();
        Number yourNum = new Number(inputNum);
        System.out.print(yourNum);
    }
}