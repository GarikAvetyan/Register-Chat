package CodeSchool;

public class User {
    private String email;
    private String username;
    private int age;
    private boolean gender;

    //Default Constructor
    public User() {

    }

    //Constructor
    public User(String email, String username, int age, boolean gender) {
        setEmail(email);
        setUsername(username);
        setAge(age);
        setGender(gender);
    }


    //setters
    public void setEmail(String email) {
        if (email.length() > 10 && email.substring(email.length() - 10, email.length()).equals("@gmail.com")) {
            this.email = email;
        } else {
            this.email = email + "@gmail.com";
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    //getters
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        if (gender) {
            return "Male";
        }
        return "Female";
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Username: " + username + ", Age: " + getAge() + ", Gender: " + getGender();
    }
}
