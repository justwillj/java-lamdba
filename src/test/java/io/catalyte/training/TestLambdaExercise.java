package io.catalyte.training;

import org.junit.Before;
import org.junit.Test;

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

        System.out.println("Sorted by whether it contains 'e' [v1] : " + Arrays.asList(words));

    }


}