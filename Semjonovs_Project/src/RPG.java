public class RPG extends Games{
    private boolean linear_plot;
    RPG(String NameOfGame,int year, String creators, boolean online, int players, boolean plot, int price, boolean linear_plot){
        super(NameOfGame,year, creators, online, players, plot, price);
        this.linear_plot=linear_plot;
    }
    public String print_info () {
        return (getNameOfGame()+", Year: "+ getYear() +", Creators: "+getCreators()+", Online: "+isOnline()+", Number of Players: "+getPlayers()+", Plot: "+isPlot()+", Price: "+getPrice()+", Linear Plot: "+linear_plot);
    }
}

