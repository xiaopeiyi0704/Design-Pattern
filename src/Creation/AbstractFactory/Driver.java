package Creation.AbstractFactory;

public class Driver {

    public static void main(String[]args){
        SuperCloset superCloset;
        Business business;
        Party party;
        ClosetProducer closetProducer=new ClosetProducer();

        superCloset=closetProducer.getCloset("business");
        business=superCloset.getBusiness("sales");
        business.dressBusiness();


        business=superCloset.getBusiness("interview");
        business.dressBusiness();

        superCloset=closetProducer.getCloset("party");
        party=superCloset.getParty("swim");
        party.dressParty();


        party=superCloset.getParty("sport");
        party.dressParty();


    }
}
