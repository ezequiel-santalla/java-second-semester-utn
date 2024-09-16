package model;

import java.util.UUID;

public class Coach extends Member {
    private String gameSystem;
    private String style;

    public Coach(UUID ID, String name, String lastName, Integer age) {
        super(ID, name, lastName, age);
    }

    public String getGameSystem() {
        return gameSystem;
    }

    public void setGameSystem(String gameSystem) {
        this.gameSystem = gameSystem;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "gameSystem='" + gameSystem + '\'' +
                ", style='" + style + '\'' +
                "} " + super.toString();
    }
}
