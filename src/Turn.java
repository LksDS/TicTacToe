public class Turn {
    private Player player;
    private Table table;
    private Vector indexsquare;
    public Turn(){
    }
    public void setTable(Table table){
        this.table = table;
    }
    public void setPlayer(Player player){
        this.player = player;
    }

    public void jogarAVez(){
        System.out.printf("Vez de %s (%s)\n", player.getNome(), player.getMarcador());
        boolean isSeted = false;
        while (!isSeted){
            table.printTable();
            receberValores();
            table.setMarker(indexsquare, player.getMarcador());
            if(table.isSeted()){
                isSeted = true;
            }else {
                System.out.println("A posição desejada já está marcada");
            }
        }
    }
    public boolean isValidIndex(int x, int y){
        return x >= 1 && x <= 3 && y >= 1 && y <= 3;
    }


    public void receberValores(){
        int x = 0, y = 0;
        while (!isValidIndex(x,y)){
            System.out.println("Insira uma posição válida (entre 1 e 3)");
            System.out.println("Insira a posição x em que você deseja colocar seu " + player.getMarcador());
            String xvalue = Main.scan.nextLine();
            if(Main.isNumber(xvalue))
                x = Integer.parseInt(xvalue);
            System.out.println("Insira a posição y em que você deseja colocar seu " + player.getMarcador()+"\n");
            String yvalue = Main.scan.nextLine();
            if(Main.isNumber(yvalue)){
                y = Integer.parseInt(yvalue);
            }
        }
        indexsquare = new Vector(x,y);
    }
}
