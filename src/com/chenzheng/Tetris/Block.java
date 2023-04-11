package com.chenzheng.Tetris;

import java.awt.*;

public class Block {
    private int x; // 方块的横坐标
    private int y; // 方块的纵坐标
    private Color color; // 方块的颜色
    private boolean[][] shape; // 方块的形状，使用布尔型数组表示

    public Block(int x, int y, Color color, boolean[][] shape) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.shape = shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public boolean[][] getShape() {
        return shape;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShape(boolean[][] shape) {
        this.shape = shape;
    }
}

