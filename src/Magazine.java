public class Magazine implements LibraryItem{
    private String id;
    private String title;
    private String publisher;

    public Magazine(String id, String title, String publisher) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
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
        return "Magazine published by " + publisher;
    }
}
