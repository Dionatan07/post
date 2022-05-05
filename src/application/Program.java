package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("See you later!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"), //Padrão para data;
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComments(c1);
        p1.addComments(c2);
        p1.addComments(c3);

        System.out.println(p1);

    }
}
