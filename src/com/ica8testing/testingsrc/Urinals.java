package com.ica8testing.testingsrc;

class Urinals{

    /**
     * validates the string
     * @param str
     * @return
     */
    Boolean validateString( String str ) {
        if(str == null) return false;
        int n = str.length();
        for(int i=0;i<n;i++) {
            if(str.charAt(i)=='0' || str.charAt(i)=='1') continue;
            else return false;
        }
        return true;
    }

    //Author: Srikar Ballipalli
    // GITHUB repo: https://github.com/sballip1/ica8testing
    public static void main(String[] args) {
        System.out.println("inside main");
    }
};