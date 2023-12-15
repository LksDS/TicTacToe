public class Game {
    boolean isEnded = false;
    int turns;
    int timesplayed = 0;
    Table table;
    Player[] players = new Player[2];
    public Game(){
        this.table = new Table();
    }
    public void registerPlayers(){
        System.out.println("Insira o nome do jogador 1");
        players[0] = new Player(Main.scan.nextLine(),'X');
        System.out.println("Insira o nome do jogador 2");
        players[1] = new Player(Main.scan.nextLine(),'O');
    }
    public void start(){
        timesplayed += 1;
        table.resetTable();
        isEnded = false;
        turns = 0;
        Turn round = new Turn();
        round.setTable(table);
        while(!isEnded){
            round.setPlayer(playerOfTheTurn());
            round.jogarAVez();
            if(table.isVictory(playerOfTheTurn())){
                table.printTable();
                System.out.printf("%s Ganhou o jogo\n", playerOfTheTurn().getNome());
                playerOfTheTurn().setWins(playerOfTheTurn().getWins()+1);
                isEnded = true;
            }else if(turns == 8) {
                table.printTable();
                System.out.println("Ambos empataram");
                isEnded = true;
            }
            turns +=1;
        }
        System.out.printf("Vitórias: %s %d X %s %d\n", players[0].getNome(), players[0].getWins(), players[1].getNome(), players[1].getWins());
        this.askRematch();
    }

    public Player playerOfTheTurn(){
        if (timesplayed %2 ==1){
            if(turns %2==0)
                return players[0];
            else
                return players[1];
        }else {
            if(turns %2==0)
                return players[1];
            else
                return players[0];
        }

    }
    public void askRematch(){
        System.out.println("Quer uma revanche? (0 para sim, 1 para não)");
        boolean replied = false;
        while(!replied){
            String reply = Main.scan.nextLine();
            switch(reply){
                case "0":
                    this.start();
                    replied = true;
                    break;
                case "1":
                    replied = true;
                    break;
        }

        }
    }
}
