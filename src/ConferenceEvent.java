public class ConferenceEvent{
    private double breakfastCost;
    private double lunchCost;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost){
        //super(eventID,eventName,eventLocation,pointOfContact, eventCost, totalParticipants,totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.calculateEventCostObject = new CalculateEventCostClass();
    }
    
    public double getBreakfastCost(){
        return breakfastCost;
    }
    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }
    public double getLunchCost(){
        return lunchCost;
    } 
    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }
    public double getDinnerCost(){
        return dinnerCost;
    }
    public String getEventID(){
        return eventID;
    
    }
    public void setEventID(String eventID){
        this.eventID = eventID;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String getEventLocation(){
        return eventLocation;
    }
    public void setEventLocation(String location){
        this.eventLocation = location;
    }
    public String getPointOfContact(){
        return pointOfContact;
    }
    public void setPointOfContact(String pointOfContact){
        this.pointOfContact = pointOfContact;
    }
  
 
    public void calculateEventCost(){
        conferenceEventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
        //conferenceEventCost = getEventCost() + ((getBreakfastCost() +getLunchCost() + getDinnerCost())*getTotalParticipants() * getEventDays());
    }
    
    
    @Override
    public String toString(){
        return "Conference Event details:" + "\n" + 
        "Event ID: " + getEventID() + "\n" +
        "Event Name:" + getEventName()+ "\n" +
        "Event Location:"+ getEventLocation() + "\n" +
        "Total Conference Cost:"+ conferenceEventCost;
    }
    }
