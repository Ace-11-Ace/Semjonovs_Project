public class Action_RPG extends Games{
    private boolean loot;
Action_RPG(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price, boolean loot){
    super(NameOfGame,year, creators, online, players, plot, price);
    this.loot=loot;
}
    public String print_info () {
        return (getNameOfGame()+", Year: "+ getYear() +", Creators: "+getCreators()+", Online: "+isOnline()+", Number of Players: "+getPlayers()+", Plot: "+isPlot()+", Price: "+getPrice()+", Loot: "+loot);
    }
}
