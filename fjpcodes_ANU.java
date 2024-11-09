//exp1 Write a JAVA program to find and print the smallest missing element from 
a sorted array "arr[]".

import java.util.Arrays;

public class exp_thread {
    public static void main(String[] args) {
        int [] arr=  {1, 2, 3, 4, 5, 6 };
        
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            
            if(arr[i]!=i){
                System.out.println(arr[i]-1);
                break;
            }
            
        }
        

    
    }
}



//exp2  Write a JAVA program to calculate the sum of first 'n' odd integer 
numbers skipping 1 number.  

import java.util.Arrays;
import java.util.Scanner;

public class exp_thread {
    public static void main(String[] args) {
       
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        

        int count=1;
        int sum=0;
        
        for (int i=1;i<=n;i++){
            sum+= count;
            System.out.print(count+" ");
            count = count+4;
            
        }
        System.out.println();
        System.out.println(sum);
        

    
    }
}




//exp3 Write a JAVA program to find and print the duplicate elements in an array 
'arr[]'. 

public class FindDuplicates {
    public static void main(String[] args) {
        int[] x = {1, 2, 2, 3, 4, 5, 6, 7, 7, 8};
        System.out.print("Duplicate elements in x[]: ");
        findDuplicates(x);
        
        int[] y = {15, 15, 23, 34, 1, 2, 3, 4};
        System.out.print("\nDuplicate elements in y[]: ");
        findDuplicates(y);
    }

    public static void findDuplicates(int[] arr) {
        boolean[] printed = new boolean[arr.length]; // Track printed duplicates
        
        for (int i = 0; i < arr.length; i++) {
            if (!printed[i]) { // Only check if it hasn't been marked as printed
                boolean isDuplicate = false;
                
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        printed[j] = true; // Mark this duplicate as printed
                    }
                }
                
                if (isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}




//exp4 
A) Write a JAVA program to generate an exception of array out of bounds 
exception  
B)Write a JAVA program to print the following using the concept of 
extending the Thread class in Java:


public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        // Trying to access an index that is out of bounds
        try {
            System.out.println(arr[5]); // Index 5 does not exist in the array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        // This is the code that will be executed when the thread runs
        System.out.println("Thread is Running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of the MyThread class
        MyThread thread = new MyThread();
        
        // Start the thread
        thread.start();
    }
}





//exp5 
A) Write a JAVA program to swap the two numbers using object as parameter 
for function. 
B) Write a JAVA program to print the average value of all the odd numbers 
stored in the int type array (arr[] ).  


class twono {
    
    int a;
    int b; 
    
    public twono(int a, int b){
        this.a=a;
        this.b=b;
    }
};

class swap{
    public twono swap(twono ab){
        System.out.println("final value"+" "+ab.a+" "+ab.b);
        int temp=ab.a;
        ab.a=ab.b;
        ab.b=temp;
        System.out.println("final value"+" "+ab.a+" "+ab.b);
        return ab;
    }
}

public class exp_thread {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        twono c= new twono(num1,num2);
        
        swap c1= new swap();
        
        c1.swap(c);

    
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int [] arr=  {1, 2, 3, 4, 5, 6 };
        int sum=0;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if((arr[i]%2)!=0){
                sum+=arr[i];
                count++;
            }
            
        }
        
        System.out.println(sum/count);

    
    }
}



//exp6 Define a class Point with two fields x and y each of type double. Also, 
define a method distance(Point p1, Point p2) to calculate the distance 
between points p1 and p2 and return the value in double. Complete the 
code segment given below. Use Math.sqrt( ) to calculate the square root.

class Point {
    
    double x;
    double y; 
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    
    public void dist( Point p1 , Point p2){
        System.out.println(""+" "+p1.x+" "+p1.y);
        System.out.println(""+" "+p2.x+" "+p2.y);
        double c= Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        System.out.println("distance="+c);
        
    }
};


public class exp_thread {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Point c= new Point (num1,num2);
        Point c1= new Point (5,10);
        c.dist(c,c1);

    
    }
}


//exp7 Write a JAVA program to call the method swapnum()of class swapping to 
print the following result

class swapping {
    
    public void swap(int x, int y){
        System.out.println("Before Swapping: x = " + x + ", y = " + y);
        int temp= x;
        x=  y;
        y=  temp;
        System.out.println("After Swapping:  x = " + x + ", y = " + y);
        
    }
    
    
    public void swap(double x, double y){
        System.out.println("Before Swapping: x = " + x + ", y = " + y);
        double temp= x;
        x=  y;
        y=  temp;
        System.out.println("After Swapping:  x = " + x + ", y = " + y);
        
    }
};


