package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

/**
 * Refactored EncodingModule that follows Dependency Inversion Principle
 * Now depends on abstractions (IReader and IWriter) instead of concrete implementations
 */
public class EncodingModule
{
    private IReader _reader;
    private IWriter _writer;

    /**
     * Constructor injection - inject dependencies through constructor
     */
    public EncodingModule(IReader reader, IWriter writer)
    {
        _reader = reader;
        _writer = writer;
    }

    /**
     * Generic encode method that works with any reader/writer combination
     * The encoding logic is now separated from the I/O concerns
     */
    public void encode() throws IOException
    {
        String data = _reader.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        _writer.write(encodedData);
    }
}
