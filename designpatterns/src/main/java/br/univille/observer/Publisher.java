package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public Publisher() {
    }
}