public class exp_thread {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swapping c= new swapping ();
        c.swap(num1,num2);
        swapping c1= new swapping ();
        c1.swap(5.1,10.2);

    
    }
}


//exp8  Write a JAVA program to perform the constructor overloading and call the 
parameterized constructor from the default constructor. 

class Calculator {
    
    int a;
    int b; 
    
    public Calculator(){
        this(1,2);
        System.out.println("default constructor");
    }
    
     public Calculator(int a , int b){
         this.a=a;
         this.b=b;
        
        System.out.println("parameter constructor");
    }
    public  int sum() {
        int c = a + b;
        return c;
    }

   
}

public class exp_thread {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator c= new Calculator();
        c.sum();
        
        Calculator c1= new Calculator(num1,num2);
        c.sum();

    
    }
}



//exp9 A class Shape is defined with two overloading constructors in it. Another 
class Test1 is partially defined which inherits the class Shape. The 
class Test1 should include two overloading constructors as appropriate 
for some object instantiation shown in main() method. You should define 
the constructors using the super class constructors. Also, override the 
method calculate( ) in Test1 to calculate the volume of a Shape. 

class shape{
    double length;
    double breath;
    double height;
    
    public shape(){
        length=0;
        breath=0;
        height=0;
    }
    
    public shape(double length,double breath,double height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    
    public void volume(){
        System.out.println("only declaration");
    }
}

class test1 extends shape{
    public test1(){
        super();
    }
    public test1(double length,double breath,double height){
       super(length, breath, height);  
    }
    
    public void volume(){
        double v=length*breath*height;
        System.out.println("volume"+v);
    }
    
}


public class exp_thread {
      public static void main(String[] args){
          
          shape s =new shape(10,20,1);
          s.volume();
          test1 t= new test1(20,10,1);
          t.volume();
          
      }
}






//exp10  Write a JAVA program to defining two methods, namely sum( ) and multiply 
( ) static method. You have to call these methods to find the sum and 
product of two numbers. 

class Calculator {
    // Static method to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Static method to calculate the product of two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Calling static methods without creating an instance of Calculator
        int resultSum = Calculator.sum(num1, num2);
        int resultProduct = Calculator.multiply(num1, num2);

        System.out.println("Sum: " + resultSum);
        System.out.println("Product: " + resultProduct);
    }
}



//exp11 Write a JAVA program to explain the different access specifiers using 
package concepts. 

// File: accessmodifiers/AccessExample.java
package accessmodifiers;

public class AccessExample {
    public int publicVar = 1;            // Public variable
    protected int protectedVar = 2;      // Protected variable
    int defaultVar = 3;                  // Default (package-private) variable
    private int privateVar = 4;          // Private variable

    // Method to display all variable values
    public void display() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}
// File: accessmodifiers/SamePackageTest.java
package accessmodifiers;

public class SamePackageTest {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        System.out.println("Accessing from Same Package:");

        System.out.println("Public Variable: " + example.publicVar);       // Accessible
        System.out.println("Protected Variable: " + example.protectedVar); // Accessible
        System.out.println("Default Variable: " + example.defaultVar);     // Accessible
        // System.out.println("Private Variable: " + example.privateVar);  // Not accessible
    }
}
// File: otherpackage/DifferentPackageTest.java
package otherpackage;

import accessmodifiers.AccessExample;

public class DifferentPackageTest {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        System.out.println("Accessing from Different Package:");

        System.out.println("Public Variable: " + example.publicVar);       // Accessible
        // System.out.println("Protected Variable: " + example.protectedVar); // Not accessible directly
        // System.out.println("Default Variable: " + example.defaultVar);     // Not accessible
        // System.out.println("Private Variable: " + example.privateVar);     // Not accessible
    }
}
// File: otherpackage/SubclassTest.java
package otherpackage;

import accessmodifiers.AccessExample;

public class SubclassTest extends AccessExample {
    public void displayInherited() {
        System.out.println("Accessing through Subclass in Different Package:");
        System.out.println("Public Variable: " + publicVar);           // Accessible
        System.out.println("Protected Variable: " + protectedVar);     // Accessible because of inheritance
        // System.out.println("Default Variable: " + defaultVar);       // Not accessible
        // System.out.println("Private Variable: " + privateVar);       // Not accessible
    }

