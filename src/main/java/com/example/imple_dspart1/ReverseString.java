package com.example.imple_dspart1;

public class ReverseString {
    public String stringReverse(String str){
        char [] chr = str.toCharArray();
        String str1="";
        for(int i=chr.length-1;i>=0;i--){
            str1+=chr[i];
        }
        return str1;
    }
}
