public class Player {
    private final char marker;
    private int wins;
    private final String name;
    public Player(String name, char marker){
        setWins(0);
        this.name = name;
        this.marker = marker;
    }
    String getNome(){
        return this.name;
    }

    public char getMarker() {
        return marker;
    }

    public void setWins(int wins){
        this.wins = wins;
    }
    public int getWins(){
        return this.wins;
    }
}
