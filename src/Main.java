import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws  Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001","AI Conference","Paris","Peng Tian",50,2,25,  40,10, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

         PastEvents pastEvent = new PastEvents("E001", "AI Conference", "Paris", "Peng Tian", 50, 2,LocalDate.of(2023,3,12), LocalDate.of(2023,3,19), null,false);
         //pastEvent.calculateEventCost();
         pastEvent.setPaymentDetails("Pending",true);
         System.out.println(pastEvent); 
    }
    }

