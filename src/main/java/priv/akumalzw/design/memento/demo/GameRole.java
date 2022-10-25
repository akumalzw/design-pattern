package priv.akumalzw.design.memento.demo;

public class GameRole implements Cloneable {
    private String name;
    private String career;
    private int preLevel = 1;
    private int level = 1;
    private int hp;
    private int mp;
    private double speed;
    private int ack;
    private int defA;
    private int magic;
    private int defM;
    private int exp;

    public GameRole(String name) {
        this.name = name;
    }

    public String getName() {
        return "♠" + name + "♠";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getDefA() {
        return defA;
    }

    public void setDefA(int defA) {
        this.defA = defA;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDefM() {
        return defM;
    }

    public void setDefM(int defM) {
        this.defM = defM;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp += exp;
        this.preLevel = level;
        while (this.exp - (100 * level) > 0) {
            this.exp -= 100 * level;
            level++;
            hp += 100;
            mp += 100;
            speed += 0.2;
            ack += 10;
            defA += 5;
            magic += 10;
            defM += 5;
        }
    }

    @Override
    public String toString() {
        return "角色{" +
                "  ID='" + name + '\'' +
                ", 职业='" + career + '\'' +
                ", 等级='" + level + '\'' +
                ", 血量='" + hp + '\'' +
                ", 蓝量='" + mp + '\'' +
                ", 攻速=" + speed +
                ", 物攻='" + ack + '\'' +
                ", 物抗='" + defA + '\'' +
                ", 魔攻='" + magic + '\'' +
                ", 魔抗='" + defM + '\'' +
                '}';
    }

    @Override
    public GameRole clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (GameRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void show() {
        if (hp <= 0) {
            System.out.printf("--> %s 受到致命伤，死亡！\n", this.name);
            return;
        }
        if (level > preLevel) {
            System.out.printf("--> %s 等级提升, LV%s --> LV%s\n", this.name, this.preLevel, this.level);
            preLevel = level;
        }
    }
}
