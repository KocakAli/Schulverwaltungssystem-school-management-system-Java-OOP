public class Person {

    //todo
    //Define Person class attributes specified in sketch
    public String userName;
    public String userSurname;
    public int userID;
    public String userHandy;
    public String userEmail;


    //todo
    //Create constructor for Person class
    public Person(String name, String surname, int ID, String handy, String email){
        userName = name;
        userSurname = surname;
        userID = ID;
        userHandy = handy;
        userEmail = email;
    }

    //todo
    //Create methods for Person Class
    //+giveInfo() +updateHandy() +updateEmail() +getID()

    //getID() -> return Person's ID
    public String getUserID() {
        return "p" + userID;
    }


    //giveInfo() -> Print out screen Person's personal information
    public void giveInfo(){
        System.out.println("---- Person Information ----");
        System.out.format("Person ID: %s\nPerson Name: %s\nPerson Surname: %s\nPerson Handy: %s\nPerson Email: %s\n\n",getUserID(),userName,userSurname,userHandy, userEmail);
    }


    //updateHandy() -> Update Person's phone number
    public void updateHandy(String newHandy){
        userHandy = newHandy;
        System.out.println("Person phone number changed to " + newHandy + " successfully\n");
    }

    //updateEmail() -> Update Person's Email Address
    public void  updateEmail(String newEmail){
        userEmail = newEmail;
        System.out.println("Person email changed to " + newEmail + " successfully\n");
    }

}
