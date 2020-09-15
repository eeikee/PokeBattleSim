/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokebattlesim;

/**
 *
 * @author eeikee
 */
public class Pokemon {
    private String namae;
    private String nickname;
    private String type;
    private int hp;
    private int lvl;
    private int attack;
    private int defense;

    public Pokemon(String namae, String nickname, String type) {
        
        this.namae = namae;
        if(nickname.equals("")){
            this.nickname = namae;
        } else{
             this.nickname = nickname;
        }
        this.type = type;
        this.hp = hp;
        this.lvl = 1;
        calcAtcDfsHp();
    }

    @Override
    public String toString() {
        return "Pokemon: \n" + "namae: " + namae + "\nnickname: " + nickname + "\ntype: " + type + "\nhp: " + hp + "\nlvl: " + lvl + "\nattack: " + attack + "\ndefense: " + defense;
    }
    
    public int getDefense() {
        return defense;
    }

    protected void setDefense(int defense) {
        this.defense = defense;
    }

    private String getNamae() {
        return namae;
    }

    private void setNamae(String namae) {
        this.namae = namae;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public int getLvl() {
        return lvl;
    }

    private void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getAttack() {
        return attack;
    }

    protected void setAttack(int attack) {
        this.attack = attack;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    protected void calcAtcDfsHp() {
        switch (this.getType()) {
            case "Honoo":
                this.setHp(30);
                this.setAttack(5);
                this.setDefense(2);
                break;
            case "Mizu":
                this.setHp(36);
                this.setAttack(4);
                this.setDefense(3);
                break;
            case "jimen":
            case "Dark":
                this.setHp(25);
                this.setAttack(6);
                this.setDefense(1);
                break;
            case "hikou":
                this.setHp(32);
                this.setAttack(3);
                this.setDefense(4);
                break;
            case "Kusa":
                this.setHp(30);
                this.setAttack(2);
                this.setDefense(5);
                break;
            case "Kakutou":
                this.setHp(22);
                this.setAttack(7);
                this.setDefense(0);
                break;
            case "Denki":
            case "Hagane":
                this.setHp(34);
                this.setAttack(4);
                this.setDefense(4);
                break;
            case "Normal":
                this.setHp(28);
                this.setAttack(3);
                this.setDefense(3);
                break;
            case "Ghost":
                this.setHp(28);
                this.setAttack(5);
                this.setDefense(4);
                break;
            case "Koori":
                this.setHp(32);
                this.setAttack(3);
                this.setDefense(5);
                break;
            default:
                this.setHp(20);
                this.setAttack(3);
                this.setDefense(0);
        }
    }
    
    public void lvlBonus(){
        this.setHp(this.getHp() + (this.getLvl() / 5));
        this.setAttack(this.getAttack() + (this.getLvl() / 5));
        this.setDefense(this.getDefense() + ( this.getLvl() / 5));
    }
}
