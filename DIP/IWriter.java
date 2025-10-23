package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

/**
 * Interface for writing data to any destination
 */
public interface IWriter
{
    void write(String data) throws IOException;
}
