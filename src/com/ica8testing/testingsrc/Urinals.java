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