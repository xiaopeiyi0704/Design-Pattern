package Creation.AbstractFactory;

public class PartyCloset extends SuperCloset {


    public Party getParty(String suitType){

        if(suitType.equalsIgnoreCase("swim")){
            return new SwimmingSuit();
        }else if((suitType.equalsIgnoreCase("sport"))){
            return new SportSuit();
        }else{

            return null;
        }

    }
    public Business getBusiness(String suitType) {

        return null;

    }
}
