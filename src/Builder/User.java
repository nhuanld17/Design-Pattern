package Builder;

public class User {
    // required parameters
    private final String name;
    private final String email;

    // optional parameters
    private final String phone;
    private final String city;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    // Builder Class
    public static class UserBuilder {
        private final String name;
        private final String email;
        private String phone;
        private String city;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
