package com.mycompany.chatbot_poo_projeton1;
//Herda de Resposta
public class RespostaContador extends Resposta{
    private int cont;
    private String c;
    /*
        – O construtor recebe por parâmetro a palavra-chave que aciona a resposta. 
    */
    public RespostaContador(String palavraChave){
        //invoca o construtor da classe abstrata
        super(palavraChave);
        this.cont = 0;
    }

    @Override
    public boolean verifica(String entrada) {
        boolean verifica = false;
        //as palavras digitadas separadas por espaço, vão cada uma entrar em uma posição do vetor entradaSeprada
        String[] entradaSeparada = entrada.split(" ");
        //proicra a palavra chave dentro do vetor entradaSeparada
        for (String entradaSeparada1 : entradaSeparada) {
            //caso encontre a palavraChave é verdadeira
            if (entradaSeparada1.equals(this.palavraChave)) {
                verifica = true;
            }
        }
        return verifica;
    }

/*
Na hora de produzir
uma resposta, deve retornar quantas vezes aquela resposta foi acionada.
*/
    @Override
    public String produz() {
        //incrementa
        this.cont ++;
        //recebe a resposta caso a palavra chave seja invocada
        String conta = "Ok ! A conta atualmente está em " + cont;
        this.c = conta;
        return conta;
    }
    @Override
    public String toString(){
        System.out.println("============Resposta Contador===================");
        return "Resposta: " + this.c + "\nPalavra chave: "+ this.palavraChave;
    }
}
