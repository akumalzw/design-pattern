package priv.akumalzw.design.memento.demo;

import org.apache.commons.lang3.RandomUtils;

public class GameMonster {
    private String name;
    private int level;
    private int hp;
    private int exp;
    private String[] skill;

    public GameMonster(String name, int level, int exp, String[] skill) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.skill = skill;

        hp = this.level * 100;
    }

    public String getName() {
        return "[" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSkill() {
        int i = RandomUtils.nextInt(0, skill.length);
        return skill[i];
    }

    public int getExp() {
        return exp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}
