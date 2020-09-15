package pokebattlesim;

public class Battle {
    public static String startBattle(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Start Battle: \n" + "Pokemon1: " + pokemon1.getNickname() +  "\nPokemon2: " + pokemon2.getNickname());
        return (pokemon1.getHp() > pokemon2.getHp()) ? pokemon1.getNickname() + " Win" :  pokemon2.getNickname() + " Win";
    }
}