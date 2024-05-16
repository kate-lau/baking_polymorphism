import java.util.ArrayList;

public class Kitchen {

    private ArrayList<Cake> cakesInKitchen;

    public Kitchen(){
        this.cakesInKitchen = new ArrayList<>();
    }

    public int countCakesInKitchen(){
        return this.cakesInKitchen.size();
    }

    public void addCakeToKitchen(Cake cake){
        this.cakesInKitchen.add(cake);
    }
    public void removeCakeFromKitchen(Cake cake){
        this.cakesInKitchen.remove(cake);
    }

}
