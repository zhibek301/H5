package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setDamage(20);
        System.out.println(boss.getDamage());


        Boss b1 = new Boss();
        b1.setDamage(20);
        b1.getDamage();
        System.out.println(b1.getDamage());

        b1.setAbility(25);
        b1.getAbility();

Hero h1 = new Hero(30,35,67);

Hero h2 = new Hero (29, 45, 37);
        System.out.println(h2);
	    }
}
