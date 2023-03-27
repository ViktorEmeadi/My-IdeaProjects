package tdd;

public class Driller {
    private int noOfCopies;
    public void noOfCopy(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getPrice() {
        if (noOfCopies > 0 && noOfCopies < 5) return noOfCopies * 2000;
        else if (noOfCopies > 4 && noOfCopies < 10) return noOfCopies * 1800;
        else if (noOfCopies > 9 && noOfCopies < 30) return noOfCopies * 1600;
        else if (noOfCopies > 29 && noOfCopies < 50) return noOfCopies * 1500;
        else if (noOfCopies > 49 && noOfCopies < 100) return noOfCopies * 1300;
        else if (noOfCopies > 99 && noOfCopies < 200) return noOfCopies * 1200;
        else if (noOfCopies > 199 && noOfCopies < 500) return noOfCopies * 1100;
        else if (noOfCopies > 500) return noOfCopies * 1000;
        else return noOfCopies * 0;
    }
}
