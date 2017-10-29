package Algoritmo;

import arvore.Nodo;
import arvore.Nodo.MaxOrMin;
import static java.lang.Float.NaN;
import java.util.ArrayList;
import java.util.LinkedList;

public class MiniMax {
    
    public static void bucar(Nodo raiz){
        
        System.out.println("\nBusca sem Podas\n");
        
        LinkedList<Nodo> pilha = new LinkedList<>();
        
        Nodo nodoAtual = raiz;
        do{
            System.out.println("Visitou o " + nodoAtual.getNome());
            if (nodoAtual.getValue().isNaN()){
                for (Nodo nodo : nodoAtual.getFilhos()){
                    nodo.setPai(nodoAtual);
                    pilha.addLast(nodo);
                }
            }else{
                Float value = nodoAtual.getValue();
                Nodo pai = nodoAtual.getPai();
                if (pai != null){
                    if (pai.getValue().isNaN()){
                        pai.setValue(value);
                        System.out.println("Setou valor para " + value + " o " + pai.getNome());
                    }else if (pai.getMaxOrMin() == (MaxOrMin.max)){
                        if (value > pai.getValue()){
                            pai.setValue(value);
                            System.out.println("Setou valor para " + value + " o " + pai.getNome());
                        }
                    }else if (pai.getMaxOrMin() == (MaxOrMin.min)){
                        if (value < pai.getValue()){
                            pai.setValue(value);
                            System.out.println("Setou valor para " + value + " o " + pai.getNome());
                        }
                    }
                    
                }
            }
            
            if (pilha.size() > 0){
                if (pilha.getLast().getValue().isNaN()){
                    nodoAtual = pilha.getLast();
                }else{
                    nodoAtual = pilha.removeLast();
                }
                
            }else{
                nodoAtual = null;
            }
        }while(nodoAtual != null);
      
        System.out.println("\nResultado: " + raiz.getValue() + "\n");
        imprimeValores(raiz);
        
    }
    
    public static void bucarComPodas(Nodo raiz){
        System.out.println("\nBusca com Podas\n");
        LinkedList<Nodo> pilha = new LinkedList<>();
        
        Nodo nodoAtual = raiz;
        
        do{
            System.out.println("Visitou o " + nodoAtual.getNome());
            if (nodoAtual.getValue().isNaN()){
                for (Nodo nodo : nodoAtual.getFilhos()){
                    nodo.setPai(nodoAtual);
                    pilha.addLast(nodo);
                }
            }else{
                Float value = nodoAtual.getValue();
                Nodo pai = nodoAtual.getPai();
                Nodo ancestral;
                if (pai != null){
                    if (pai.getValue().isNaN()){
                        pai.setValue(value);
                        System.out.println("Setou valor para " + value + " o " + pai.getNome());
                    }else if (pai.getMaxOrMin() == (MaxOrMin.max)){
                        if (value > pai.getValue()){
                            pai.setValue(value);
                            System.out.println("Setou valor para " + value + " o " + pai.getNome());
                        }
                    }else if (pai.getMaxOrMin() == (MaxOrMin.min)){
                        if (value < pai.getValue()){
                            pai.setValue(value);
                            System.out.println("Setou valor para " + value + " o " + pai.getNome());
                        }
                    }
                    ancestral = pai.getPai();
                    
                    while(ancestral != null){
                        
                        if (pai.getMaxOrMin() == MaxOrMin.max){
                            if (ancestral.getMaxOrMin() == MaxOrMin.min
                                    && ancestral.getValue() <= pai.getValue()){
                                
                                while (pilha.getLast() != pai){
                                    pilha.removeLast();
                                    System.out.println("Podou o " + pilha.getLast().getNome());
                                }
                                
                            }
                        }else {
                            if (ancestral.getMaxOrMin() == MaxOrMin.max
                                    && ancestral.getValue() >= pai.getValue()){
                                
                                while (pilha.getLast() != pai){
                                    pilha.removeLast();
                                    System.out.println("Podou o " + pilha.getLast().getNome());
                                }
                                
                            }
                        }                        
                        ancestral = ancestral.getPai();
                    }
                    
                }
            }
            
            if (pilha.size() > 0){
                if (pilha.getLast().getValue().isNaN()){
                    nodoAtual = pilha.getLast();
                }else{
                    nodoAtual = pilha.removeLast();
                }
                
            }else{
                nodoAtual = null;
            }
            
            
            
        }while(nodoAtual != null);
        
        //Imprime caminho percorrido
        /*for (Nodo nodo : caminhoPercorrido){
            System.out.println(nodo.getNome());
        }*/
        
        System.out.println("Resultado: " + raiz.getValue() + "\n");
        imprimeValores(raiz);
    }
    
    public static void imprimeValores (Nodo nodo){
        
        LinkedList<Nodo> nodos = new LinkedList<>();
        nodos.addFirst(nodo);
        
        while (nodos.size() > 0){
            Nodo nodoAtual = nodos.getLast();
            
            System.out.println(nodoAtual.getNome() + " -> " + nodoAtual.getValue());
            
            for (Nodo nodo1 : nodoAtual.getFilhos()){
                nodos.addFirst(nodo1);
            }
            nodos.removeLast();
        }
        
    }
    
}
