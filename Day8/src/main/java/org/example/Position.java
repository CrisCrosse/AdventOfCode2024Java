package org.example;

import java.util.Objects;

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

    public boolean isOutOfBounds(int limit) {
        boolean rowIsOutOfBounds = getRow() < 0 || getRow() > limit;
        boolean colIsOutOfBounds = getCol() < 0 || getCol() > limit;
        return rowIsOutOfBounds || colIsOutOfBounds;
    }

    public boolean isInBounds(int limit) {
        return !isOutOfBounds(limit);
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
    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
