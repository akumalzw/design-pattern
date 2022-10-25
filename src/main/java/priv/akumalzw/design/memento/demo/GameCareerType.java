package priv.akumalzw.design.memento.demo;

public enum GameCareerType {
    SOLDIER("战士"),
    WIZARD("法师"),
    STRIKER("射手"),
    ASSASSIN("刺客");

    private final String type;

    GameCareerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
