package ru.javabegin.oop.robot;

public class LittleWing implements IWing{
    int size;

    public LittleWing() {
    }

    public LittleWing(int size) {
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("Little wing open");
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "LittleWing{" +
                "size=" + size +
                '}';
    }
}
