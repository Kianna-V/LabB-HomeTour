package fixtures;

        

public class Room extends Fixtures {

	protected String name;
	protected Room[] exits = new Room[4];
	
	//Constructor
	public Room(String name, String shortDescription, String longDescription ) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	} 
	
	// room exits getter and setters
	public Room getNorthExits() {
		return exits[0];
	}

	public Room getSouthExits() {
		return exits[1];
	}
	
	public Room getEastExits() {
		return exits[2];
	}
	
	public Room getWestExits() {
		return exits[3];
	}
	
	public void setNorthExits(Room exit) {
		exits[0] = exit;
	}
	public void setSouthExits(Room exit) {
		exits[1] = exit;
	}
	public void setEastExits(Room exit) {
		exits[2] = exit;
	}
	public void setWestExits(Room exit) {
		exits[3                                                                           ] = exit;
	}

}
