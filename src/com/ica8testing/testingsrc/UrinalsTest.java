package com.ica8testing.testingsrc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;


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

    @Test
    void testOpenFileNoFile() throws IOException {
        Urinals urinals = new Urinals();
        List<String> result;
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> urinals.openFile("testfile2.txt"),
                "throw error"
        );
    }

    @Test
    void testCountUrinalsCase1(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("0000"),2);
    }

    @Test
    void testCountUrinalsCase2(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("1001"),0);
    }

    @Test
    void testCountUrinalsCase3(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("11111"),0);
    }

    @Test
    void testCountUrinalsCase4(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("1000001"),2);
    }

    @Test
    void testCountUrinalsCase5(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("100000"),2);
    }

    @Test
    void testCountUrinalsCase6(){
        Urinals urinals = new Urinals();
        Assertions.assertEquals(urinals.countUrinals("0000001"),3);
    }

}