package pokebattlesim;

public class Battle{

    public static String startBattle(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Start Battle: \n" + pokemon1.getNickname() +  " VS " + pokemon2.getNickname()+"\n");
        AtcDfsBonus(pokemon1,pokemon2);
        AtcDfsBonus(pokemon2,pokemon1);
        pokemon1.lvlBonus();
        pokemon2.lvlBonus();
        do{
            if(pokemon1.getAttack()-pokemon2.getDefense() > 0){
                pokemon2.setHp(pokemon2.getHp() - (pokemon1.getAttack() - pokemon2.getDefense()));
            }
            if(pokemon2.getHp() <= 0){
                System.out.println(pokemon1.getNickname()  + " HP: " + pokemon1.getHp() + " Attack!");
                System.out.println(pokemon2.getNickname() + " HP: 0" + "\n");
                pokemon1.setLvl(pokemon1.getLvl()+1);
                System.out.println(pokemon1.getNickname() + "LVL UP! LVL: " + pokemon1.getLvl());
            }
            else{
                System.out.println(pokemon1.getNickname()  + " HP: " + pokemon1.getHp() + " Attack!");
                System.out.println(pokemon2.getNickname() + " HP: " + pokemon2.getHp()+"\n");
                if(pokemon2.getAttack()-pokemon1.getDefense() > 0){
                    pokemon1.setHp(pokemon1.getHp() - (pokemon2.getAttack() - pokemon1.getDefense()));
                    if(pokemon1.getHp() <= 0){
                        System.out.println(pokemon2.getNickname()  + " HP: " + pokemon2.getHp() + " Attack!");
                        System.out.println(pokemon1.getNickname() + " HP: 0" +"\n");
                        pokemon2.setLvl(pokemon2.getLvl()+1);
                        System.out.println(pokemon2.getNickname() + " LVL UP! LVL: " + pokemon2.getLvl());
                    }
                    else{
                        System.out.println(pokemon2.getNickname()  + " HP: " + pokemon2.getHp() + " Attack!");
                        System.out.println(pokemon1.getNickname() + " HP: " + pokemon1.getHp()+"\n");
                    }
                }
            }
        }while(pokemon1.getHp() > 0 && pokemon2.getHp() > 0);
        pokemon1.pokemonCenter(pokemon1);
        pokemon2.pokemonCenter(pokemon2);
        return (pokemon1.getHp() > pokemon2.getHp()) ? pokemon1.getNickname() + " Win" + "\n":  pokemon2.getNickname() + " Win"+ "\n";
    }
    public static void AtcDfsBonus(Pokemon pokemon1, Pokemon pokemon2){
        switch (pokemon1.getType()) {
            case "Honoo":
                if(pokemon2.getType().equals("Kusa")||pokemon2.getType().equals("Hagane")||pokemon2.getType().equals("Koori")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Hagane")||pokemon2.getType().equals("Honoo")||pokemon2.getType().equals("Kusa")||pokemon2.getType().equals("Koori")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Mizu":
                if(pokemon2.getType().equals("Jimen")|| pokemon2.getType().equals("Honoo")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Hagane")||pokemon2.getType().equals("Honoo")||pokemon2.getType().equals("Mizu")||pokemon2.getType().equals("Koori")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "jimen":
                if(pokemon2.getType().equals("Hagane")|| pokemon2.getType().equals("Honoo")|| pokemon2.getType().equals("Denki")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Denki")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Dark":
                if(pokemon2.getType().equals("Ghost")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Ghost") || pokemon2.getType().equals("Dark")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "hikou":
                if(pokemon2.getType().equals("Kakutou") || pokemon2.getType().equals("Kusa")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Dark")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Kusa":
                if(pokemon2.getType().equals("Jimen") || pokemon2.getType().equals("Mizu")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Jimen")|| pokemon2.getType().equals("Mizu")|| pokemon2.getType().equals("Kusa")|| pokemon2.getType().equals("Denki")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Kakutou":
                if(pokemon2.getType().equals("Normal")|| pokemon2.getType().equals("Hagane") || pokemon2.getType().equals("Koori")|| pokemon2.getType().equals("Dark")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Dark")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Denki":
                if(pokemon2.getType().equals("Hikou") || pokemon2.getType().equals("Mizu")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Hikou") || pokemon2.getType().equals("Hagane")|| pokemon2.getType().equals("Denki")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Hagane":
                if(pokemon2.getType().equals("koori")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Normal") || pokemon2.getType().equals("Hikou")|| pokemon2.getType().equals("Hagane")|| pokemon2.getType().equals("Kusa")|| pokemon2.getType().equals("Koori")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Normal":
                if(pokemon2.getType().equals("")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Normal") || pokemon2.getType().equals("Hikou")|| pokemon2.getType().equals("Hagane")|| pokemon2.getType().equals("Kusa")|| pokemon2.getType().equals("Koori")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Ghost":
                if(pokemon2.getType().equals("Ghost")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Normal") || pokemon2.getType().equals("Kakutou")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
            case "Koori":
                if(pokemon2.getType().equals("Hikou") || pokemon2.getType().equals("Jimen") || pokemon2.getType().equals("Kusa")){
                    pokemon1.setAttack(pokemon1.getAttack()*2);
                }
                if(pokemon2.getType().equals("Koori")){
                    pokemon1.setDefense(pokemon1.getDefense()*2);
                }
                break;
    }
}
}