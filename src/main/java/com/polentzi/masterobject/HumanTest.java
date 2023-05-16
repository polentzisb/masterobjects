package com.polentzi.masterobject;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja = new Human("celda");
			Human samurai = new Human("pikachu");
			Human wizard = new Human("link");
			
			wizard.attack(ninja);
			samurai.attack(ninja);
			ninja.attack(samurai);
	}
}