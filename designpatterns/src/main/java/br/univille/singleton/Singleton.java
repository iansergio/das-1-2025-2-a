package br.univille.singleton;

// Singleton é LITERALMENTE um ender chest do Minecraft
public class Singleton {
    // Um atributo estático é carregado na memória antes de todo o resto
    private static Singleton instance;
    private String segredo;

    public String getSegredo() {
        return segredo;
    }

    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }

    private Singleton(){
        System.out.println("Construtor do Singleton");
    }

    public static Singleton getInstance(){
        System.out.println("GetInstance");
        if(instance == null) {
            System.out.println("New Singleton");
            instance = new Singleton();
        }
        return instance;
    }

}
