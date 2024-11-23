import java.util.*;

public class Library<T extends LibraryItem> { //T can only be either LibraryItem interface or the class that implements it
//In simpler terms, it restricts the type T to only valid "library items" (like Book or Magazine),
// which must provide the behaviors defined in the LibraryItem interface.
//Without this bound, T could be any type (e.g., Integer, String),
// which would make it impossible to use methods specific to LibraryItem.

    private List<T> items = new ArrayList<>();


    public void addItem(T item){
        items.add(item);
    }

    public T findById(String id){
        for (T item : items){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    public void displayItems(){
        for (T item : items){
            System.out.println(item.getId() + ". " +item.getTitle()+ item.getDetails());
        }
    }


}
