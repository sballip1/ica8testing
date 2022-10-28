package com.ica8testing.testingsrc;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


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

}