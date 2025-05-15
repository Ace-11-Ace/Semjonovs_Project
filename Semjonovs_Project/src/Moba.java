public class Moba extends Games{
    private int heroes;
    Moba(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price, int heroes){
        super(NameOfGame,year, creators, online, players, plot, price);
        this.heroes=heroes;
    }
    public String print_info () {
        return (getNameOfGame()+", Year: "+ getYear() +", Creators: "+getCreators()+", Online: "+isOnline()+", Number of Players: "+getPlayers()+", Plot: "+isPlot()+", Price: "+getPrice()+", Count of Heroes: "+heroes);
    }
}

