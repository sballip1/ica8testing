package com.ica8testing.testingsrc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;


public class UrinalsTest{


    @Test
    void testValidateStringFalseCase(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.validateString("12sb"),false);
    }

    @Test
    void testValidateStringNull(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.validateString(null),false);
    }

    @Test
    void testValidateStringForEmpty(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.validateString(""),false);
    }

    @Test
    void testValidateStringForTrue(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.validateString("101001110"),true);
    }

    @Test
    void testOpenFile() throws IOException {
        Urinals urinals = new Urinals();
        List<String> result;
        result = urinals.openFile("testfile.txt");
        Assertions.assertEquals(result.size(),1);
        for(String s:result)
            Assertions.assertEquals(s,"abc");
    }

}