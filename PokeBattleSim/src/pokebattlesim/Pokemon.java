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

    public Pokemon(String namae, String nickname, String type, int hp, int lvl) {
        
        this.namae = namae;
        if(nickname.equals("")){
            this.nickname = namae;
        } else{
             this.nickname = nickname;
        }
        this.type = type;
        this.hp = hp;
        this.lvl = lvl;
        calcAtcDfs();
    }

    @Override
    public String toString() {
        return "Pokemon: \n" + "namae: " + namae + "\nnickname: " + nickname + "\ntype: " + type + "\nhp: " + hp + "\nlvl: " + lvl + "\nattack: " + attack + "\ndefense: " + defense;
    }
    
    private int getDefense() {
        return defense;
    }

    private void setDefense(int defense) {
        this.defense = defense;
    }

    private String getNamae() {
        return namae;
    }

    private void setNamae(String namae) {
        this.namae = namae;
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    private int getHp() {
        return hp;
    }

    private void setHp(int hp) {
        this.hp = hp;
    }

    private int getLvl() {
        return lvl;
    }

    private void setLvl(int lvl) {
        this.lvl = lvl;
    }

    private int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }
    
    private void calcAtcDfs() {
        switch (this.getType()) {
            case "Honoo":
                this.setAttack(70);
                this.setDefense(30);
                break;
            case "Mizu":
                this.setAttack(40);
                this.setDefense(60);
                break;
            case "jimen":
               this.setAttack(50);
                this.setDefense(100);
                break;
            case "hikou":
                this.setAttack(100);
                this.setDefense(20);
                break;
            case "Kusa":
                this.setAttack(20);
                this.setDefense(100);
                break;
            case "Kakutou":
                this.setAttack(120);
                this.setDefense(60);
                break;
            default:
                this.setAttack(50);
                this.setDefense(50);
        }
    }
     
}
