public class Book implements LibraryItem {

    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public String getDetails(){
        return " by " + author;
    }


}

