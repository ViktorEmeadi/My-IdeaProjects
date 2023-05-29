package classwork;

import java.awt.font.FontRenderContext;

public enum GeoPoliticalZones {
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nassarawa", "Niger", "Plateau"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara");
    private String[] states;
    GeoPoliticalZones(String...states){
        this.states = states;
    }
    public void setPlace(String... states){
        this.states = states;
    }
    public GeoPoliticalZones getGPZ(){
        GeoPoliticalZones result = GeoPoliticalZones.NORTH_WEST;
        for (String state : states){
            if (state.equals("Akwa-Ibom") || state.equals("Bayelsa") || state.equals("Cross-River") ||
                    state.equals("Delta") || state.equals("Edo") || state.equals("Rivers")){

                result = SOUTH_SOUTH;
            }
            else if (state.equals("Adamawa") || state.equals("Bauchi") || state.equals("Borno") || state.equals("Gombe")
                    || state.equals("Taraba") || state.equals("Yobe")) {

                result = NORTH_EAST;
                                                                                                                                                                                                                                     }
            else if (state.equals("Benue") || state.equals("FCT") || state.equals("Kogi") || state.equals("Kwara") ||
                    state.equals("Nassarawa") || state.equals("Niger") || state.equals("Plateau")) {

                result = NORTH_CENTRAL;
            }
            else if (state.equals("Abia") || state.equals("Anambra") || state.equals("Ebonyi") || state.equals("Enugu") || state.equals("Imo")) {

                result = SOUTH_EAST;
            }
            else if (state.equals("Ekiti") || state.equals("Lagos") || state.equals("Osun") || state.equals("Ondo") || state.equals("Ogun") || state.equals("Oyo")){
                result = SOUTH_WEST;
            }
            else result = NORTH_WEST;
        }
        return result;
    }
}
