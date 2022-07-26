package org.aknb;

public class NoShape implements Shape{
    @Override
    public double area() {
        throw new IllegalArgumentException("Can't calculate area");
    }
}
