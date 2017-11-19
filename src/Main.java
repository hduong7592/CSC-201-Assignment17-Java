import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create by hieuduong on 11/18/17
 *
 * CSC 201 - Assignment 17
 * Problem 17.1:
 *
 * (Create a text file) Write a program to create a file named Exercise17_01.txt if
 * it does not exist. Append new data to it if it already exists. Write 100 integers
 * created randomly into the file using text I/O. Integers are separated by a space.
 */


public class Main {
    public static void main(String[] args){

        String fileName = "Exercise17_01.txt";

        //Write to file
        writeToFile(fileName);

        //Read from file
        readFromFile(fileName);

    }

    public static void writeToFile(String fileName){
        /**
         * Create an output stream to write to file
         */
        try{
            FileOutputStream output = new FileOutputStream(fileName);
            for(int i=0; i<=100; i++){
                output.write(randomNumber());
            }
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
    }

    public static void readFromFile(String fileName){
        /**
         * Read from that file
         */
        try{
            FileInputStream input = new FileInputStream(fileName);
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
        catch (IOException ex){
            System.out.println(ex.toString());
        }
    }

    /**
     * Method to generate random number from 0 to 100
     * @return
     */
    public static int randomNumber(){
        int random = 0;
        random = ((int)(Math.random()*100) + 1);
        return random;
    }
}
