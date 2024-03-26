public  class ConferenceEvent extends Event {
    private double breakfastCost;
    
    private double lunchCost;
    
    private double dinnerCost;
    private double conferenceEventCost;
    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost){
        super(eventID,eventName,eventLocation,pointOfContact, eventCost, totalParticipants,totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
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
    public ConferenceEvent(String eventID, String eventName,String eventLocation,String pointOfContact,int totalParticipants,int totalEventDays,double eventCost, boolean breakfastRequired, double breakfastCost,  double lunchCost,  double dinnerCost){
    super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    }
    
    @Override
    public void calculateEventCost(){
        
    }
        //conferenceEventCost = getEventCost() + ((getBreakfastCost() +getLunchCost() + getDinnerCost())*getTotalParticipants() * getEventDays());
    
    
    @Override
    public String toString(){
        return "Conference Event details:" + "\n" + 
        "Event ID: " + getEventID() + "\n" +
        "Event Name:" + getEventName()+ "\n" +
        "Event Location:"+ getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "Total Conference Cost:"+ conferenceEventCost;
    }
    }
