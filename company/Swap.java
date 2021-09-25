package com.company;

import java.util.Arrays;

public class Swap {
    public void  swapCornerWords(String words){
         String[] arr=words.split(" ");
        System.out.println(Arrays.toString(arr));
        String temp=null;

           temp =arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));


        }
    public static void main(String[] args) {
        Swap obj=new Swap();
        String words="Hello this is the GFG user";
        obj.swapCornerWords(words);
    }
}
