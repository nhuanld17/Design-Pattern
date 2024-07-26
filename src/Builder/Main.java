package Builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Lê Đình Nhuận", "nhuan@gmail.com")
                .setPhone("0342043637")
                .setCity("Tỉnh Thừa Thiên Huế")
                .build();

        User user2 = new User.UserBuilder("Hồ Thanh Quảng", "quang@gmail.com")
                .setCity("Tỉnh Thừa Thiên Huế")
                .build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
