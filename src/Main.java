public class Main {
    public static void main(String[] args) throws  Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001","AI Conference","Paris","Peng Tian",50,2,25, true, 40,10, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

         PastEvent pastEvent = new PastEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2,20);
         //pastEvent.calculateEventCost();
         pastEvent.setPaymentDetails("Pending",true);
         System.out.println(pastEvent); 
    }
    }

