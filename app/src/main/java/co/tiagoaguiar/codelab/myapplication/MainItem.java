package co.tiagoaguiar.codelab.myapplication;

public class MainItem {
    private int id;
    private int drawableID;
    private int textStringID;
    private int color;

    public MainItem(int id, int drawableID, int textStringID, int color) {
        this.id = id;
        this.drawableID = drawableID;
        this.textStringID = textStringID;
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDrawableID(int drawableID) {
        this.drawableID = drawableID;
    }

    public void setTextStringID(int textStringID) {
        this.textStringID = textStringID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return color;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public int getTextStringID() {
        return textStringID;
    }
}
