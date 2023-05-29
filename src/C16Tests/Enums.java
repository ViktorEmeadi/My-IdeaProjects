package C16Tests;

public enum Enums {
    NORTH("North", 100),
    SOUTH("South", 200),
    WEST("West", 300),
    EAST("East", 500);
    private String direction;
    private int distance;

    Enums(String direction, int distance) {
        this.direction = direction;
        this.distance = distance;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public String getDirection(){
        return  direction;
    }

    public int getDistance() {
        return distance;
    }
}
