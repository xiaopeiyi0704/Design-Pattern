package Creation.AbstractFactory;

public abstract class SuperCloset {
    abstract Business getBusiness(String type);
    abstract Party getParty(String type);
}
