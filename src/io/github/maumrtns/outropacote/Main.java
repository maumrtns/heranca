package io.github.maumrtns.outropacote;

import io.github.maumrtns.heranca.Animal;
import io.github.maumrtns.heranca.Panda;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();


        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Roy");
        cachorro.setIdade(5);
        cachorro.latir();
    }
}
