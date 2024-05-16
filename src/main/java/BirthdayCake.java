public class BirthdayCake extends Cake{

    private int tiers;
    private int candles;

    public BirthdayCake(String cakeName, String baseFlavour, boolean isGlutenFree, int tiers, int candles){
        super(cakeName, baseFlavour, isGlutenFree);
        this.tiers = tiers;
        this.candles = candles;
    }

    // GET & SET TIERS
    public int getTiers(){
        return this.tiers;
    }
    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    // GET & SET CANDLES
    public int getCandles(){
        return this.candles;
    }
    public void setCandles(int candles) {
        this.candles = candles;
    }

    // BIRTHDAY MESSAGES
    public String birthdayMessage(){
        return "Happy Birthday!";
    }
    public String birthdayMessage(String birthdayName){
        return "Happy Birthday, " + birthdayName + "!";
    }

}
