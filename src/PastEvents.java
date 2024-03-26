import java.time.LocalDate;

public class PastEvents{
    public static final double pastEventCost = 10_000;
     private LocalDate eventStartDate;
     private LocalDate eventEndDate;
     private String paymentStatus;
     private boolean requiresExtension;
     private String paymentDetails;
    
     public PastEvents(String eventID,String eventName,String eventLocation,String pointOfContact, int totalParticipants,int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate,String paymentStatus,boolean requiresExtension){
        
     }
     public String getPaymentStatus(){
     return paymentStatus;
     }
     public void setPaymentStatus(String status){
     this.paymentStatus = status;
     }
     public boolean getRequiresExtension(){
     return requiresExtension;
     }
     public void setRequiresExtension(boolean requiresExtension){
         this.requiresExtension = requiresExtension;
     }
    
   
    
    
    
     public static double getPasteventcost() {
        return pastEventCost;
    }
    public LocalDate getEventStartDate() {
        return eventStartDate;
    }
    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }
    public LocalDate getEventEndDate() {
        return eventEndDate;
    }
    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }
    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
    public void calculateCost(){
     
     }
     public void setPaymentDetails(String paymentStatus,boolean requiresExtension){
         this.paymentDetails = "The event cost was " + pastEventCost + "and the payment status is " + paymentStatus +
         "\n" + " The customer requires extension?: " + requiresExtension;
     }
     public String getPaymentDetails(){
         return paymentDetails;
     }
    
    
    
     @Override
     public String toString(){
         return "\n" + super.toString() + "\n" + "The past event details: " + "\n" +
             "The payment details are as follows: " + "\n" +
             paymentDetails;
         }
    
     }
    
