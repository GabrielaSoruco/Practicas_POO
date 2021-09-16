package src.poo;

public class Animal {
    public String breed;
    public String color;
    public String name;

    public boolean move(int distanceX, int distanceY){
        return true;
    }
    public String sleep(){
        return "Estoy durmiendo";
    }
    public String eat(){
        return "Estoy comiendo";
    }
}
