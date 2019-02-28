package Creation.AbstractFactory;

public class ClosetProducer {

    SuperCloset getCloset(String closetType){
            if(closetType.equalsIgnoreCase("business")){
                return new BusinessCloset();
            }else if(closetType.equalsIgnoreCase("party")){
                return new PartyCloset();
            }else{
                return null;
            }
    }
}
