package io.catalyte.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestLambdaExercise {

	LambdaExercise exercise;

	@Before
	public void init() {

		exercise = new LambdaExercise();

	}

	@Test
	public void testDisplayList() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		
		PrintStream originalOut = System.out;
		
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
		
		System.setErr(new PrintStream(errContent));
		
		List<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios"));
		
		exercise.displayList(words);
		
		assertEquals("hi\nhello\nhola\nbye\ngoodbye\nadios\n", outContent.toString());

		System.setOut(originalOut);
		
		System.setErr(originalErr);

	}

	@Test
	public void testSortByLetterE() {

		String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };

		String[] expected = { "hello", "bye", "goodbye", "hi", "hola", "adios" };

		String[] result = exercise.sortByLetterE(words);

		assertTrue("Array not in expected order. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result)
				+ ".", Arrays.equals(expected, result));

	}

	@Test
	public void testCapitalizeAllWords() {

		ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios"));

		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Hi", "Hello", "Hola", "Bye", "Goodbye", "Adios"));

		ArrayList<String> result = exercise.capitalizeAllWords(words);

		assertTrue(
				"Array not capitalized. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".",
				Arrays.equals(expected.toArray(), result.toArray()));

	}

	@Test
	public void testSummarizeWeatherData() {

		ArrayList<Integer> temps = new ArrayList<>(Arrays.asList(32, 41, 28, 37, 36, 40, 18));

		HashMap<String, Integer> expected = new HashMap<>();

		expected.put("Maximum", 41);

		expected.put("Minimum", 18);

		HashMap<String, Integer> result = exercise.summarizeWeatherData(temps);

		assertTrue("Wrong summary information. Expected: Maximum=41, Minimum=18. Got: " + result.entrySet() + ".",
				expected.equals(result));

	}

}