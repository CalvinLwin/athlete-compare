public class Athlete{
    
    private String name;
    private Event event;
    private Gender gender;

    public Athlete(String name, Event event, Gender gender){
        this.name = name; 
        this.event = event;
        this.gender = gender;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setEvent(Event e){
        this.event = e;
    }
    public void setGender(Gender g){
        this.gender = g;
    }

    public String getName(){
        return name;
    }
    public Event getEvent(){
        return event;
    }
    public Gender getGender(){
        return gender;
    }

   /*public <T> markType(){
        //have to make a generic for the mark type and figure out what the mark would be measured as for each event
        //when comparing to athletes you need to use the mark type to compare them
        //if the mark types are incompatible (i.e. one is time the other is distance) then you have to say the the events are not equal so the marks 
        //are uncompareable
        if(event instanceof Event.HIGH_JUMP){

        }
        if(event instanceof Event.POLE_VAULT){

        }
        if(event instanceof Event.MARATHON){

        }
        if(event instanceof Event.LONG_JUMP){

        }
        if(event instanceof Event.JAVELIN){

        }
        if(event instanceof Event.HUNDERD_M_SPRINT){

        }
        if(event instanceof Event.FOUR_HUNDRED_M_SPRINT){

        }


    }*/


}