package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Concrete implementation for reading from files
 */
public class FileReaderImpl implements IReader
{
    private String _filePath;

    public FileReaderImpl(String filePath)
    {
        _filePath = filePath;
    }

    @Override
    public String read() throws IOException
    {
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(_filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return content.toString();
    }
}
