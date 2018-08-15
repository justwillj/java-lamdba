package io.catalyte.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExercise{
	
	/**
	 * Takes a List of strings and displays each element's value to the console
	 * 
	 * @param s the List of Strings to be printed out to the console.
	 */
	public void displayList(List<String> words){
		
		
	}
	
	
	/**
	 * Accepts a list of integers and displays the number in the console if it is an even number that is below 100.
	 * 
	 * @param s the List of Strings to be printed out to the console.
	 */
	public void displayIntegers(List<Integer> numbers){
		
		
	}
	
	/**
	 * Sums the total of all elements of the given array of 
	 * if the string is not empty
	 * 
	 * @param s the List of Strings to be printed out to the console.
	 */
	public int sumIntegers(List<Integer> numbers){
		
		return -1;
		
	}
	
	/**
	 * Filters a list of given usernames so that it no longer 
	 * contains any customers included in the given set.
	 * 
	 * @param user	 the List of users to be filtered.
	 * @param customers the Set of customer names to be removed from the list of users.
	 * 
	 * @return the filtered list of users.
	 */
	public List<String> filterList(Set<String> customers, List<String> users){
		
		return null;
		
	}
	

    /**
     * Sorts an array of Strings so that words that contain the letter 'e' appear first
     * and all other words appear after.
     *
     * @param words the array of strings to be sorted.
     *
     * @return The array of strings with words starting.
     */
    public String[] sortByLetterE(String[] words){

    	return null;

    }
    
    /**
     * Takes an array of Strings and filters it with the given Predicate.
     *
     * @param words the array of strings to be capitalized.
     *
     * @return the array of strings with all words capitalized.
     */   
    public List<String> filterWords(ArrayList<String> words, Predicate<String> predicate){
    	
    	return null;
    	
    }

    /**
     * Takes an array of Strings and capitalizes the first letter of each word.
     *
     * @param words the array of strings to be capitalized.
     *
     * @return the array of strings with all words capitalized.
     */   
    public List<String> capitalizeAllWords(ArrayList<String> words){
    	
    	return null;
    	
    }
    
    /**
     * Takes a list of temperatures as ints and returns the minimum and maximum values. 
     *
     * @param t the List of temperatures to be summarized.
     *
     * @return a HashMap with the minimum and maximum temperatures.
     */   
    public HashMap<String, Integer> summarizeWeatherData(List<Integer> t){
    
    	return null;
    
    }

}
