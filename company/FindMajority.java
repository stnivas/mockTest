package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindMajority {

    public void majority(int[] number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int last = 0;
        for (int i = 0; i < number.length; i++) {
            if (map.containsKey(number[i])) {
                map.put(number[i], map.get(number[i]) + 1);
            } else {
                map.put(number[i], 1);
            }
        }
//        for (map.:
//             ) {
            
//        }
    }
       
          
    public static void main(String[] args) {
         FindMajority obj=new FindMajority();
         int[] number={1,2,3,3,3,3,4,4};
         obj.majority(number);
        //System.out.println(max);

    }
}
