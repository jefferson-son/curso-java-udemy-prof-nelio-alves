package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");

		Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dtf), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		post1.addComment(c1);
		post1.addComment(c2);

		System.out.println(post1);
		
		Comment cc1 = new Comment("Good night");
		Comment cc2 = new Comment("May the Force be with you");

		Post post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", dtf), "Good night guys",
				"See you tomorrow", 5);

		post2.addComment(cc1);
		post2.addComment(cc2);
		
		System.out.println(post2);

		scanner.close();
	}

}