    public static void main(String[] args) {
        SubclassTest test = new SubclassTest();
        test.displayInherited();
    }
}


//exp12 Write a JAVA program to read the content ("All the Best") in one of the 
text file and write into another.

 import java.io.FileWriter;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;

 public class Main {
     public static void main(String[] args)  {
       
       File inputfile= new File("input.txt");
       File outputfile= new File("output.txt");
       
       FileWriter output =null;
       FileReader input =null;
       try{
           if(!inputfile.exists()){
          inputfile.createNewFile();
       }
          input = new FileReader(inputfile);
           output = new FileWriter(outputfile);
           int c;
           while((c= input.read()) != -1){
               output.write(c);
            
           }
           input.close();
           output.close();
           
       }
       catch(IOException e){
            
         }

     }
 }


//exp13 Write a JAVA program, from the given string input str="hello world". The 
string str is dividing into the substring "hello" and world". In hello 
'e' and 'l' and 'l' and 'o' are in the lexicographical order. So that 
pair count is 2. In the word 'world', only 'o' and 'r' lexical order. so 
that pair count is 1. Concatenating the both the results 21 so that 
output is 21.

public class LexicographicalPairCount {

    // Method to count lexicographical pairs in a given string
    public static int countLexicographicalPairs(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) <= str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Given string
        String str = "hello world";

        // Split the string into two substrings
        String firstPart = str.substring(0, 5);  // "hello"
        String secondPart = str.substring(6);    // "world"

        // Count lexicographical pairs for both substrings
        int countFirstPart = countLexicographicalPairs(firstPart);
        int countSecondPart = countLexicographicalPairs(secondPart);

        // Concatenate both counts as a string and print using toString()
        String result = Integer.toString(countFirstPart) + Integer.toString(countSecondPart);
        System.out.println(result);  // Output: 21
    }
}



//exp14 Write a JAVA program to perform the concet of inheritance, nested of 
interface and interface within class 

// Base class for demonstrating inheritance
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class extending the Animal class
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Outer interface containing a nested interface
interface Vehicle {
    void start();

    // Nested interface inside Vehicle
    interface Maintenance {
        void service();
    }
}

// Implementing the outer interface and nested interface in a class
class Car implements Vehicle, Vehicle.Maintenance {
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void service() {
        System.out.println("Car requires maintenance");
    }
}

// Class with an inner interface
class Calculator {
    // Inner interface within the Calculator class
    interface Operations {
        int add(int a, int b);
        int subtract(int a, int b);
    }

    // Class implementing the inner interface within Calculator
    class BasicOperations implements Operations {
        @Override
        public int add(int a, int b) {
            return a + b;
        }

        @Override
        public int subtract(int a, int b) {
            return a - b;
        }
    }
}

// Main class to demonstrate all concepts
public class Main {
    public static void main(String[] args) {
        // Demonstrate inheritance
        Animal myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        // Demonstrate nested interface implementation
        Car myCar = new Car();
        myCar.start();      // Output: Car starts
        myCar.service();    // Output: Car requires maintenance

        // Demonstrate interface within a class
        Calculator calculator = new Calculator();
        Calculator.Operations operations = calculator.new BasicOperations();
        
        int sum = operations.add(10, 5);
        int difference = operations.subtract(10, 5);
        
        System.out.println("Sum: " + sum);              // Output: Sum: 15
        System.out.println("Difference: " + difference); // Output: Difference: 5
    }
}



//exp15 Write a Java program to compare two strings lexicographically. Two 
strings are lexicographically equal if they are the same length and 
contain the same characters in the same positions 

import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        
        // Compare the strings lexicographically
        int result = string1.compareTo(string2);
        
        // Output the result based on the comparison
        if (result == 0) {
            System.out.println("The strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }

        scanner.close();
    }
}



//exp16 Write a JAVA program to create a class containing a method to create the 
mirror image of a String. The method should return the two Strings 
separated with a pipe(|) symbol. 

public class MirrorImage {
    
    // Method to create the mirror image of a String
    public static String getMirrorImage(String input) {
        // Reverse the input string to create the mirror image
        StringBuilder mirrored = new StringBuilder(input);
        mirrored.reverse();  // Reverse the string
        
        // Return original and mirrored strings separated by a pipe
        return input + "|" + mirrored.toString();
    }

    public static void main(String[] args) {
        // Test input
        String input = "PICT";
        
        // Get mirror image
        String result = getMirrorImage(input);
        
        // Print the result
        System.out.println("Output: " + result);  // Expected output: PICT|TCIP
    }
}

