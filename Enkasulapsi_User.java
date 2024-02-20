package enkasulapsi_user;

public class Enkasulapsi_User {

    public static void main(String[] args) {
        var Faris = new User("Faris","Makan");
        
        Faris.setUsername("Faris");
        Faris.setPassword("Makan");
        Faris.setId("1234");
        
        System.out.println("Username : "+Faris.getUsername());
        System.out.println("Username : "+Faris.getPassword());
        
    }
    
}

