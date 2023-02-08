/**
 * 
 */
package collection;

import java.util.Arrays;
import collection.Song;


/**
 * Java program that INSERT COMMENT.
 * 
 * @author KathrynIrving
 * @version 2.6.2023_540
 */
public class SongArray {

	private static final int MAX = 10;
	private Song[] songArray;
	private int size;

	public SongArray() {
		songArray = new Song[MAX];
		size = 0;
	}

	public boolean addSong(Song plus1) {
		if (size >= MAX) {
			System.out.println("Reached maximum number of songs, no new songs added.");
			return false;
		} else {
			songArray[size] = plus1;
			size++;
			return true;
		}
	}

	public int findSong(String title) {
		for (int i = 0; i < songArray.length; i++) {
			for (int j = songArray.length -1; j > i; j--)
			if (songArray[i].getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void swapSong(int swap1, int swap2) {
		Song temp = songArray[swap1];
		songArray[swap1] = songArray[swap2];
		songArray[swap2] = temp;
	}

	public void sortByWriter() {
		for (int i = 1; i < size; i++) {
			for (int j = size - 1; j >= i; j--){
		if ((songArray[j].getWriter()).compareTo(songArray[j-1].getWriter()) < 0);
			{
			swapSong(j,j-1);
			}
		
	}
	/**public void sortByWriter() {
	    for (int i = 1; i < size; i++) {
	        if (songList[i] != null)
	        for (int j = size - 1; j >= i; j--){
	            if ((songList[j-1].getWriter()).compareTo(songList[j].getWriter()) > 0){
	                Song temp = songList[j-1];
	                songList[j-1] = songList[j];
	                songList[j] = temp;
	            }*/
	        }
	    }

	public void sortByDuration() {
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--){
            		if (songArray[j].getDuration()<songArray[j-1].getDuration())
				{
			swapSong(j,j-1);
				}
            }
        }
}

	public void sortByGenre() {
	            for (int i = 1; i < size; i++) {
	                for (int j = size - 1; j >= i; j--){
	                    if ((songArray[j].getGenre()).compareTo(songArray[j-1].getGenre()) < 0)
	                    {
	                    	swapSong(j,j-1);
	                    }
	                        /**Song temp = songList[j-1];
	                        songList[j-1] = songList[j];
	                        songList[j] = temp;*/
	                    }
	            }
	                }

	public void sortByYear() {
		for (int i = 1; i < size; i++) {
			for (int j = size - 1; j >= i; j--) {
				if (songArray[j].getYear() < songArray[j-1].getYear()) {
					swapSong (j,j-1);
				}
			}
		}
		}
		public String toString() {
		    return "SongArray contains: \n" + Arrays.toString(songArray) + "\n";
		    }
		
		public int getSize() {
		    return size;
		    }
}
