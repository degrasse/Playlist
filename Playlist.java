

public class Playlist {
	// field
	String name;
	Song firstSong;
	
	// constructor
	public Playlist(String name) {
		this.name = name;
		firstSong = null;
	}
	// methods
	
	// addSong
	// this method takes a new song
	// and always adds to the end of the playlist
	
	/*
	 
	public Song(String name, String artist) {
		
		this.name = name;
		this.artist = artist;
		this.prevSong = null;
		this.nextSong = null;
	}
	
	 */

	
	public void addSong (Song song) {
		
		//Song addSong = new Song(song, );
		Song currentSong = this.firstSong;
		
		//if its empty set the song to the first song
		if(isEmpty()){
		 firstSong = song;
		
		}
		
		else{
			//while the next song isn't the last song
			while (currentSong.nextSong != null){
				//set the current sont to the next song
				currentSong = currentSong.nextSong;
				}
			//then when the current is null (outside of the while loop)
			//add the song
			//currentSong = currentSong.nextSong;
			currentSong.nextSong = song;
		}
		
	}
	
	
	
	
	// add after a specific song
	// this method takes a new song and the name of an existing song
	// and adds the new song after the existing song
	// assume that the existing song always exists
	public void addSongAfter (String songName, Song newSong) {
	
		Song currentSong = this.firstSong;
		//while the current song isn't the last song
		//and if the name of the current song is equal to the name we are looking for
		while(currentSong != null){
			if(currentSong.name == songName){
				//then some temporay song is equal to the next song 
				//temp is the next song
				Song temp = currentSong.nextSong;
				//Song cur = currentSong;
				//set next song to the new song
				currentSong.nextSong = newSong;
				//set next song after new song to temp
				//which is equal to the original next song
				newSong.nextSong = temp;
				//set prev song to the current 
				newSong.nextSong.prevSong = newSong;
	
				break;
			}
			currentSong = currentSong.nextSong;
		}
		
	}	
	
	// delete the last song
	// this methods deletes the last song from the playlist
	// if the playlist only has one song, set the first song to null
	// if the playlist is empty, print "empty playlist, cannot delete bro"
	public void deleteLastSong () {
		Song currentSong = this.firstSong;
		if(isEmpty()){
			System.out.println("empty playlist, cannpt delete bro");
		}
		else if(size() == 1){
			this.firstSong = null;
		}
		else{
			
			while(currentSong.nextSong.nextSong != null){
				
				currentSong = currentSong.nextSong;
				//this moves you through the playlist and then breaks when you reach null
			}
			//so when the next next song is null (what the last song points to)
			//then you set the last song to null
			//which equates to deleting the last song
			currentSong.nextSong = null;
		}
	}
	
	// delete a specific song
	// this methods takes a song name
	// remove the song from the playlist
	// assume that the playlist contains the song you are trying to delete
	public void deleteByName (String songName) {
		Song currentSong = this.firstSong;
		
		if(size() ==1){
			if(currentSong.name == songName){
				currentSong = null;
			}
		}
		else{
			while(currentSong.nextSong.name != songName){
				
				//not setting anything to null because not dealing with last node
				//rather when the next song is the song you are looking for 
				//want to change what the current song is pointing to to the next next song
				//rather than the next song 
				//so while the next song from the current song isn't the song we r looking for
				//then we set the current song to the next song so that we move through the playlist
				currentSong = currentSong.nextSong;
				//it will break when the next song is the song we are looking for
			}
			//when this is the case you want the current song to point to the next next song
			//so you set the next song to eqaul the next next song
			currentSong.nextSong = currentSong.nextSong.nextSong;
			
		}
	}
	
	
	// size
	// this method returns the size of the playlist
	public int size() {
		int count = 0;
		Song currentSong = this.firstSong;
		while (currentSong != null) {
			currentSong = currentSong.nextSong;
			count++;
		}
		return count;
	}
	
	// isEmpty
	// this method returns true if the playlist if empty
	public boolean isEmpty() {
		return (firstSong == null);
	}
	
	// toString
	// this method outputs the formatted string for playlist
	public String toString() {
		String str = this.name + ":\n";
		Song currentSong = this.firstSong;
		
		while (currentSong != null) {
			str = str + currentSong.toString();
			
			if (currentSong.nextSong != null) {
				str = str + "\n";
			}
			currentSong = currentSong.nextSong;
		}
		return str;
		
		
	}
}
