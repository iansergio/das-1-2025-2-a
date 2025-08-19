package br.univille.singleton;

public class Singleton {
    // Um atributo estático é carregado na memória antes de todo o resto
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
