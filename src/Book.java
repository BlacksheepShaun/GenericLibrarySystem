public class Book implements LibraryItem {

    private String id;
    private String title;
    private String author;

    public Book(String Id, String Title, String Author) {
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
    public String getAuthor(){
        return author;
    }

    @Override
    public String getDetails(){
        return "Book by " + author;
    }

}

