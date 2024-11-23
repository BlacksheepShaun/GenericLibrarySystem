public class Transaction<T extends LibraryItem> {
    private Member member;
    private T item;

    public Transaction(Member member, T item) {
        this.member = member;
        this.item = item;
    }

    public String getDetails(){
        return "Member: " + member.getName() + " successfully borrowed " + item.getTitle();
    }

}
