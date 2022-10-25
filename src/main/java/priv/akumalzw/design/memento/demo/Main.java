package priv.akumalzw.design.memento.demo;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- 欢迎进入 魔塔 -----");
        System.out.println("角色注册：");
        GameRole role = new GameRole("张三");
        setRoleInfo(role);

        // 角色进入游戏中心
        GameBox box = new GameBox();
        box.setRole(role);

        // 管理员进行角色备份
        GameMaster master = new GameMaster();
        master.setMemento(box.createMemento());

        System.out.println("角色注册完成，开始闯关...");
        System.out.println(box.show());
        // 进行游戏
        while (role.isAlive()) {
            GameMonster monster = getMonster();
            System.out.printf("--> 遇到%s级【%s】\r\n", monster.getLevel(), monster.getName());
            if (RandomUtils.nextBoolean()) {
                roleAttack(role, monster);
                if (monster.isAlive()) {
                    monsterAttack(role, monster);
                }
            } else {
                monsterAttack(role, monster);
                if (role.isAlive()) {
                    roleAttack(role, monster);
                }
            }

            role.show();
        }

        System.out.println();
        System.out.println("角色已死亡，重新开始");
        System.out.println(box.getRole().toString());
        System.out.println();
        System.out.println("进行备份恢复");
        box.setMemento(master.getMemento());
        System.out.println(box.show());
    }

    private static void roleAttack(GameRole role, GameMonster monster) {
        System.out.printf("--> %s 发起猛烈的攻击\n", role.getName());
        if (role.getLevel() + 5 < monster.getLevel()) {
            System.out.printf("--> %s 受到攻击,毫无效果..\n", monster.getName());
        } else if (RandomUtils.nextBoolean()) {
            System.out.printf("--> 出现必杀一击, %s 被杀死了\n", monster.getName());
            role.setExp(monster.getExp());
            monster.setHp(0);
        } else {
            System.out.printf("--> %s 逃跑了\n", monster.getName());
            monster.setHp(-1);
        }
    }

    private static void monsterAttack(GameRole role, GameMonster monster) {
        System.out.printf("--> %s 使用技能 %s\n", monster.getName(), monster.getSkill());
        if (role.getLevel() + 5 < monster.getLevel() || monster.getSkill().contains("★")) {
            role.setHp(0);
        } else if (RandomUtils.nextBoolean()) {
            System.out.printf("--> 技能命中, %s 收到伤害\n", role.getName());
            int anInt = RandomUtils.nextInt(monster.getLevel(), monster.getLevel() * monster.getExp());
            if (anInt > role.getHp()) {
                role.setHp(0);
            } else {
                role.setHp(role.getHp() - anInt);
            }
        } else {
            System.out.printf("--> %s 闪躲，躲避成功\n", role.getName());
        }
    }

    private static final List<GameMonster> monsterList = Arrays.asList(
            new GameMonster("史莱姆", 1, 10, new String[]{"吐泡泡"}),
            new GameMonster("石头怪", 2, 20, new String[]{"冲撞"}),
            new GameMonster("蜘蛛幼虫", 2, 20, new String[]{"吐丝"}),
            new GameMonster("骷髅怪", 3, 40, new String[]{"双击"}),
            new GameMonster("小蝙蝠", 3, 40, new String[]{"音波"}),
            new GameMonster("丧尸", 5, 80, new String[]{"爪击"}),
            new GameMonster("吸血鬼", 9, 100, new String[]{"吸血"}),
            new GameMonster("雷精灵", 10, 200, new String[]{"雷暴", "十万伏特"}),
            new GameMonster("火精灵", 10, 200, new String[]{"火球", "火龙"}),
            new GameMonster("水精灵", 10, 200, new String[]{"水箭", "水神一击"}),
            new GameMonster("土精灵", 15, 500, new String[]{"地刺", "土龙"}),
            new GameMonster("风精灵", 15, 500, new String[]{"风痕", "风之伤"}),
            new GameMonster("精灵射手", 20, 1000, new String[]{"元素亲和", "二连击", "万箭齐发"}),
            new GameMonster("兽人王", 40, 6000, new String[]{"奋力一击", "野蛮冲撞", "无畏冲锋", "狂暴"}),
            new GameMonster("堕落天使", 50, 8000, new String[]{"诅咒", "腐蚀", "堕落", "幻灭", "破败"}),
            new GameMonster("骑士", 70, 10000, new String[]{"神圣守护", "圣光", "绝对正义", "神圣洗礼", "圣灵之枪", "神圣冲锋"}),
            new GameMonster("冥王", 80, 40000, new String[]{"死亡收割", "亡灵之气", "亡灵召唤", "冥气破", "冥王枪", "死亡召唤", "吞噬"}),
            new GameMonster("黄金龙王", 90, 8000, new String[]{"龙炎", "龙之怒", "炎龙击", "元素混乱", "裂空", "龙神击", "灭世", "灾祸"}),
            new GameMonster("至尊恶魔", 100, 999999, new String[]{"弑神砍", "魔力掌控", "天下共尊", "恶魔召唤", "死亡一指", "毁天灭地", "空间破碎", "时间静止", "时间静止", "★杀必死"})
    );

    public static void setRoleInfo(GameRole role) {
        GameCareerType[] types = GameCareerType.values();
        int i = RandomUtils.nextInt(0, types.length);
        GameCareerType type = types[i];

        switch (type) {
            case SOLDIER:
                role.setCareer(GameCareerType.SOLDIER.getType());
                role.setHp(200);
                role.setMp(80);
                role.setSpeed(0.5);
                role.setAck(50);
                role.setDefA(80);
                role.setMagic(25);
                role.setDefM(60);
                break;
            case WIZARD:
                role.setCareer(GameCareerType.WIZARD.getType());
                role.setHp(100);
                role.setMp(150);
                role.setSpeed(0.8);
                role.setAck(25);
                role.setDefA(30);
                role.setMagic(60);
                role.setDefM(50);
                break;
            case STRIKER:
                role.setCareer(GameCareerType.STRIKER.getType());
                role.setHp(100);
                role.setMp(100);
                role.setSpeed(1.5);
                role.setAck(60);
                role.setDefA(40);
                role.setMagic(20);
                role.setDefM(20);
                break;
            case ASSASSIN:
                role.setCareer(GameCareerType.ASSASSIN.getType());
                role.setHp(80);
                role.setMp(80);
                role.setSpeed(1);
                role.setAck(90);
                role.setDefA(15);
                role.setMagic(15);
                role.setDefM(15);
                break;
            default:
                role.setCareer("游客");
                role.setHp(150);
                role.setMp(100);
                role.setSpeed(1);
                role.setAck(50);
                role.setDefA(50);
                role.setMagic(50);
                role.setDefM(50);
                break;
        }
    }

    private static GameMonster getMonster() {
        int i = RandomUtils.nextInt(0, 10);
        int len = monsterList.size();
        if (i <= 7) {
            len = 6;
        } else if (i <= 9) {
            len = 12;
        }
        int anInt = RandomUtils.nextInt(0, len);

        return monsterList.get(anInt);
    }

}
