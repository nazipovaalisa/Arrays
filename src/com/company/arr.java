package com.company;

import java.util.Arrays;

public class arr {

    static void task1 ( int[] a){
        int last = 0;
        int indexlast = 0;
        int temp;
        boolean flag = false;
        for (int i = a.length - 1; i >= 0 ; i--){
            if(isPrime(a[i])){
                if(!flag){ //если это первое простое с конца
                    last = a[i]; //запоминаем последний элемент
                    indexlast = i; //запоминаем индекс последнего элемента
                    flag = true;
                }
                else{
                    temp = a[i];
                    a[i] = last;
                    a[indexlast] = temp;
                    indexlast = i;
                }
            }
        }
    }
    static boolean isPrime(int n){
        if (n < 2)
            return false;
        int temp;
        boolean prime = true;
        for (int i=2; i<=n/2; i++) {
            temp = n % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    static void task2(int[] b){
        int start = 0;
        int max_length = 0;
        int length = 0;
        for (int i = 0; i<b.length; i++){
            if(b[i] == 1) {
                length++;
                if(max_length < length) {
                    max_length = length;
                    start = i-(max_length-1);
                }
            }
            else
                length = 0;
        }
        System.out.printf("длина наибольшей последовательности единиц: %d \n", max_length);
        System.out.printf("индекс первого элемента последовательности: %d \n",start);
    }
    static int[] task3(int[]a){
        int[] b = {};
        for (int i=0; i<a.length; i++){
            if(Arrays.binarySearch(b,a[i])<0) {
                b = Arrays.copyOf(b, b.length + 1);
                b[b.length-1] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
        return b;
    }

    static void task4(int[][] m){
        if(magic(m)){
            System.out.println("Матрица является магическим квадратом");
            transport(m);
            for(int i=0; i<m.length; i++) {
                arr.reverse(m[i]);
                System.out.println(Arrays.toString(m[i]));
            }
        }
        else
            System.out.println("Матрица не является магическим квадратом");
    }

    static boolean magic(int[][] m){
        if(m.length != m[0].length)
            return false;
        int n = m.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<n ; i++) {
            sum1 += m[i][i];
            sum2 +=m[i][n-1-i];
        }
        if(sum1 != sum2)
            return false;
        for (int i=0; i<n; i++){
            int rowsum = 0;
            for(int j=0; j<n; j++)
                rowsum+= m[i][j];
            if(rowsum!=sum1)
                return false;
        }
        for(int i=0; i<n; i++){
            int colsum = 0;
            for(int j=0; j<n; j++)
                colsum += m[j][i];
            if(colsum!=sum1)
                return false;
        }
        return true;
    }

    static void transport(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j= i; j<m[i].length; j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
     static void reverse (int[] c){
        for(int i=0; i<c.length/2; i++){
            int temp = c[i];
            c[i] = c[c.length-i-1];
            c[c.length-i-1] = temp;
        }
     }

}

