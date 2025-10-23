package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

/**
 * Client code demonstrating Dependency Injection
 * Now we inject concrete implementations into the EncodingModule
 */
public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        // Example 1: Encode from file to file
        System.out.println("Encoding from file to file...");
        IReader fileReader = new FileReaderImpl(
            "C:\\Users\\hp\\OneDrive\\Documents\\ENSI\\3eme\\Reingenieurie\\TP3-SOLID\\exercice-dip\\src\\main\\resources\\beforeEncryption.txt");
        IWriter fileWriter = new FileWriterImpl(
            "C:\\Users\\hp\\OneDrive\\Documents\\ENSI\\3eme\\Reingenieurie\\TP3-SOLID\\exercice-dip\\src\\main\\resources\\afterEncryption.txt");
        EncodingModule fileToFileEncoder = new EncodingModule(fileReader, fileWriter);
        fileToFileEncoder.encode();
        System.out.println("File encoding completed!");

        // Example 2: Encode from network to database
        System.out.println("\nEncoding from network to database...");
        IReader networkReader = new NetworkReader("myfirstappwith.appspot.com", "/index.html");
        MyDatabase database = new MyDatabase();
        IWriter databaseWriter = new DatabaseWriter(database);
        EncodingModule networkToDatabaseEncoder = new EncodingModule(networkReader, databaseWriter);
        networkToDatabaseEncoder.encode();
        System.out.println("Network to database encoding completed!");

        
    }
}
