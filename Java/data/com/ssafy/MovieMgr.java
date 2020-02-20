package com.ssafy;

public class MovieMgr {
//	private static MovieMgr mgr =new MovieMgr();
	private static MovieMgr mgr;
	private MovieMgr() {};
	
	public static MovieMgr getMgr() {
		if(mgr == null) {
			mgr =new MovieMgr();
		}
		return mgr;
	}

	private static Movie[] movies = new Movie[100];
	private static int index = 0;

	public void add(Movie m) {
		movies[index++] = m;
	}

	public Movie[] search() {
		return movies;
	}

	public Movie[] search(String title) {
		Movie[] Search_title = new Movie[100];
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().contains(title)) {
				Search_title[i] = movies[i];
			}
		}
		return Search_title;
	}

	public Movie[] searchDirector(String name) {
		Movie[] Search_director = new Movie[100];
		for (int i = 0; i < index; i++) {
			if (movies[i].getDirector().contains(name)) {
				Search_director[i] = movies[i];

			}
		}
		return Search_director;
	}

	public Movie[] searchGenre(String genre) {
		Movie[] Search_Genre = new Movie[100];
		for (int i = 0; i < index; i++) {
			if (movies[i].getGenre().equals(genre)) {
				Search_Genre[i] = movies[i];

			}

		}
		return Search_Genre;

	}
	public void delete(String title) {
		int i;
		boolean toggle= false;
		for (i = 0; i < index; i++) {
			if(movies[i].getTitle().equals(title)) {
				toggle = true;
				break;
			}
		}
		if(toggle) {
			for (; i < index; i++) {
				movies[i]=movies[i+1];
			}
			index--;
		}
		
	}
	public int getSize() {
		int size =index;
		return size;
		}
	
}
