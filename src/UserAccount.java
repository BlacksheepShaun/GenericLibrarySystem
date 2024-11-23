public class UserAccount {

    private String userId;
    private String password;
    private boolean isLoggedIn;

    public UserAccount(String username, String password){
        this.userId = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    public String getUserId(){
        return userId;
    }

    public boolean login(String userId, String password){
        if(this.password.equals(password) && this.userId.equals(userId)){
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logOut(){
        isLoggedIn = false;
    }

    public boolean isLoggedIn(){
        return isLoggedIn;
    }

}
