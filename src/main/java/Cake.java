public abstract class Cake {

    protected String cakeName;
    protected String baseFlavour;
    protected boolean isGlutenFree;

    public Cake (String cakeName, String baseFlavour, boolean isGlutenFree){
        this.cakeName = cakeName;
        this.baseFlavour = baseFlavour;
        this.isGlutenFree = isGlutenFree;
    }

    // GET & SET CAKE NAME
    public String getCakeName(){
        return this.cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    // GET & SET BASE FLAVOUR
    public String getBaseFlavour(){
        return this.baseFlavour;
    }
    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }
    // WHERE TO INSERT .toLowerCase() ?

    // GET & SET GLUTEN FREE
    public boolean getIsGlutenFree(){
        return this.isGlutenFree;
    }
    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

}
