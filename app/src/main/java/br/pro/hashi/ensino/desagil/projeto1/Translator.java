package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;

// Não é permitido mudar nada nessa classe
// exceto o recheio dos três métodos.

public class Translator {
    private final Node root;
    private final HashMap<Character, Node> map;


    // Você deve mudar o recheio deste construtor,
    // de acordo com os requisitos não-funcionais.
    public Translator() {
        // traço --> direita
        // Ponto --> esquerda

        root = new Node('*');
        map = new HashMap<>();
        map.put('*', root);

        //--> Esquerda para direira
        //LVL 1

        Node nodeE = new Node('e');
        nodeE.setParent(root);
        Node nodeT = new Node('t');
        nodeT.setParent(root);
        root.setLeft(nodeE);
        root.setRight(nodeT);
        map.put('e', nodeE);
        map.put('t', nodeT);

        //LVL 2

        //esquerda

        Node nodeI = new Node('i');
        nodeI.setParent(nodeE);
        Node nodeA = new Node('a');
        nodeA.setParent(nodeE);
        nodeE.setLeft(nodeI);
        nodeE.setRight(nodeA);
        map.put('i', nodeI);
        map.put('a', nodeA);

        //direita

        Node nodeN = new Node('n');
        nodeN.setParent(nodeT);
        Node nodeM = new Node('m');
        nodeM.setParent(nodeT);
        nodeT.setLeft(nodeN);
        nodeT.setRight(nodeM);
        map.put('n', nodeN);
        map.put('m', nodeM);


        // LVL 3

        // esquerda

        //esquerda

        Node nodeS = new Node('s');
        nodeS.setParent(nodeI);
        Node nodeU = new Node('u');
        nodeU.setParent(nodeI);
        nodeI.setLeft(nodeS);
        nodeI.setRight(nodeU);
        map.put('s', nodeS);
        map.put('u', nodeU);

        //direita

        Node nodeR = new Node('r');
        nodeR.setParent(nodeA);
        Node nodeW = new Node('w');
        nodeW.setParent(nodeA);
        nodeA.setLeft(nodeR);
        nodeA.setRight(nodeW);
        map.put('r', nodeR);
        map.put('w', nodeW);

        // direita

        //esquerda

        Node nodeD = new Node('d');
        nodeD.setParent(nodeN);
        Node nodeK = new Node('k');
        nodeK.setParent(nodeN);
        nodeN.setLeft(nodeD);
        nodeN.setRight(nodeK);
        map.put('d', nodeD);
        map.put('k', nodeK);

        //direita

        Node nodeG = new Node('g');
        nodeG.setParent(nodeM);
        Node nodeO = new Node('o');
        nodeO.setParent(nodeM);
        nodeM.setLeft(nodeG);
        nodeM.setRight(nodeO);
        map.put('g', nodeG);
        map.put('o', nodeO);
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public char morseToChar(String code) {
        return ' ';
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public String charToMorse(char c) {
        return " ";
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public LinkedList<String> getCodes() {
        return new LinkedList<>();
    }

}
