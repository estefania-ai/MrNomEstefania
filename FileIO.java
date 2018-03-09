package com.example.mrnomestefania;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by elopez87 on 5/4/17.
 */
public interface FileIO {
    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName) throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;
}

