package main;

import Algoritmo.MiniMax;
import arvore.Nodo;
import arvore.Nodo.MaxOrMin;


public class Main {
    public static void main(String[] args) {
        
        // CRIA OS NODOS
        Nodo nodo1 = new Nodo("nodo1",MaxOrMin.max);
        
        Nodo nodo2 = new Nodo("nodo2",MaxOrMin.min);
        Nodo nodo3 = new Nodo("nodo3",MaxOrMin.min);
        
        Nodo nodo4 = new Nodo("nodo4",MaxOrMin.max);
        Nodo nodo5 = new Nodo("nodo5",MaxOrMin.max);
        Nodo nodo6 = new Nodo("nodo6",MaxOrMin.max);
        Nodo nodo7 = new Nodo("nodo7",MaxOrMin.max);
        
        Nodo nodo8 = new Nodo("nodo8",MaxOrMin.min);
        Nodo nodo9 = new Nodo("nodo9",MaxOrMin.min);
        Nodo nodo10 = new Nodo("nodo10",MaxOrMin.min);
        Nodo nodo11 = new Nodo("nodo11",MaxOrMin.min);
        Nodo nodo12 = new Nodo("nodo12",MaxOrMin.min);
        Nodo nodo13 = new Nodo("nodo13",MaxOrMin.min);
        Nodo nodo14 = new Nodo("nodo14",MaxOrMin.min);
        Nodo nodo15 = new Nodo("nodo15",MaxOrMin.min);
        
        Nodo nodo16 = new Nodo("nodo16",8f, MaxOrMin.max);
        Nodo nodo17 = new Nodo("nodo17",23f, MaxOrMin.max);
        Nodo nodo18 = new Nodo("nodo18",-47f, MaxOrMin.max);
        Nodo nodo19 = new Nodo("nodo19",28f, MaxOrMin.max);
        Nodo nodo20 = new Nodo("nodo20",-30f, MaxOrMin.max);
        Nodo nodo21 = new Nodo("nodo21",-37f, MaxOrMin.max);
        Nodo nodo22 = new Nodo("nodo22",3f, MaxOrMin.max);
        Nodo nodo23 = new Nodo("nodo23",-41f, MaxOrMin.max);
        Nodo nodo24 = new Nodo("nodo24",-19f, MaxOrMin.max);
        Nodo nodo25 = new Nodo("nodo25",4f, MaxOrMin.max);
        Nodo nodo26 = new Nodo("nodo26",-49f, MaxOrMin.max);
        Nodo nodo27 = new Nodo("nodo27",4f, MaxOrMin.max);
        Nodo nodo28 = new Nodo("nodo28",43f, MaxOrMin.max);
        Nodo nodo29 = new Nodo("nodo29",45f, MaxOrMin.max);
        Nodo nodo30 = new Nodo("nodo30",-26f, MaxOrMin.max);
        Nodo nodo31 = new Nodo("nodo31",-14f, MaxOrMin.max);
        
        // SETA OS FILHOS DOS NODOS
        nodo1.addFilho(nodo3);
        nodo1.addFilho(nodo2);
        
        nodo2.addFilho(nodo5);
        nodo2.addFilho(nodo4);
        
        nodo3.addFilho(nodo7);
        nodo3.addFilho(nodo6);
        
        nodo4.addFilho(nodo9);
        nodo4.addFilho(nodo8);
        
        nodo5.addFilho(nodo11);
        nodo5.addFilho(nodo10);
        
        nodo6.addFilho(nodo13);
        nodo6.addFilho(nodo12);
        
        nodo7.addFilho(nodo15);
        nodo7.addFilho(nodo14);
        
        nodo8.addFilho(nodo17);
        nodo8.addFilho(nodo16);
        
        nodo9.addFilho(nodo19);
        nodo9.addFilho(nodo18);
        
        nodo10.addFilho(nodo21);
        nodo10.addFilho(nodo20);
        
        nodo11.addFilho(nodo23);
        nodo11.addFilho(nodo22);
        
        nodo12.addFilho(nodo25);
        nodo12.addFilho(nodo24);
        
        nodo13.addFilho(nodo27);
        nodo13.addFilho(nodo26);
        
        nodo14.addFilho(nodo29);
        nodo14.addFilho(nodo28);
        
        nodo15.addFilho(nodo31);
        nodo15.addFilho(nodo30);
        
        MiniMax.bucarComPodas(nodo1);
        //MiniMax.bucar(nodo1);
        
        
    }
}
