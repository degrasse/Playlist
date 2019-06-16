import java.util.concurrent.TimeUnit;

public class myPlaylist {

	public static void pause(int i) {
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song ("Frozen Heart", "Cast of Frozen");
		Song s2 = new Song ("Do You Want to Build a Snowman", "Kristen Bell, Agatha Lee Monn, and Katie Lopez");
		Song s3 = new Song ("For the First Time in Forever", "Bell and Idina Menzel");
		Song s4 = new Song ("Love Is an Open Door", "Bell and Santino Fontana");
		Song s5 = new Song ("Reindeers Are Better Than People", "Jonathan Groff");
		Song s6 = new Song ("Let It Go", "Menzel");
		Song s7 = new Song ("In Summer", "Josh Gad");
		Song s8 = new Song ("Elsa and Anna", "Christophe Beck");
		Song s9 = new Song ("Some People Are Worth Melting For", "Christophe Beck");

		Playlist p1 = new Playlist ("deGrasse's play list");
		
		p1.addSong(s1);
		System.out.println("Adding ..." + s1.name);
		pause(2);
		
		p1.addSong(s2);
		System.out.println("Adding ..." + s2.name);
		pause(2);

		System.out.println("Deleting the last song ...");
		p1.deleteLastSong();
		pause(2);
		
		System.out.println("Deleting the last song ...");
		p1.deleteLastSong();
		pause(2);
		
		System.out.println("Deleting the last song ...");
		p1.deleteLastSong();
		pause(2);
		
		
		p1.addSong(s1);
		System.out.println("Adding ..." + s1.name);
		pause(2);
		
		//its only adding the first song
		
		p1.addSong(s2);
		System.out.println("Adding ..." + s2.name);
		pause(2);
		
		p1.addSong(s3);
		System.out.println("Adding ..." + s3.name);
		pause(2);
		
		p1.addSong(s4);
		System.out.println("Adding ..." + s4.name);
		pause(2);
		
		p1.addSongAfter(s2.name, s5);
		System.out.println("Adding ..." + s5.name + " ... after " + s2.name);
		pause(2);
		
		p1.addSongAfter(s1.name, s6);
		System.out.println("Adding ..." + s6.name + " ... after " + s1.name);
		pause(2);

		p1.addSong(s7);
		System.out.println("Adding ..." + s7.name);
		pause(2);
		
		p1.addSong(s8);
		System.out.println("Adding ..." + s8.name);
		pause(2);
		
		p1.addSong(s9);
		System.out.println("Adding ..." + s9.name);
		pause(2);
		
		System.out.println(p1.toString());
		
		// play from the beginning
		System.out.println("************************************************");
		Song currentSong = p1.firstSong;
		System.out.println("Now playing...." + currentSong.name + " by " + currentSong.artist);
		pause(2);
		
		// skip two songs
		System.out.println("Skip to next...");
		pause(1);
		System.out.println("Skip to next...");
		pause(1);

		//error
		currentSong = currentSong.skip().skip();
		System.out.println("Now playing...." + currentSong.name + " by " + currentSong.artist);
		pause(2);
				
		System.out.println("Back to previous...");
		pause(1);

		currentSong = currentSong.back();
		System.out.println("Now playing...." + currentSong.name + " by " + currentSong.artist);
		pause(2);
		
		System.out.println("Skip to next...");
		pause(1);
		System.out.println("Skip to next...");
		pause(1);
		System.out.println("Skip to next...");
		pause(1);
		System.out.println("Skip to next...");
		pause(1);

		currentSong = currentSong.skip().skip().skip().skip();
		System.out.println("Now playing...." + currentSong.name + " by " + currentSong.artist);
	
		System.out.println("************************************************");

	}

}
