package arvore;

import static java.lang.Float.NaN;
import java.util.ArrayList;

public class Nodo {
    
    public enum MaxOrMin {
        max,
        min
    }
    
    public enum Cor{
        branco,
        cinza,
        preto
    }
    
    private String nome;
    private Float value;
    private Nodo pai;
    private ArrayList<Nodo> filhos;
    private MaxOrMin maxOrMin;
    private Cor cor;

    //CONSTRUCTOR
    public Nodo() {
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(String nome) {
        this.nome = nome;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(String nome, Float value) {
        this.nome = nome;
        this.value = value;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(String nome, MaxOrMin maxOrMin) {
        this.nome = nome;
        this.maxOrMin = maxOrMin;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(String nome, Float value, MaxOrMin maxOrMin) {
        this.nome = nome;
        this.value = value;
        this.maxOrMin = maxOrMin;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(Float value, MaxOrMin maxOrMin) {
        this.value = value;
        this.maxOrMin = maxOrMin;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }

    public Nodo(MaxOrMin maxOrMin) {
        this.maxOrMin = maxOrMin;
        filhos = new ArrayList<>();
        value = new Float(NaN);
        cor = Cor.branco;
    }
    
    

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Nodo getPai() {
        return pai;
    }

    public void setPai(Nodo pai) {
        this.pai = pai;
    }

    public ArrayList<Nodo> getFilhos() {
        return filhos;
    }

    public void addFilho(Nodo filho) {
        this.filhos.add(filho);
    }

    public MaxOrMin getMaxOrMin() {
        return maxOrMin;
    }

    public void setMaxOrMin(MaxOrMin maxOrMin) {
        this.maxOrMin = maxOrMin;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    
}
