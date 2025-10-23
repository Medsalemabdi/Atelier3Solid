package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

/**
 * Concrete implementation for writing to database
 */
public class DatabaseWriter implements IWriter
{
    private MyDatabase _database;

    public DatabaseWriter(MyDatabase database)
    {
        _database = database;
    }

    @Override
    public void write(String data) throws IOException
    {
        _database.write(data);
    }
}
