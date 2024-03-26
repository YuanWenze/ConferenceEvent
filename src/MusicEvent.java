
public class MusicEvent extends Event implements CalculateEventCostInterface {
        private boolean merchandiseRequired;
        private double merchandiseCost;
    
        public MusicEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays,boolean merchandiseRequired, double merchandiseCost) {
            super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
            this.merchandiseRequired = merchandiseRequired;
            this.merchandiseCost = merchandiseCost;
        }
    
        public void calculateEventCost() {
            double baseCost = 0; 
            double totalCost = baseCost;
    
            if (merchandiseRequired) {
                totalCost += merchandiseCost;
            }
    
            System.out.println("Total Event Cost: $" + totalCost);
        }
    
        @Override
        public String toString() {
            return "Merchandise Required: " + merchandiseRequired + "\n" +
                    "Merchandise Cost: $" + merchandiseCost;
        }
    }
