package Books.HeadFirst.Strategy_1.FightGame.Heroes;

import Books.HeadFirst.Strategy_1.FightGame.Character;
import Books.HeadFirst.Strategy_1.FightGame.TypeWeapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
