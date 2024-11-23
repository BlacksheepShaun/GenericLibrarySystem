public class Member {
    private String name;
    private String userId;

    public Member(String name, String userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public String getUserId(){
        return userId;
    }
}
