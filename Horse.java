import org.w3c.dom.views.DocumentView;

public class Horse{
    private String name;
    private double weight;
    private boolean tame;

    public Horse(String name, Double weight, boolean tame){
        this.name = name;
        this.weight = weight;
        this.tame = tame;
    }

    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getTame(){
        return this.tame;
    }

}