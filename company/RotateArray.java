package com.company;

import java.util.Scanner;

public class RotateArray {

    public int  rotate(int[] number,int key){

        for (int i = 0; i < number.length; i++) {
            if(number[i]==key){
                return i;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        RotateArray obj=new RotateArray();
        int number[]={5, 6, 7, 8, 9,10, 1, 2, 3};
        int key=10;
        int answer=obj.rotate(number,key);
        System.out.println(answer);

    }
}
