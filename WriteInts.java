
/****************************
 Mallory Pulliam
 Lab #6
*****************************/

import java.io.*;

public class WriteInts {
    // Constructor to write integers to a file
    public WriteInts(String fileName, int[] integers) {
        File newFile = new File(fileName);
        try {
            // Check if the file is empty
            long size = newFile.length();
            if (size == 0) {
                // Create FileOutputStream and DataOutputStream
                FileOutputStream fout = new FileOutputStream(newFile);
                DataOutputStream dout = new DataOutputStream(fout);

                // Write each integer to the file
                for (int i : integers) {
                    dout.writeInt(i);
                }

                // Close the streams
                dout.close();
                fout.close();

                System.out.println("Integers have been written to the file: " + fileName);
            }

            else {
                System.out.println("File is not empty. Please provide an empty file.");
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int myArr[] = { 16, 31, 90, 45, 89 };
        WriteInts wi = new WriteInts("mydata.dat", myArr);
    }
}
