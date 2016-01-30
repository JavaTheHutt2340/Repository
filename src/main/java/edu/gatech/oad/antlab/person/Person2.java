package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
	/** Holds the persons real name */
	private String name;
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
		name = pname;
	}
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		//Person 2 put your implementation here
		char[] inputCharArray = input.toCharArray();
		char temp;
		Random rnd = new Random();
		for (int i = 0; i < input.length() - 1; i++) {
			int index = rnd.nextInt(i + 1);
			char a = inputCharArray[index];
			inputCharArray[index] = inputCharArray[i];
			inputCharArray[i] = a;
		}
		String randName = "";
		for (int i = 0; i < inputCharArray.length; i++) {
			randName += Character.toString(inputCharArray[i]);
		}
		System.out.print(randName);
		return randName;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
		return name + calc(input);
	}
}