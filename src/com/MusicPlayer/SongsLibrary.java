package com.MusicPlayer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class SongsLibrary {
	protected Map<Integer, String> allSongs() {

		Map<Integer, String> songs = new HashMap<>();
		songs.put(1, "s1");
		songs.put(2, "s2");
		songs.put(3, "s3");
		songs.put(4, "s4");
		songs.put(5, "s5");
		songs.put(6, "s6");
		songs.put(7, "s7");
		songs.put(8, "s8");
		songs.put(9, "s9");
		songs.put(10, "s10");
		songs.put(11, "s11");
		songs.put(12, "s12");
		songs.put(13, "s13");
		songs.put(14, "s14");
		songs.put(15, "s15");
		songs.put(16, "s16");
		return songs;
	}

	protected void showAllSongs() {
		System.out.println(allSongs().values());
	}

}
