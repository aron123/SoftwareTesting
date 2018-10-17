package hu.uni.miskolc.iit.softwaretesting.model;

public class User {

    /**
     * @param username - The users name
     **/
    private String username;
    /**
     * @param password - The users password
     **/
    private Password password;
    /**
     * @param firstName - The users firstname.
     **/
    private String firstName;
    /**
     * @param lastName - The users lastname.
     **/
    private String lastName;
    /**
     * @param email - The users e-mail address.
     **/
    private String email;
    /**
     * @param mobileNumber - The users mobile phone number.
     **/
    private String mobileNumber;

    public User(String username, Password password, String firstName, String lastName, String email, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    /**
     * This object represents user data.
     * **/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }









}