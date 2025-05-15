public class Shooter extends Games{
    private int guns;
    Shooter(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price, int guns){
        super(NameOfGame,year, creators, online, players, plot, price);
        this.guns=guns;
    }
    public String print_info () {
        return (getNameOfGame()+", Year: "+ getYear() +", Creators: "+getCreators()+", Online: "+isOnline()+", Number of Players: "+getPlayers()+", Plot: "+isPlot()+", Price: "+getPrice()+", Count of guns: "+guns);
    }
}

