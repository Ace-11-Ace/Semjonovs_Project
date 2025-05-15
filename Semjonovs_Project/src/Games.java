import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;

public class Games {
    private String NameOfGame;
    private int year;
    private String creators;
    private boolean online;
    private int players;
    private boolean plot;
    private int price;
    public Games(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price){
        this.NameOfGame=NameOfGame;
        this.year=year;
        this.creators=creators;
        this.online=online;
        this.players=players;
        this.plot=plot;
        this.price=price;
    }
    public String print_info () {
        return (NameOfGame+", Year: "+ year +", Creators: "+creators+", Online: "+online+", Number of Players: "+players+", Plot: "+plot+", Price: "+price);
    }
    public static void writeFile(String content){
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(content);
            fw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readFile() {
        try (FileReader reader = new FileReader("output.txt")) {
            String result = "";
            int c;
            while ((c = reader.read()) != -1) {
                result += (char) c;
            }
            return result;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=======================================");
        System.out.println("       Welcome to GameRent!");
        System.out.println("  Your platform for renting video games");
        System.out.println("=======================================");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Please select an option: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Redirecting to login...");
                loginUser();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                GameList();
                break;
            case 2:
                System.out.println("Redirecting to registration...");
                registerUser();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Start();
            case 3:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                Start();
        }

        scanner.close();
    }
    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Registration ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Create a password: ");
        String password = scanner.nextLine();
        System.out.println("Registration successful!");
        System.out.println("Welcome, " + name + "!");
        String userdata = "email: "+email+"\npassword: "+password+"\n";
        writeFile(userdata);
    }
    public static void loginUser(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != 1){
            System.out.println("=== User Log In ===");
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            String userdata = "email: "+email+"\npassword: "+password+"\n";;
            if (Games.readFile().equals(userdata)){
                System.out.println("Succesful login");
                i++;
            }
            else {
                System.out.println("Incorect password");
            }
        }
    }
    public static void GameList(){
        Games mb1 = new Moba("Dota2",2012,"Valve",true,10,false,2,100);
        Games ag1 = new Action_RPG("PathOfExile2",2024,"GGG",true,1,true,30,true);
        Games rgl1 = new Rogue_like("Hades",2019,"Supergiant Games",false,1,true,10, (byte) 4);
        Games rpg1 = new RPG("Witcher 3",2015,"CD Project Red",false,1,true,30,false);
        Games sht1 = new Shooter("Counter Strike 2", 2023,"Valve",true,10,false,15,53);
        System.out.println("=== There is the list of games which you can rent===");
        System.out.println("1) "+mb1.print_info());
        System.out.println("2) "+ag1.print_info());
        System.out.println("3) "+rgl1.print_info());
        System.out.println("4) "+rpg1.print_info());
        System.out.println("5) "+sht1.print_info());
        System.out.println("Press wich game you want to rent");
        Scanner in = new Scanner(System.in);
        int price;
        int chose_for_rent = in.nextInt();
        switch (chose_for_rent){
            case 1:
                price = 1 + mb1.getPrice() / 10;
                System.out.println("You need to pay " + price + "euros for 1 day");
                System.out.println("Thank you!");
                break;
            case 2:
                price = 1 + ag1.getPrice() / 10;
                System.out.println("You need to pay " + price + "euros for 1 day");
                System.out.println("Thank you!");
                break;
            case 3:
                price = 1 + rgl1.getPrice() / 10;
                System.out.println("You need to pay " + price + "euros for 1 day");
                System.out.println("Thank you!");
                break;
            case 4:
                price = 1 + rpg1.getPrice() / 10;
                System.out.println("You need to pay " + price + "euros for 1 day");
                System.out.println("Thank you!");
                break;
            case 5:
                price = 1 + sht1.getPrice() / 10;
                System.out.println("You need to pay " + price + "euros for 1 day");
                System.out.println("Thank you!");
                break;
        }
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCreators() {
        return creators;
    }

    public void setCreators(String creators) {
        this.creators = creators;
    }

    public String getNameOfGame() {
        return NameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        NameOfGame = nameOfGame;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public boolean isPlot() {
        return plot;
    }

    public void setPlot(boolean plot) {
        this.plot = plot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

