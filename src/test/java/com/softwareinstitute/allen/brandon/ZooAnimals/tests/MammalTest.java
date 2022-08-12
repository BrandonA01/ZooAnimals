package com.softwareinstitute.allen.brandon.ZooAnimals.tests;

import com.softwareinstitute.allen.brandon.ZooAnimals.Bat;
import com.softwareinstitute.allen.brandon.ZooAnimals.Mammal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MammalTest {
    @Test
    void get_mammal_breathing(){
        Mammal testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Breathing...", testBat.breathe(), "Mammal is being asphyxiated");
    }
}
