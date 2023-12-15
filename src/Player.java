public class Player {
    private final char marcador;
    private int vitorias;
    private final String nome;
    public Player(String nome, char marcador){
        setVitorias(0);
        this.nome = nome;
        this.marcador = marcador;
    }
    String getNome(){
        return this.nome;
    }

    public char getMarcador() {
        return marcador;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getVitorias(){
        return this.vitorias;
    }
}
