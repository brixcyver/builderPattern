public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    protected User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        protected final String firstName;
        protected final String lastName;
        protected final String email;
        protected String address = "";
        protected String phone = "";
        protected int age = 0;

        public Builder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
