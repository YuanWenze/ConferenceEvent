    public class PastEvent extends Event{
     public static final double pastEventCost = 10_000;
    
     private String paymentStatus;
     private boolean requiresExtension;
     private String paymentDetails;
    
     public PastEvent(String eventID,String eventName,String eventLocation,String pointOfContact, double eventCost, int totalParticipants,int totalEventDays){
        super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
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
    
     /*@Override
     public void calculateEventCost(){
     System.out.println("Exception: This method does not make sense here,but because of abstract method, something has to be done ")
     }*/
    
    
    
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
    
