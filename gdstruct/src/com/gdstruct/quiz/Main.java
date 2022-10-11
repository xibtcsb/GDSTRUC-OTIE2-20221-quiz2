package com.gdstruct.quiz;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Player heathcliff = new Player(1,"Heathcliff", 300);
        Player asuna = new Player(2,"Asuna",100);
        Player lethalbacon = new Player(3,"LethalBacon",80);
        Player hpdeskjet = new Player(4,"HPDeskjet",35);

        PlayerLinkedList playerLinkedList=new PlayerLinkedList();


        playerLinkedList.addToFront(heathcliff);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalbacon);
        playerLinkedList.addToFront(hpdeskjet);


        playerLinkedList.remove();
        playerLinkedList.printList();

    }
}
