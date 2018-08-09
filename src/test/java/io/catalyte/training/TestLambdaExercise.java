package io.catalyte.training;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLambdaExercise{

    LambdaExercise exercise;

    @Before
    public void init(){

        exercise = new LambdaExercise();

    }

    @Test
    public void testSortByLetterE(){

        String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };

        String[] expected = {"hello", "bye", "goodbye","hi", "hola", "adios" };

        String[] result = exercise.sortByLetterE(words);

        assertTrue("Array not in expected order. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".", Arrays.equals(expected, result));

    }
    
    
    @Test
    public void testCapitalizeAllWords(){

    	ArrayList<String> words = new ArrayList<>(Arrays.asList( "hi", "hello", "hola", "bye", "goodbye", "adios" ));

    	ArrayList<String> expected = new ArrayList<>(Arrays.asList( "Hi", "Hello", "Hola", "Bye", "Goodbye", "Adios" ));

    	ArrayList<String> result = exercise.capitalizeAllWords(words);

        assertTrue("Array not capitalized. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".", Arrays.equals(expected.toArray(), result.toArray()));

    }

}