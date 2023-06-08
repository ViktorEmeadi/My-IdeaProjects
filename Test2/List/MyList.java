package List;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    int[] elements;
    int size;

    public MyList(){
        elements = new int[0];
        size = 0;
    }
    public void add(int index, int element){
        if (size == elements.length){
            int newSize = elements.length + 1;
            int[] newElements = new int[newSize];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[index] = element;
        size++;
    }
    public int size() {
        return size;
    }

    public void clear() {
        int[] newElement = new int[0];
        elements = newElement;
        size = 0;
    }

    public int get(int index) {
        return elements[index];
    }

    public void remove(int index) {
        for (int count = index; count < size - 1; count++) {
            elements[count] = elements[count + 1];
        }
        size--;
    }
    public void removed(int val){
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == val){
                elements[index] = elements[index + 1];
            }
        }
        size--;
    }

    public int set(int index, int element) {
        return elements[index] = element;
    }

    public int indexOf(int element) {
        boolean foundElement = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element){
                foundElement = true;
                element = i;
                break;
            }
        }
        if (foundElement) return element;
        return -1;
    }

    public int lastIndexOf(int element) {
        boolean foundElement = false;
        int len = elements.length;
        if (elements[0] == element){
            foundElement = true;
            element = 0;
        }
        else if (elements[0] != element) {
            for (int i = len - 1; i > 0; i--) {
                if (elements[i] == element) {
                    foundElement = true;
                    element = i;
                    break;
                }
            }
        }
        if (foundElement) return element;
        return -1;
    }

    public String equalss(int element) {
        boolean equals = false;
        boolean[] result = new boolean[elements.length];

        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == element)equals = true;
            else equals = false;
            result[index] = equals;
        }
        return Arrays.toString(result);
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        int[] newElements = new int[0];
        if (elements.length == newElements.length) isEmpty = true;
        return isEmpty;
    }

    public boolean contains(int element) {
        boolean contains = false;
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == element)contains = true;
        }
        return contains;
    }
    public boolean containAll(int[] element){
        boolean equals = false;
        if (elements.length != element.length)return false;
        else {
            for (int index = 0; index < elements.length; index++) {
                if (elements[index] == element[index]) equals = true;
                else equals = false;
            }
        }
        return equals;
    }

}
