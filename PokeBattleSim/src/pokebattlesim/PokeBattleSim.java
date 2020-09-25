/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokebattlesim;

import static pokebattlesim.Battle.startBattle;

/**
 *
 * @author eeikee
 */
public class PokeBattleSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon lucario = new Pokemon("lucario","","Kakutou");
        Pokemon pikachu = new Pokemon("pikachu","","Denki");

        new Battle(lucario,pikachu);
        new Battle(lucario,pikachu);
        new Battle(lucario,pikachu);
    }
}
