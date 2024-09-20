package spring_program;

public class Restaurant {
    HotDrink hotDrink;
    String welcomeNote;

    
    public Restaurant(HotDrink hotDrink, String welcomeNote) {
        this.hotDrink = hotDrink;
        this.welcomeNote = welcomeNote;
    }

    public void prepareDrink()
    {
        hotDrink.prepareHotDrink();
    }

    public void setWelcomeNote(String welcomeNote) 
    {
		this.welcomeNote = welcomeNote;
	}
    
    public void greetMessage()
    {
        System.out.println(welcomeNote);
    }

    public Restaurant(HotDrink hotDrink) {
        super();
        this.hotDrink = hotDrink;
    }

    
}
