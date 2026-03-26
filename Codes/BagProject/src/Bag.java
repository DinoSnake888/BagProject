import java.util.HashMap;

abstract class Bag{

    Items m_items = new Items();

    int bagStorage;
    double weight;
    double age;

    public Bag(int bagStorage, double weight, double age){
        this.bagStorage = bagStorage;
        this.weight = weight;
        this.age = age;
    }
    //Methods for actions to do with the bag
    void addItem(String kind, int slot){ // Adds an item to the bag
        m_items.itemThing.put(slot, kind);
    }
    void removeItem(String name){ //Removes an item from the bag
        m_items.itemThing.remove(name);
    }
    void incinerate(){ //Removes everything from the bag
        m_items.itemThing.clear();
    }

}

class Satchel extends Bag{
    public Satchel(){
        int bagStorage = 10;
        double weight = 8.9;
        double age = 10.5;
        super(bagStorage, weight, age);
    }
}

class Backpack extends Bag{
    public Backpack(){
        int bagStorage = 20;
        double weight = 8.9;
        double age = 6.0;
        super(bagStorage, weight, age);
    }
}

class FannyPack extends Bag{
    public FannyPack(){
        int bagStorage = 4;
        double weight = 8.9;
        double age = 0.5;
        super(bagStorage, weight, age);
    }
}