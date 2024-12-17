// package OPPS.L26Aggregation;

// class MusicPlayer {
//     String name;
//     private int year;
//     private boolean isPlaying;
//     private boolean isPaused;

//     public MusicPlayer(String name, int year) {
//         this.name = name;
//         this.year = year;
//         isPlaying = false;
//         isPaused = false;
//     }

//     public void play() {
//         if (!isPlaying) {
//             System.out.println("Music Player started playing...");
//             isPlaying = true;
//         } else {
//             System.out.println("Music Player is already playing...");
//         }
//     }

//     public void pause() {
//         if (isPlaying) {
//             System.out.println("Music Player paused...");
//             isPaused = true;
//             isPlaying = false;
//         } else {
//             System.out.println("Music Player is not playing...");
//         }
//     }

//     public void stop() {
//         if (isPlaying || isPaused) {
//             System.out.println("Music Player stopped...");
//             isPlaying = false;
//             isPaused = false;
//         } else {
//             System.out.println("Music Player is not playing...");
//         }
//     }

//     public void displayName() {
//         System.out.println("Name: " + name);
//     }

//     public String getYear() {
//         return String.valueOf(year);
//     }

//     public void setName(String name) {
//         this.name = name;
//         System.out.println("Music Player Name Updated: " + name);
//     }
// }

// class Car {
//     private String name;
//     private MusicPlayer player;

//     public Car(String name, MusicPlayer player) {
//         this.name = name;
//         this.player = player;
//     }

//     public void startMusic() {
//         player.play();
//     }

//     public void stopMusic() {
//         player.stop();
//     }

//     public void pauseMusic() {
//         player.pause();
//     }

//     @Override
//     public String toString() {
//         return "Car: " + name + ", Music Player: " + player.name;
//     }
// }

// public class Aggregate {
//     public static void main(String[] args) {
//         MusicPlayer player = new MusicPlayer("Rock Music", 2010);
//         player.play();
//         player.pause();
//         player.stop();

//         System.out.println();

//         player.displayName();
//         System.out.println("Year: " + player.getYear());
//         player.setName("Pop Music");
//         System.out.println("Updated Music Player: ");
//         player.displayName();
//         System.out.println("Year: " + player.getYear());

//         System.out.println();

//         Car car = new Car("BMW", player);
//         System.out.println(car.toString()); // Print the Car object's details
//         car.startMusic();
//         car.pauseMusic();
//         car.stopMusic();
//     }
// }











package OPPS.L26Aggregation;

class MusicPlayer {
    private String name;
    private int year;
    private boolean isPlaying;
    private boolean isPaused;

    public MusicPlayer(String name, int year) {
        this.name = name;
        this.year = year;
        isPlaying = false;
        isPaused = false;
    }

    public void start() {
        isPlaying = true;
        isPaused = false;
        System.out.println("Music player has started playing.");
    }

    public void stop() {
        isPlaying = false;
        isPaused = false;
        System.out.println("Music player has stopped playing.");
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Music Player Name Updated: " + name);
    }
}

class Car {
    private String name;
    private MusicPlayer player;

    public Car(String name, MusicPlayer player) {
        this.name = name;
        this.player = player;
    }

    public void start() {
        System.out.println("Car " + name + " is starting.");
        player.start();
    }

    public void stop() {
        System.out.println("Car " + name + " is stopping.");
        player.stop();
    }

    @Override
    public String toString() {
        return "Car: " + name + ", Music Player: " + player.getName() + ", Year: " + player.getYear();
    }
}

public class Aggregate {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Rock Music", 2010);
        player.start();
        player.stop();

        System.out.println();

        System.out.println("Music Player: " + player.getName() + ", Year: " + player.getYear());
        player.setName("Pop Music");
        System.out.println("Updated Music Player: " + player.getName() + ", Year: " + player.getYear());

        System.out.println();

        Car car = new Car("BMW", player);
        System.out.println(car.toString()); // Print the Car object's details
        car.start();
        car.stop();
    }
}
