package io.github.maumrtns.outropacote;

import io.github.maumrtns.heranca.Animal;

public class Cachorro extends Animal {

    public Cachorro(int idade){
        super("Cachorro", idade);
    }

    public void latir(){
        imprimirDados();
    }
}
