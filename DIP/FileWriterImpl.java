package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterImpl implements IWriter
{
    private String _filePath;

    public FileWriterImpl(String filePath)
    {
        _filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException
    {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(_filePath));
            writer.write(data);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
