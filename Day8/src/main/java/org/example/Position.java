package org.example;

public class Position {
    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    public Position minus(Position pos) {
        return new Position(getRow() - pos.getRow(), getCol() - pos.getCol());
    }

    public Position add(Position pos) {
        return new Position(getRow() + pos.getRow(), getCol() + pos.getCol());
    }

    public boolean isOutOfBounds() {
        boolean rowIsOutOfBounds = getRow() < 0 || getRow() > 49;
        boolean colIsOutOfBounds = getCol() < 0 || getCol() > 49;
        return rowIsOutOfBounds || colIsOutOfBounds;
    }

    public boolean isNotOutOfBounds() {
        return !isOutOfBounds();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Position [row=");
        builder.append(row);
        builder.append(", col=");
        builder.append(col);
        builder.append("]");
        return builder.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Position other))
            return false;
        return (this.getRow() == other.getRow()) && (this.getCol() == other.getCol());
    }
}
