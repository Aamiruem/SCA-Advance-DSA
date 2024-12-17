// package OPPS.L26Aggregation;
// class musicPlayer{
//     private String name;
//     private int year;
//     public musicPlayer(String name, int year){
//         this.name = name;
//         this.year = year;
//     }
//     public void start(){
//         System.out.println("Music Player started.....");
//     }
//     public void stop(){
//         System.out.println("Music Player stopped.....");
//     }


//     //set value
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setYear(int year){
//         this.year = year;
//     }

//     //return value
//     public String getName(){
//         return name;
//     }
//     public int getYear(){
//         return year;
//     }
// }

// class Car{

//     private String name;
//     private musicPlayer player;

//     public Car(String name, musicPlayer player){
//         this.name = name;
//         this.player = player;
//     }
//     public void start(){
//         player.start();
//     }
//     public void stop(){
//         player.stop();
//     }
// }
// public class Aggregates {
//     public static void main(String[] args) {

//         musicPlayer player = new musicPlayer("Rock Music", 2010);
//         player.start();
//         player.stop();
//         System.out.println();
        
//         System.out.println("Music Player: " + player.getName() + ", Year: " + player.getYear());
//         player.setName("Pop Music");
//         System.out.println("Updated Music Player: " + player.getName() + ", Year: " + player.getYear());

//         System.out.println();

//         Car car = new Car("BMW", player);
//         car.start();
//         car.stop();

        

//     }
// }








package OPPS.L26Aggregation;

// MusicPlayer class
class musicPlayer {
    // Private instance variables
    private String name;
    private int year;

    // Constructor to initialize instance variables
    public musicPlayer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Method to start the music player
    public void start() {
        System.out.println("Music Player started.....");
    }

    // Method to stop the music player
    public void stop() {
        System.out.println("Music Player stopped.....");
    }

    // Setter methods to set the values of instance variables
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter methods to get the values of instance variables
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

// Car class
class Car {
    // Private instance variables
    private String name;
    private musicPlayer player; // Composition: Car has a musicPlayer

    // Constructor to initialize instance variables
    public Car(String name, musicPlayer player) {
        this.name = name;
        this.player = player;
    }

    // Method to start the music player in the car
    public void start() {
        player.start(); // Delegation: Car delegates the start operation to the musicPlayer
    }

    // Method to stop the music player in the car
    public void stop() {
        player.stop(); // Delegation: Car delegates the stop operation to the musicPlayer
    }
}

public class Aggregates {
    public static void main(String[] args) {
        // Create a musicPlayer object
        musicPlayer player = new musicPlayer("Rock Music", 2010);
        player.start(); // Start the music player
        player.stop(); // Stop the music player

        System.out.println();

        // Print the music player's details
        System.out.println("Music Player: " + player.getName() + ", Year: " + player.getYear());
        player.setName("Pop Music"); // Update the music player's name
        System.out.println("Updated Music Player: " + player.getName() + ", Year: " + player.getYear());

        System.out.println();

        // Create a Car object with the musicPlayer object
        Car car = new Car("BMW", player);
        car.start(); // Start the music player in the car
        car.stop(); // Stop the music player in the car
    }
}
