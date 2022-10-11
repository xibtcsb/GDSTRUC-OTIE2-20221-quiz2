package com.gdstruct.quiz;

import java.lang.module.FindException;

public class PlayerLinkedList {
    private PlayerNode head;
    int size;
    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head=playerNode;
        PlayerNode number = head;
        int count = 0;
        while(number != null){
            count++;
            number = number.getNextPlayer();
        }
        size = count;
    }

    public void remove()
    {
        PlayerNode newNodeHead=head;
        newNodeHead=newNodeHead.getNextPlayer();
        head=newNodeHead;
        PlayerNode number = head;
        int count = 0;
        while(number != null){
            count++;
            number = number.getNextPlayer();
        }
        size = count;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD->");
        while (current!=null)
        {
            System.out.print(current);
            System.out.print("->");
            current=current.getNextPlayer();
            System.out.println(size);
        }
        System.out.println("null");
    }
    public void sizeCount(){

        PlayerNode current = head;

        size =0;

        do {
            size++;
            current = current.getNextPlayer();
        } while (current != null);

        System.out.println(size);


    }

}

