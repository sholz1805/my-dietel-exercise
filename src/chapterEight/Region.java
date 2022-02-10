package chapterEight;

public enum Region {
    SS("Ikeja", "Oshogbo", "Mary"), NN ("Eko", "Alagbado", "Iju");

    private final String[] states;

    Region(String... states){
        this.states = states;
        System.out.println("I am here");
    }
    public String[] getStates(){
        return states;
    }
}