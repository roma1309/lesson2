package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 5;
        a[1] = 1;
        a[2]=0;
        for (int i = 2; i > -1; i--) {
            System.out.print(a[i]);
            {
                switch (a[i]) {
                    case 5:
                        System.out.println(" это месси");
                        break;
                    case 1:
                        System.out.println(" это роналдо");
                        break;
                    default:
                        System.out.println(" ЭТО ГЛЕБ");
                }
            }
        }
    }
}
