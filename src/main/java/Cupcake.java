public class Cupcake extends Cake{

    private int numberOfToppings;
    private String frostingColour;

    public Cupcake(String cakeName, String baseFlavour, boolean isGlutenFree, int numberOfToppings, String frostingColour){
        super(cakeName, baseFlavour, isGlutenFree);
        this.numberOfToppings = numberOfToppings;
        this.frostingColour = frostingColour;
    }

    // GET & SET NUMBER OF TOPPINGS
    public int getNumberOfToppings(){
        return this.numberOfToppings;
    }
    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    // GET & SET FROSTING COLOUR
    public String getFrostingColour(){
        return this.frostingColour;
    }
    public void setFrostingColour(String frostingColour) {
        this.frostingColour = frostingColour;
    }

}
