package inheritance;
public class Problems{
    public enum Types {
        FINANCIAL, SPIRITUAL, EDUCATION, BUISNESS
    }

    private String name;
    private Types typeOfProblem;
    private boolean isSolved;

    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setTypeOfProblem(Types typeOfProblem){
        this.typeOfProblem = typeOfProblem;
    }
    public boolean solveProblem(){
        return isSolved;
    }
}
