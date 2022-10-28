package com.ica8testing.testingsrc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Urinals{

    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public List<String> openFile(String filename) throws IOException {
        File file1 = new File("testfile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        List<String> inputs = new ArrayList<String>();
        String s;
        while((s = br.readLine())!=null)
            inputs.add(s);
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