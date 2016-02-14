package gittest;
import java.util.ArrayList;

import junit.framework.*;

public class ConverRandomStringToInt {
	
	public ArrayList<String> StringList(String input){
		//char[] array = input.toCharArray();
		ArrayList<String> newList = new ArrayList<String>();
		int inputLength = input.length();
		newList.add(String.valueOf(inputLength));
		for(int i = 1; i < inputLength; i++){ // the number of chars needed to convert
			for(int j = 0; j < inputLength; j++){ // start converting from j with i chars
				String first = input.substring(0,j);
				String middle = String.valueOf(i);
				String last;
				if(j+i > inputLength){
					last = input.substring(inputLength);
					break;
				}else{
					last = input.substring(j+i);
				}
				newList.add(first + middle + last );
			}
		}
		return newList;
	}
	
	public static void main(String[] args){
		ConverRandomStringToInt test = new ConverRandomStringToInt();
		String input1 = "abcd";
		ArrayList<String> actual1 = test.StringList(input1);
		ArrayList<String> expected1 = new ArrayList<String>();
		expected1.add("3");	
		expected1.add("1bc");
		expected1.add("a1c");
		expected1.add("ab1");
		expected1.add("2c");
		expected1.add("a2");
		System.out.println(actual1);
		//TestCase.assertTrue(expected1.equals(actual1));
		
		String input2 = "ab";
		ArrayList<String> actual2 = test.StringList(input2);
		ArrayList<String> expected2 = new ArrayList<String>();
		expected2.add("2");
		expected2.add("1b");
		expected2.add("a1");
		
		TestCase.assertTrue(expected2.equals(actual2));
		
		
		
	}
}
