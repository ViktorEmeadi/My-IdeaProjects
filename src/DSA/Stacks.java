package DSA;

public class Stacks {
    String[] elements;
    int counter = 0;
    private boolean isEmpty = false;
    public Stacks(int sizeOfStack){
        for (int index = 0; index < sizeOfStack; index++) {
            counter++;
        }
    }

    public boolean isEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
        if (counter == 0) {
            isEmpty = false;
        }
        return isEmpty;
    }

    public void push(String element) {
        elements[counter] = element;
        counter++;
    }

    public String pop(){
        counter--;
        return elements[counter];
    }

    public static void main(String[] args) {
        Stacks stacks = new Stacks(5);

    }
}
//implement a method that takes in a and b and multiply them