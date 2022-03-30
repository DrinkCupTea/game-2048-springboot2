package cn.xie.entity;

public class Game {

    private int id;
    private int tileRow;
    private int tileColumn;
    private int tileValue;
    private String nextMove;

    public Game(int id, int tileRow, int tileColumn, int tileValue, String nextMove) {
        this.id = id;
        this.tileRow = tileRow;
        this.tileColumn = tileColumn;
        this.tileValue = tileValue;
        this.nextMove = nextMove;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTileRow() {
        return tileRow;
    }
    public void setTileRow(int tileRow) {
        this.tileRow = tileRow;
    }
    public int getTileColumn() {
        return tileColumn;
    }
    public void setTileColumn(int tileColumn) {
        this.tileColumn = tileColumn;
    }
    public int getTileValue() {
        return tileValue;
    }
    public void setTileValue(int tileValue) {
        this.tileValue = tileValue;
    }
    public String getNextMove() {
        return nextMove;
    }
    public void setNextMove(String nextMove) {
        this.nextMove = nextMove;
    }

}
