
public class MusicEvent{
        private boolean merchandiseRequired;
        private double merchandiseCost;
        private String eventID;
        private String eventName;
        private String eventLocation;
        private String pointOfContact;
        public MusicEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays,boolean merchandiseRequired, double merchandiseCost) {
            //super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
            this.merchandiseRequired = merchandiseRequired;
            this.merchandiseCost = merchandiseCost;
            this.eventID = eventID;
            this.eventName = eventName;
            this.eventLocation = eventLocation;
            this.pointOfContact = pointOfContact;
        }
        
    
        public boolean isMerchandiseRequired() {
            return merchandiseRequired;
        }


        public void setMerchandiseRequired(boolean merchandiseRequired) {
            this.merchandiseRequired = merchandiseRequired;
        }


        public double getMerchandiseCost() {
            return merchandiseCost;
        }


        public void setMerchandiseCost(double merchandiseCost) {
            this.merchandiseCost = merchandiseCost;
        }


        public String getEventID() {
            return eventID;
        }


        public void setEventID(String eventID) {
            this.eventID = eventID;
        }


        public String getEventName() {
            return eventName;
        }


        public void setEventName(String eventName) {
            this.eventName = eventName;
        }


        public String getEventLocation() {
            return eventLocation;
        }


        public void setEventLocation(String eventLocation) {
            this.eventLocation = eventLocation;
        }


        public String getPointOfContact() {
            return pointOfContact;
        }


        public void setPointOfContact(String pointOfContact) {
            this.pointOfContact = pointOfContact;
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
