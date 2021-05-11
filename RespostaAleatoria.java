
package com.mycompany.chatbot_poo_projeton1;

 // Herda de Resposta
import java.util.ArrayList;

public class RespostaAleatoria extends Resposta{
    private final ArrayList<String> respostasAleatorias = new ArrayList<>();
    private String resp;
    /*
        – O construtor recebe por parâmetro a palavra-chave que aciona a resposta, 
            e uma coleção de Strings contendo as possíveis respostas. 
    */
    public RespostaAleatoria(String palavraChave, ArrayList<String> respostasAleatorias){
        //invoca o construtor da classe abstrata
        super(palavraChave);
        //recebe as respostas alinhadas nas posições de cada alemneto das respostasAleatorias
        for(int i =0; i < respostasAleatorias.size(); i++){
            this.respostasAleatorias.add(respostasAleatorias.get(i));
        }
    }
    @Override
    public boolean verifica(String entrada) {
        boolean verifica = false;
        //as palavras digitadas separadas por espaço, vão cada uma entrar em uma posição do vetor entradaSeprada
        String[] entradaSeparada = entrada.split(" ");
        //procura a palavra chave dentro do vetor entradaSeparada
        for (String entradaSeparada1 : entradaSeparada) {
            //caso encontre a palavraChave é verdadeira
            if (entradaSeparada1.equals(this.palavraChave)) {
                verifica = true;
            }
        }
        return verifica;
    }
    //Na hora de produzir uma resposta, esta deve ser sorteada a partir da coleção fornecida.
    @Override
    public String produz() {
        //atribui ao i o sorteio de inteiros dentro pelo índice da ArrayList de respostas aleatórias
        int i = getRandomNumber(0,respostasAleatorias.size());
        //atribui ao resp a resposta aletória sorteada
        this.resp = respostasAleatorias.get(i);
        return this.resp;
    }
    //retorna o índice inteiro de forma aleatória
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    @Override
    public String toString(){
        System.out.println("===========Resposta Aleatória============");
        System.out.println("Respostas: ");
        for(int i =0; i < respostasAleatorias.size();i++){
                System.out.println("- "+respostasAleatorias.get(i));
            }
        return "Palavra chave: " + this.palavraChave;   
    }    
}
