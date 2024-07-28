package Adapter;

// Client Class
public class AdapterMain {
    public static void main(String[] args) {
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhone adapter = new CellPhoneAdapter(adaptee);
        adapter.call();
    }
}
