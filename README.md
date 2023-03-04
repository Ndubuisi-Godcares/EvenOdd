# Array Conversion

This is a java program that demonstrates how to convert an array of integers to an ArrayList of integers in Java. The code is simple and easy to understand, making it a great example for beginners to learn from.

The program accepts input from the user using the Scanner and ArrayList classes from the java.util package.

Then, in the main method, a Scanner object is created to read user input. An array of integers called numbers is initialized with a length of 10. The variable count is set to 1 to start the while loop. The program prompts the user to enter 10 numbers and reads in the first integer with input.nextInt().

In the while loop, the program sets numbers[count] equal to the user inputted integer, increments count, and reads in the next integer with input.nextInt(). This process repeats until 10 integers have been entered.

Once the input array is populated, the convertToArrayList method is called and passed the numbers array.

The convertToArrayList method initializes a new ArrayList of integers called list. A for loop is used to iterate over each element in the input array and add it to the list using the list.add() method.

Finally, the list is printed to the console using the System.out.println() method.


