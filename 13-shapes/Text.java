public class Text implements HasPosition {
    protected String content;
    protected int x;
    protected int y;

    public Text(String content, int topLeftX, int topLeftY) {
        this.content = content;
        this.x = topLeftX;
        this.y = topLeftY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}