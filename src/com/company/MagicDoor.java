package com.company;

public class MagicDoor {


    public Hero[] creation () {
    Hero[] heroes = new Hero[4];
    Hero warrior = new Hero(50,20, 25 );
    heroes[0]=warrior;
    Hero soldier = new Hero (50, 20, 25);
    heroes[1] = soldier;
    Hero spiderman = new Hero (50,20, 20);
    heroes[2] = spiderman;
    Hero batman = new Hero (50, 20, 25);
    heroes[3] = batman;




return heroes;
    }
}
