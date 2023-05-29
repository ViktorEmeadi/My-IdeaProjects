package CodeWars;

public class DnaToRna {
    public static void main(String[] args) {
        String dna =    "GCAU";
        if (dna.contains("T")) {
            System.out.println(dna.replace("T", "U"));
        }
        else if (dna.contains("U")){
            System.out.println(dna.replace("U", "T"));
        }
    }
    }

