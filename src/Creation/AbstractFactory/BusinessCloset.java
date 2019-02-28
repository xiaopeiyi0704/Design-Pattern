package Creation.AbstractFactory;

public class BusinessCloset extends SuperCloset{
    //private Business busnessCloset;
    public Business getBusiness(String suitType){

        if(suitType.equalsIgnoreCase("sales")){
            return new SalesRepSuit();
        }else if(suitType.equalsIgnoreCase("interview")){
            return new InterviewSuit();
        }else{

            return null;
        }

    }
    public Party getParty(String suitType){

        return null;
    }

}
