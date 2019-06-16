
public class Song {
	// fields
	String name;
	String artist;
	
	//need to know whats before and after because linked
	Song prevSong;
	Song nextSong;
	
	// constructor
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.prevSong = null;
		this.nextSong = null;
	}
	
	// methods
	// toString
	// This method outputs the formatted string for a song
	public String toString() {
		String str = "\t";
		str = str + this.name + " by " + this.artist;
		return str;
	}
	

	
}
