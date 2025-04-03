package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] arr){
    	
        //String result = arr[0] + arr[1]+ arr[2];
        String returnString = "";
        for (String temp : arr) {
        	returnString += temp;
        }
        return returnString;
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//        }
//
//        return result;
//    }
    }
}
