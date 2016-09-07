package com.ccsi;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String num="6699";
        System.out.println(isStrobogrammatic(num));
    }
    //A strobogrammatic number is a number that looks the same when rotated 180 degree
    //looked at upside down.
    //Write a function to determine if a number is strobogrammatic.The number is represented as a string.
    public static boolean isStrobogrammatic(String num){
        if(num==null||num.length()==0) return false;
        Map<Character,Character> map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        int p=-1,q=num.length();
        while (++p<=--q){
            if(!map.containsKey(num.charAt(p))){
                return false;
            }else if(num.charAt(p)!=map.get(num.charAt(q))){    //利用map逆转比较
                return false;
            }
        }
        return true;
    }
}
