package lld.Chess;

public class Player {
    private String player;
    private Color color;

    public Player(String player, Color color) {
        this.player = player;
        this.color = color;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
