package io.catalyte.training;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdaExercise {

  /**
   * Takes a List of strings and displays each one to the console.
   *
   * @param words the List of Strings to be displayed.
   */
  public void displayList(List<String> words) {
    //Prints all the words in a list in the console
    words.stream().forEach(word -> System.out.println(word));
  }

  /**
   * Accepts a List of Integers and displays the number in the console if it is an even number that
   * is below 100.
   *
   * @param numbers the List of Strings to be displayed.
   */
  public void displayIntegers(List<Integer> numbers) {
    //Link that helped me with this problem
    //https://howtodoinjava.com/java8/stream-if-else-logic/
    //https://www.geeksforgeeks.org/lambda-expressions-java-8/

    //Checks to make sure its even
    Predicate<Integer> isEven = i -> i % 2 == 0;
    //Checks to see if it is greater then 100
    Predicate<Integer> isGreaterThen100 = i -> i < 100;

      numbers.stream()
              .filter(isGreaterThen100)
              .filter(isEven)
              .forEach(System.out::println);
  }

  /**
   * Sums the given List of Integers
   *
   * @param numbers the List of Integers to be summed.
   * @return the sum as a primitive integer.
   */
  public int sumIntegers(List<Integer> numbers) {
    //Link to the resource that helped me with this problem
    //https://www.baeldung.com/java-stream-sum

    //Setting a variable of the sum, so we can return it later
   int total = numbers.stream()
           //This will loop through and add each number together
            .reduce(0,(x,y)->x+y);

   return total;
  }

  /**
   * Finds the average value for the given array of primitive integers.
   *
   * @param ints the array of primitive integers
   * @return the average given as a Double
   */
  public Double averageInts(int[] ints) {
    //Link to another method of getting the average by using intStream average()
    //https://www.geeksforgeeks.org/intstream-average-in-java-with-examples/

    //Grabs the amount of ints inside the array
    int count = (int) Arrays.stream(ints).count();
    //Gets the sum of the array of ints
    double sum = Arrays.stream(ints).sum();

    return sum/count;

  }

  /**
   * Filters a given list of usernames by removing any that match the given set of customer names.
   *
   * @param users     the List of users to be filtered.
   * @param customers the Set of customer names to be removed from the list of users.
   * @return the filtered list of users.
   */
  public List<String> filterList(Set<String> customers, List<String> users) {

    return null;

  }

  /**
   * Sorts an array of Strings so that words that contain the letter 'e' appear before all the other
   * words.
   *
   * @param words the array of strings to be sorted.
   * @return a sorted array of Strings.
   */
  public String[] sortByLetterE(String[] words) {

    return null;

  }

  /**
   * Takes an array of Strings and capitalizes the first letter of each word.
   *
   * @param words the array of strings to be capitalized.
   * @return a List of capitalized words.
   */
  public List<String> capitalizeAllWords(ArrayList<String> words) {

    return null;

  }

  /**
   * Takes an array of Strings and filters it with the given Predicate.
   *
   * @param words     the List of words to be filtered.
   * @param predicate the predicate used to evaluate the given list of words
   * @return a filtered List
   */
  public List<String> filterWords(ArrayList<String> words, Predicate<String> predicate) {

    return null;

  }

  /**
   * Takes a list of temperatures as ints and returns the minimum and maximum values.
   *
   * @param t the List of temperatures to be summarized.
   * @return a HashMap containing the minimum and maximum temperatures.
   */
  public HashMap<String, Integer> summarizeWeatherData(List<Integer> t) {

    return null;

  }

}
