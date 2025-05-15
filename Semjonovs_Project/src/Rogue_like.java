public class Rogue_like extends Games{
    private byte floors;
    Rogue_like(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price, byte floors){
        super(NameOfGame,year, creators, online, players, plot, price);
        this.floors=floors;
    }
    public String print_info () {
        return (getNameOfGame()+", Year: "+ getYear() +", Creators: "+getCreators()+", Online: "+isOnline()+", Number of Players: "+getPlayers()+", Plot: "+isPlot()+", Price: "+getPrice()+", Count of Floors: "+floors);
    }
}
