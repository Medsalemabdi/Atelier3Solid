package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

/**
 * Interface for reading data from any source
 */
public interface IReader
{
    String read() throws IOException;
}
