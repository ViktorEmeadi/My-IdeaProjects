package Stacks;

public class Stacks1 {
    boolean isEmpty;
    private int counter;
    private String[] elements;
    public Stacks1(int sizeOfStack) {
        elements = new String[sizeOfStack];
    }

    public boolean isEmpty() {
        if (counter == 0)return true;
        return false;
    }

    public void push(String name) {
        elements[counter] = name;
        counter++;
    }

    public String pop() {
        if (counter >= 0)counter--;
        return elements[counter];
    }

    public String peek() {
        return elements[0];
    }

    public boolean isFull() {
        return counter == elements.length;
    }


}
