package io.catalyte.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;

public class TestLambdaExercise {

	LambdaExercise exercise;

	@Before
	public void init() {

		exercise = new LambdaExercise();

	}

	@Test
	public void testAverageInts() {
		
		int[] ints = {2,4,6,8,10,12};
		
		Double expected = new Double(7);
		
		Double result = exercise.averageInts(ints);
		
		assertEquals("Wrong average. Expected: " + expected + ". Got: " + result, expected, result);	
		
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
		
		assertEquals("Did not display expected values. Expected: hi\nhello\nhola\nbye\ngoodbye\nadios\n. Got: " + outContent.toString(),"hi\nhello\nhola\nbye\ngoodbye\nadios\n", outContent.toString());

		System.setOut(originalOut);
		
		System.setErr(originalErr);

	}
	
	@Test
	public void testDisplayIntgers() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		
		PrintStream originalOut = System.out;
		
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
		
		System.setErr(new PrintStream(errContent));
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 45, 101, 67, 203, 8));
		
		exercise.displayIntegers(numbers);
		
		assertEquals("Did not display expected values. Expected: 2 8. Got: " + outContent.toString(), "2\n8\n", outContent.toString());

		System.setOut(originalOut);
		
		System.setErr(originalErr);

	}
	
	@Test
	public void testSumIntegers() {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		int expected = 45;
		
		int result = exercise.sumIntegers(numbers);
	
		assertTrue("Wrong value for sum. Expected: " + expected + " Got:" + result + ".", result == expected);

	}
	
	@Test
	public void testFilterList() {
		
		Set<String> customers = new HashSet<>(Arrays.asList("John Johnson", "BF Goodrich", "Glenda Goodwitch"));
		
		List<String> users = new ArrayList<>(Arrays.asList("Glenda Goodwitch", "Frank Enearnest", "Joe Blow", "GI Jane", "Les Ismore", "BF Goodrich"));
		
		List<String> expected = new ArrayList<>(Arrays.asList("Frank Enearnest", "Joe Blow", "GI Jane", "Les Ismore"));
		
		List<String> result = exercise.filterList(customers, users);
		
		expected.toArray(new String[expected.size()]);
		
		assertTrue("Array does not contain expected users. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".", 
				Arrays.equals(expected.toArray(), result.toArray()));

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

		List<String> result = exercise.capitalizeAllWords(words);

		assertTrue(
				"Array not capitalized. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".",
				Arrays.equals(expected.toArray(), result.toArray()));

	}
	
	@Test
	public void testFilterWords() {
		
		ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios"));
		
		Predicate<String> predicate = w -> w != null && w.length() > 4;
		
		List<String> expected  = new ArrayList<>(Arrays.asList("hello", "goodbye", "adios"));
		
		List<String> result = exercise.filterWords(words, predicate);
		
		assertTrue(
				"Array not capitalized. Expected: " + Arrays.asList(expected) + " Got:" + Arrays.asList(result) + ".",
				Arrays.equals(result.toArray(), expected.toArray()));
		
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