/**
 * 
 */
package collection;

import main.Main;
import java.lang.String;

/**
 * Java program that INSERT COMMENT.
 * 
 * @author KathrynIrving
 * @version 2.6.2023_540
 */

public class Song {

	/**
	 * private fields which represent the INSERT COMMENT
	 */

	private String title;
	private String writer;
	private String singer;
	private double duration;
	private String genre;
	private int year;

	/** Constructor that sets INSERT COMMENT */
	public Song()

	{
		title = "";
		writer = "";
		singer = "";
		duration = 0.0;
		genre = "";
		year = 0;
	}

	public void setSong(String getTitle, String getWriter, String getSinger, double getDuration, String getGenre, int getYear) {
		//this.title = title;
		//this.writer = writer;
		//this.singer = singer;
		//this.duration = duration;
		//this.genre = genre;
		//this.year = year;
		
		  if (getTitle != "") {
	            title = getTitle;
	        }
	        if (getWriter != "") {
	            writer = getWriter;
	        }
	        if (getSinger != "") {
	            singer = getSinger;
	        }
	        if (getDuration > 0) {
	            duration = getDuration;
	        }
	        if (getGenre != "") {
	            genre = getGenre;
	        }
	        if (getYear > 1900 && (getYear <= 2023)) {
	            year = getYear;
	            }
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getSinger() {
		return singer;
	}

	public double getDuration() {
		return duration;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

public String toString() {
        return "Song Info —\n" + "\tTitle: " + title + "\n \tSinger: " 
                + singer + "\n \tDuration: " + duration + " minutes\n \tGenre: " 
                + genre + "\n \tYear: " + year + "\n \tWriter: " + writer;

}
}