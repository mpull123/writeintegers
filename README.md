# WriteInts

## Overview
WriteInts is a Java program designed to write an array of integers to a file. It checks if the file is empty before writing to it to prevent data loss.

## Usage
To use the WriteInts program, follow these steps:
1. Compile the WriteInts.java file: `javac WriteInts.java`
2. Run the compiled program: `java WriteInts`

## Features
- Writes an array of integers to a file.
- Checks if the file is empty before writing to it to prevent data loss.
- Provides feedback on the status of the file writing process.

## How it works
1. The program takes two arguments: the filename and an array of integers.
2. It checks if the specified file is empty.
3. If the file is empty, it creates a FileOutputStream and a DataOutputStream.
4. It then writes each integer from the array to the file using the DataOutputStream.
5. Finally, it closes the streams and provides feedback on the success of the operation.

## Example
```java
int myArr[] = { 16, 31, 90, 45, 89 };
WriteInts wi = new WriteInts("mydata.dat", myArr);
```

## Requirements
- Java Development Kit (JDK) installed
- Command-line interface for compiling and running Java programs

