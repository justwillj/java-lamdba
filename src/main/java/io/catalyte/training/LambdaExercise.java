package io.catalyte.training;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
    //Link that goes over how to use removeIf to check if a condition is met
    //https://www.geeksforgeeks.org/arraylist-removeif-method-in-java/

    //Checks over the users array and see if customers has the same value and if so remove it
    users.removeIf(y -> customers.contains(y));
    return users;

  }

  /**
   * Sorts an array of Strings so that words that contain the letter 'e' appear before all the other
   * words.
   *
   * @param words the array of strings to be sorted.
   * @return a sorted array of Strings.
   */
  public String[] sortByLetterE(String[] words) {
    //Link that helped me with this problem the user Bhaskar used comparator to see if the strings contained the certain
    //letter. Also found a link to explain how comparator work in helping us sort out the array
    //https://stackoverflow.com/questions/63125478/sorting-strings-in-an-array-by-including-a-certain-character-with-lambda-usin
    //https://www.geeksforgeeks.org/comparator-interface-java/

    //Sorts through the array and if the string contains e and if so displays them first
    Arrays.sort(words,Comparator.comparing(y->y.contains("e")?0:1));

    return words;

  }

  /**
   * Takes an array of Strings and capitalizes the first letter of each word.
   *
   * @param words the array of strings to be capitalized.
   * @return a List of capitalized words.
   */
  public List<String> capitalizeAllWords(ArrayList<String> words) {
    //Links that helped me with this problem was this YouTube video that explains how to make each word lowercase or upper
    //https://www.youtube.com/watch?v=lDtOEpOdM6o
    //The user Paul Boddington had a method to only do the first letter of each word so I was able to use both the youTube
    //video and his method
    //https://stackoverflow.com/questions/33352677/convert-first-character-of-string-to-uppercase-using-java-8-lambdas-only

    //Creates a variable to hold the new List
   List<String> firstLetter = words.stream()
           //Using the map we are able to apply toUpperCase to the words
           .map(y->Character.toUpperCase(y.charAt(0))+y.substring(1))
           //This will return the new list with the first letter being capitalized
           .collect(Collectors.toList());
    return firstLetter;

  }

  /**
   * Takes an array of Strings and filters it with the given Predicate.
   *
   * @param words     the List of words to be filtered.
   * @param predicate the predicate used to evaluate the given list of words
   * @return a filtered List
   */
  public List<String> filterWords(ArrayList<String> words, Predicate<String> predicate) {

    //Goes through the words list
    List<String> filter = words.stream()
                //Apply the predicate using filter to only allow the words with the correct properties to go through
              .filter(predicate)
                //Apply the filtered words back to the list
              .collect(Collectors.toList());
    return filter ;

  }

  /**
   * Takes a list of temperatures as ints and returns the minimum and maximum values.
   *
   * @param t the List of temperatures to be summarized.
   * @return a HashMap containing the minimum and maximum temperatures.
   */
  public HashMap<String, Integer> summarizeWeatherData(List<Integer> t) {
    //Link that helped me with this problem to get the min and max values
    //https://www.geeksforgeeks.org/stream-min-method-in-java-with-examples/

    //Sets the String value for the min and max
    String max = "Maximum";
    String min = "Minimum";

    //Gets the min and max values of the list of integers
    Integer maxTemp = t.stream().max(Integer::compare).get();
    Integer minTemp = t.stream().min(Integer::compare).get();

    //Creates a new HashMap to store the data
    HashMap<String, Integer> mapOfTemp = new HashMap<>();

    //Puts the max and min values inside the new HashMap
    mapOfTemp.put(max,maxTemp);
    mapOfTemp.put(min,minTemp);

    return mapOfTemp;

  }

}
