package com.github.xenteros.designpatterns.decorator.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UppercaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UppercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        //TODO
        return super.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        //TODO
        return super.read(b, off, len);
    }
}
