import jdk.jfr.Category;

public class Brownies extends Cake{

    private String typeOfChocolate;
    private boolean hasChocolateChips;
    private int numberOfSlices;

    public Brownies(String cakeName, String baseFlavour, boolean isGlutenFree, String typeOfChocolate, boolean hasChocolateChips, int numberOfSlices){
        super(cakeName, baseFlavour, isGlutenFree);
        this.typeOfChocolate = typeOfChocolate;
        this.hasChocolateChips = hasChocolateChips;
        this.numberOfSlices = numberOfSlices;
    }

    // GET & SET TYPE OF CHOCOLATE
    public String getTypeOfChocolate(){
        return this.typeOfChocolate;
    }
    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    // GET & SET HAS CHOCOLATE CHIPS
    public boolean getHasChocolateChips(){
        return this.hasChocolateChips;
    }
    public void setHasChocolateChips(boolean hasChocolateChips) {
        this.hasChocolateChips = hasChocolateChips;
    }

    // GET & SET NUMBER OF SLICES
    public int getNumberOfSlices(){
        return this.numberOfSlices;
    }
    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

}
