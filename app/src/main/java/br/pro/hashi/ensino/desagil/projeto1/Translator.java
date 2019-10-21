package br.pro.hashi.ensino.desagil.projeto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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

        //Nivel 4

        //left

        //left

        //left
        Node nodeH = new Node('h');
        nodeH.setParent(nodeS);
        Node nodeV = new Node('v');
        nodeV.setParent(nodeS);
        nodeS.setLeft(nodeH);
        nodeS.setRight(nodeV);
        map.put('h', nodeH);
        map.put('v', nodeV);

        //right
        Node nodeF = new Node('f');
        nodeF.setParent(nodeU);
        Node nodeBlank1 = new Node(' ');
        nodeBlank1.setParent(nodeU);
        nodeU.setLeft(nodeF);
        nodeU.setRight(nodeBlank1);
        map.put('f', nodeF);

        // right

        //left
        Node nodeL = new Node('l');
        nodeL.setParent(nodeR);
        Node nodeBlank2 = new Node(' ');
        nodeBlank2.setParent(nodeR);
        nodeR.setLeft(nodeL);
        nodeR.setRight(nodeBlank2);
        map.put('l', nodeL);

        //right
        Node nodeP = new Node('p');
        nodeP.setParent(nodeW);
        Node nodeJ = new Node('j');
        nodeJ.setParent(nodeW);
        nodeW.setLeft(nodeP);
        nodeW.setRight(nodeJ);
        map.put('p', nodeP);
        map.put('j', nodeJ);


        //right

        //left

        //left
        Node nodeB = new Node('b');
        nodeB.setParent(nodeD);
        Node nodeX = new Node('x');
        nodeX.setParent(nodeD);
        nodeD.setLeft(nodeB);
        nodeD.setRight(nodeX);
        map.put('b', nodeB);
        map.put('x', nodeX);

        //right
        Node nodeC = new Node('c');
        nodeC.setParent(nodeK);
        Node nodeY = new Node('y');
        nodeY.setParent(nodeK);
        nodeK.setLeft(nodeC);
        //noinspection SuspiciousNameCombination
        nodeK.setRight(nodeY);
        map.put('c', nodeC);
        map.put('y', nodeY);

        // right

        //left
        Node nodeZ = new Node('z');
        nodeZ.setParent(nodeG);
        Node nodeQ = new Node('q');
        nodeQ.setParent(nodeG);
        nodeG.setLeft(nodeZ);
        nodeG.setRight(nodeQ);
        map.put('z', nodeZ);
        map.put('q', nodeQ);

        //right
        Node nodeBlank3 = new Node(' ');
        nodeBlank3.setParent(nodeO);
        Node nodeBlank4 = new Node(' ');
        nodeBlank4.setParent(nodeO);
        nodeO.setLeft(nodeBlank3);
        nodeO.setRight(nodeBlank4);

        //Nivel 5

        //left

        //left

        //left

        //left
        Node node5 = new Node('5');
        node5.setParent(nodeH);
        Node node4 = new Node('4');
        node4.setParent(nodeH);
        nodeH.setLeft(node5);
        nodeH.setRight(node4);
        map.put('5', node5);
        map.put('4', node4);

        //right
        Node nodeBlank5 = new Node(' ');
        nodeBlank5.setParent(nodeV);
        Node node3 = new Node('3');
        node3.setParent(nodeV);
        nodeV.setLeft(nodeBlank5);
        nodeV.setRight(node3);
        map.put('3', node3);

        // right

        //left
        Node nodeBlank6 = new Node(' ');
        nodeBlank6.setParent(nodeF);
        Node nodeBlank7 = new Node(' ');
        nodeBlank7.setParent(nodeF);
        nodeF.setLeft(nodeBlank6);
        nodeF.setRight(nodeBlank7);

        //right
        Node nodeBlank8 = new Node(' ');
        nodeBlank8.setParent(nodeBlank1);
        Node node2 = new Node('2');
        node2.setParent(nodeBlank1);
        nodeBlank1.setLeft(nodeBlank8);
        nodeBlank1.setRight(node2);
        map.put('2', node2);


        //right

        //left

        //left
        Node nodeBlank9 = new Node(' ');
        nodeBlank9.setParent(nodeL);
        Node nodeBlank10 = new Node(' ');
        nodeBlank10.setParent(nodeL);
        nodeL.setLeft(nodeBlank9);
        nodeL.setRight(nodeBlank10);

        //right
        Node nodePlus = new Node('+');
        nodePlus.setParent(nodeBlank2);
        Node nodeBlank11 = new Node(' ');
        nodeBlank11.setParent(nodeBlank2);
        nodeBlank2.setLeft(nodePlus);
        nodeBlank2.setRight(nodeBlank11);
        map.put('+', nodePlus);

        // right

        //left
        Node nodeBlank12 = new Node(' ');
        nodeBlank12.setParent(nodeP);
        Node nodeBlank13 = new Node(' ');
        nodeBlank13.setParent(nodeP);
        nodeP.setLeft(nodeBlank12);
        nodeP.setRight(nodeBlank13);

        //right
        Node nodeBlank14 = new Node(' ');
        nodeBlank14.setParent(nodeJ);
        Node node1 = new Node('1');
        node1.setParent(nodeJ);
        nodeJ.setLeft(nodeBlank14);
        nodeJ.setRight(node1);
        map.put('1', node1);

        //Right

        //left

        //left

        //left
        Node node6 = new Node('6');
        node6.setParent(nodeB);
        Node nodeEquals = new Node('=');
        nodeEquals.setParent(nodeB);
        nodeB.setLeft(node6);
        nodeB.setRight(nodeEquals);
        map.put('6', node6);
        map.put('=', nodeEquals);

        //right
        Node nodeSlash = new Node('/');
        nodeSlash.setParent(nodeX);
        Node nodeBlank15 = new Node(' ');
        nodeBlank15.setParent(nodeX);
        nodeX.setLeft(nodeSlash);
        nodeX.setRight(nodeBlank15);
        map.put('/', nodeSlash);

        // right

        //left
        Node nodeBlank16 = new Node(' ');
        nodeBlank16.setParent(nodeC);
        Node nodeBlank17 = new Node(' ');
        nodeBlank17.setParent(nodeC);
        nodeC.setLeft(nodeBlank16);
        nodeC.setRight(nodeBlank17);

        //right
        Node nodeBlank18 = new Node(' ');
        nodeBlank18.setParent(nodeY);
        Node nodeBlank19 = new Node(' ');
        nodeBlank19.setParent(nodeY);
        nodeY.setLeft(nodeBlank18);
        nodeY.setRight(nodeBlank19);


        //right

        //left

        //left
        Node node7 = new Node('7');
        node7.setParent(nodeZ);
        Node nodeBlank20 = new Node(' ');
        nodeBlank20.setParent(nodeZ);
        nodeZ.setLeft(node7);
        nodeZ.setRight(nodeBlank20);
        map.put('7', node7);


        //right
        Node nodeBlank21 = new Node(' ');
        nodeBlank21.setParent(nodeQ);
        Node nodeBlank22 = new Node(' ');
        nodeBlank22.setParent(nodeQ);
        nodeQ.setLeft(nodeBlank21);
        nodeQ.setRight(nodeBlank22);

        // right

        //left
        Node node8 = new Node('8');
        node8.setParent(nodeBlank3);
        Node nodeBlank23 = new Node(' ');
        nodeBlank23.setParent(nodeBlank3);
        nodeBlank3.setLeft(node8);
        nodeBlank3.setRight(nodeBlank23);
        map.put('8', node8);

        //right
        Node node9 = new Node('9');
        node9.setParent(nodeBlank4);
        Node node0 = new Node('0');
        node0.setParent(nodeBlank4);
        nodeBlank4.setLeft(node9);
        nodeBlank4.setRight(node0);
        map.put('9', node9);
        map.put('0', node0);
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public char morseToChar(String code) {

        Node atual = root;

        for(int i=0; i< code.length(); i++){
            
            char pontobarra = code.charAt(i);

            if (pontobarra == '.') {

                atual = atual.getLeft();

            }
            else if (pontobarra =='-'){

                atual = atual.getRight();
            }
        }

        if (atual != null){

            return atual.getValue();
        }
        else{

            return ' ';
        }
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public String charToMorse(char c) {
        Node atual = map.get(c);
        Node ultimo = map.get(c);
        String morse = "";

        while (atual != root) {

            atual = atual.getParent();

            if (atual.getLeft() == ultimo) {

                morse = '.' + morse;
            }
            else if (atual.getRight() == ultimo) {

                morse = '-' + morse;
            }

            ultimo = ultimo.getParent();
        }

        return morse;

    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public LinkedList<String> getCodes() {
        LinkedList<String> lista = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node no = queue.element();
            Node left = no.getLeft();
            Node right = no.getRight();

            if (left != null) {

                queue.add(left);
            }
            if (right != null) {

                queue.add(right);
            }
            if (no.getValue() != ' ' && no.getValue() != '*' && no.getValue() != '/' && no.getValue() != '+' && no.getValue() != '=') {

                lista.add(charToMorse(no.getValue()));

            }
            queue.remove();
        }
        return lista;
    }
    // Funções criadas para facilitar a implementação do dicionário
    public ArrayList<String> dictAlphaToMorse() {
        ArrayList<String> returnList = new ArrayList<>();

        for (Map.Entry<Character, Node> entry: map.entrySet()) {
            Character key = entry.getKey();
            String morse = this.charToMorse(key);
            returnList.add(key + " => " + morse);
        }

        return returnList;
    }

    public ArrayList<String> dictMorseToAlpha() {
        ArrayList<String> returnList = new ArrayList<>();

        for (String morse : this.getCodes()) {
            Character character = this.morseToChar(morse);
            returnList.add(morse + " => " + character);
        }

        return returnList;


    }
}
