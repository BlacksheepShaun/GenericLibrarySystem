import java.util.*;

public class AccountManager {

    private Map<String, UserAccount> accounts = new HashMap<>();

    public void createNewAccount(String username, String userId, String password) {
        if(!accounts.containsKey(username)){
            accounts.put(username, new UserAccount(userId, password));
            System.out.println("Account created successfully for username: " + username);
        }
        else {
            System.out.println("Account already exists for username: " + username);
        }
    }

    //login user
    public boolean login(String username,String userId, String password) {
        UserAccount user = accounts.get(username);
        if(accounts != null && user.login(userId, password)){// if there is no (null accounts and
            System.out.println("Login successfully for username: " + userId);
            return true;
        }
        else{
            System.out.println("Login failed for username: " + userId);
            return false;
        }
    }

    //logout user
    public void logout(String userId){
        UserAccount user = accounts.get(userId);
        if( user != null && user.isLoggedIn()){
            user.logOut();
            System.out.println("Logout successfully for username: " + userId);
        }
        else{
            System.out.println("User is lot logged in");
        }
    }

    public boolean isLoggedIn(String username){
        UserAccount user = accounts.get(username);
        return user != null && user.isLoggedIn();
    }

}
