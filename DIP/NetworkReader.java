package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Concrete implementation for reading from network
 */
public class NetworkReader implements IReader
{
    private String _host;
    private String _path;

    public NetworkReader(String host, String path)
    {
        _host = host;
        _path = path;
    }

    @Override
    public String read() throws IOException
    {
        URL url = new URL("http", _host, _path);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        
        reader.close();
        return content.toString();
    }
}
