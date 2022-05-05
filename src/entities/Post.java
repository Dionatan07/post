package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //Instanciar o SimpleDateFormat como uma CONSTANTE para criar uma máscara para data e hora;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    //Declaração das variáveis;
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    //Instanciar a lista de comentários;
    private List<Comment> comments = new ArrayList<>();

    //Construtor vazio
    public Post() {
    }

    //Construtor com todos os parametros;
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }

    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    //Utilização do StringBuilder para declarar uma String muito grande
    public String toString(){
        StringBuilder sb = new StringBuilder(); //Instanciação da classe StringBuilder
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
            for (Comment c : comments){ //for para buscar todos os comentarios;
                sb.append(c.getText() + "\n");
            }
            return sb.toString();
    }

}
