package org.jumpmind.symmetric.is.ui.diagram;

import java.io.Serializable;
import java.util.UUID;

public class Node implements Serializable {

    private static final long serialVersionUID = 1L;

    int height = 40;
    int width = 100;
    int x = 0;
    int y = 0;
    String text;
    String id = UUID.randomUUID().toString();

    public Node(String text) {
        this.text = text;
    }
    
    public Node() {
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
