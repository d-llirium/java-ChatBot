package com.mycompany.chatbot_poo_projeton1;

import java.util.ArrayList;

public class Chatbot {
    //atributos
    public ArrayList<Resposta> respostas;
    public String texto;
    //construtor
    public Chatbot(){
        //array list para receber as respostas
        this.respostas = new ArrayList<>();
    }
    //métodos
    /*
    – public adiciona(Resposta r)
        * adiciona uma resposta ao conjunto de respostas que aquele robô "conhece".
    */
    public void adiciona(Resposta r){
        this.respostas.add(r);
    }
    /*
    – public processar(String texto)
        * verifica qual das respostas que ele “conhece” se encaixa naquele texto,
            em ordem, e responde adequadamente.
    */
    public String processar(String texto){
        //ignora as pontuações
        texto = texto.replaceAll("[^a-zA-Z ]", "");
        //string que vai receber a resposta 
        String re = "Desculpe, não entendi :(";
        //varre toda a array list respostas existentes
        for(int i=0; i < respostas.size(); i++){
            if (respostas.get(i).verifica(texto)){
                re = respostas.get(i).produz();
            }
        }
        return re;
    }
    //imprime as palavras chaves e as respostas possíveis até então
    public void imprimirRespostas() {
        //percorre toda a ArrayList respostas
        System.out.println(">>>>>>>>>PALAVRAS CHAVES E RESPOSTAS<<<<<<<<<<");
        for (int i=0; i < respostas.size(); i++) {
            //pega cada item e vai imprimindo
            Resposta resposta = respostas.get(i);
            System.out.println(resposta);
        }
    }
}
