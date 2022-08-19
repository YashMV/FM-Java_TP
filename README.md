# FM-Java_TP
### Q1
- The number of rows is 4. First we declare the variables and then traverse one row at a time. For a row when column is less than 'n-i' then we print a space. When column is less than 2i-1 print '*'. After every row go to new line.

### Q2
- Create a new object of BufferedReader class. Take a inputs from the user and print them.
- Create a new object of Scanner class. Take a inputs from the user and print them.

### Q3
- Take the number of rows from user. First we declare the variables and then traverse one row at a time. For a row when column is less than 'n-i' then we print a space. When column is less than 2i-1 print '*'. After every row go to new line.

### Q4
- Take a string from the user. Convert it into a character array. In a loop traverse through each element and check for small or capital vowels, if yes then increment the counter. At the end print the counter variable.

### Q5
- Bubble sort is a sorting method in which we compare the current element to the next element and if it is greater than the current element we compare the next element with its next element and if next element is smaller than current element then we swap. In this way the largest element goes into the last position first.

### Q6
- Take the input from the user and use a switch statement based on the users input the corresponding operation will be performed. Cases are defined for various operations. In each case the operation is performed and corresponding output is displayed.

### Q7
- For case sensitivity: Take two String inputs from the user and declare a check variable. Use "equalsTo()" method to check for equality and store the return value in check variable. Based on the value in check display the corresponding message
- For no case sensitivity: Take two String inputs from the user and declare a check variable. Use "equalsIgnoreCase()" method to check for equality and store the return value in check variable. Based on the value in check display the corresponding message.

### Q8
- Take an integer input from the user and store a copy of it to compare later. Take the first digit (remainder operation) and add it to its reverse number, then take the next number multiply by 10 and add it to reverse number, repeat the process until all digits are covered. Once the reverse number is obtained, compare it with the copy and display the message accordingly.

### Q9
- Initialize the time recording variables. Take test input from the user. A switch statement is used and based on the input of the user the program flow goes into a particular case where the user presses a key to start the test and some other case to stop. The time measuring methods will return the time in seconds, they take no argument and that value is converted to a string format by convertToString() methods, this method takes time as argument and returns the string. The string value is then displayed.

### Q10
- Take 3 String inputs from the user. First compare String 1 and 2 if 1 is bigger than 2 then compare 2 with 3 and if yes then lap 1 is the fastest else if 3 is greater than 2 then Lap 2 is fastest. If 1 is not bigger than 2 then compare 3 with 1. If 3 is bigger than 1 then Lap 1 is fastest else if 1 is bigger than 3 then lap 3 is the fastest

### Q11
- Subtraction can be performed using addition of one number with the 2's complement of the other one. Take 2 integer inputs and find the 2's complement of the second one and add this with 1st number and print the result.

### Q12
- Similar to Q10 but here ternary operator is used to find the least of two strings and then that least value is compared with each String and corresponding lap is displayed.

### Q13
- The checking is performed in another method called checkFunction() which returns either 0, 1 or 2 based on the equality. This method takes 2 Strings as arguments.

### Q14
- Similar to Q5 but the bubble sort is performed in a separate method "bublbleSort()" which takes the array and the number of elements as asrguments.

### Q15
- In the hello_world class we have two methods main and print print_hw(). The main() method creates an object of intro class, then we pass print_hw() and print_intro() methods to that object.
- The intro class is a child class of hello_world which has the method print_intro() and also inherits print_hw().

### Q16
- Two classes "MIT" and "Student" are created. 3 Objects are created in "MIT" class and their name, registration number and branch are set by the methods in "Student" class.

### Q17
- Take an array from the user and store their corresponding characters in a separate character array and then display that character array as a string.
- Take a String fro the user and convert it into a character array using "toCharArray()" method and store their corresponding ASCII values in a separate integer array and then print that integer array.
- Typecasting is used to get the ASCII values from characters and also to get characters from ASCII values.

### Q18_1_Java Primality Test
- Take in the string using BufferedReader class and convert it into a BigInteger by making an object. The "isProbablePrime()" works on BigIntegers and takes in a certainty. Returns true if the number is probably a prime and false if it is certainly composite. Then we print the messages accordingly for prime or not prime.

### Q18_1_Pattern Syntax Checker
- A try and catch block is used to test a code and to do a further action if an exception has occurred. Here we try the Pattern.coompile() method and if we catch an exception we set the flag to 1. If the flag is 1 then it is an invalid string and if it remains 0 then it is a valid string. Test cases are the number of strings we want to test.

### Q18_2_Java BigInteger
- Take two Strings and convert into Big Integers by making them objects of BigInteger class. Create and initialize two more BigIntegers "add" and "mul" to store the values of addition and multiplication. Use add() and multiply() methods to add and multiply  and then print the values

### Q18_2_Substring Comparison
- Initialize smallest and largest string. Take the length of the substring to be formed. Create a string array to store the substrings. Substrings are created by using the "substring()" method and it takes the starting index and endindex, it forms substrings from startindex to endindex-1. Arrays.sort() method is used to sort the substrings. The smallest  string will be at index 0 and the largest string will be at the last index (str.length - 1).

### Q18_3_Java BigDecimal
- We create a new BigDecimal and store the copy of the biggest index (initially assumed to be 0th index). Then we compare this bigdecimal with next values in the array. If we find a bigger number then update the value of the big index and the number itself. Then we swap the elements of the current and big string in the string array s. Then we print the sorted array.

### Q18_3_Valid username Regular Expression
- In the class UsernameValidator we write the regular expression. The first word could be a small or capital letter [a-zA-Z] next letters could be any letter or a number or underscore [a-zA-Z0-9_]. The length could be from 8-30 characters so {7,29}.

### Q18_4_Java Anagrams
- We take two strings from the user and convert them into character arrays. Declare two more container character arrays of length 26 in order to store the count of the letters and initialize them with all zeroes. Take one string and check for uppercase, if yes then increment the counter of that index, repeat the same thing for lowercase (For eg: 'A' or 'a' will be index 0, 'B' or 'b' will be index 1 and so on). Repeat the same thing for the other string. Then compare the two container arrays, if they are equal then print "Anagrams" else print "Not Anagrams".

### Q18_5_Java Regex
- Form the regular expression of IP address and then use matches() method to check whether the pattern matches with the user's string or not and print the output message accordingly.
