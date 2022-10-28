package com.ica8testing.testingsrc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Urinals{


    public void appendToFile(String fileName, List<String> output){
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));

            for(String str: output){
                out.write(str);
                out.newLine();
            }
            out.close();
        }

        catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }

    /**
     * Calculates the number of 1s in valid string
     *
     * @param s
     * @return result
     */
    public String countUrinals(String s){
        int result = 0;
        int streak = 0;
        for(int i = 0;i<s.length();i++) {
            int c = s.charAt(i);
            if(c=='0') {
                streak++;
                if(i>0 && s.charAt(i-1)=='1') streak--;
            }
            else {
                if(streak>0) {streak--;}
                result += (streak/2 + streak%2);
                streak = 0;
            }
        }
        result += (streak/2 + streak%2);
        return Integer.toString(result);
    }

    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public List<String> openFile(String filename) {
        File file1 = new File(filename);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file1));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<String> inputs = new ArrayList<String>();
        String s;
        while(true) {
            try {
                if (!((s = br.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            inputs.add(s);
        }
        return inputs;
    }

    /**
     * validates the string
     * @param str
     * @return
     */
    Boolean validateString( String str ) {
        if(str == null || str.isEmpty()) return false;
        int n = str.length();
        for(int i=0;i<n;i++) {
            if(str.charAt(i)!='0' && str.charAt(i)!='1') return false;
        }
        return true;
    }

    //Author: Srikar Ballipalli
    // GITHUB repo: https://github.com/sballip1/ica8testing
    public static void main(String[] args) {
        System.out.println("inside main");
    }
};