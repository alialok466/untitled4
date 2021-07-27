package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon(new Weapon("Метательный", "Лук"));
        System.out.println("Boss жизнь: " + boss.getHealth() + ", Boss урон: " + boss.getDamage());

    }
}
