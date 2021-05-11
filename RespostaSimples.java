package com.mycompany.chatbot_poo_projeton1;
//Herda de Resposta
public class RespostaSimples extends Resposta {
    //atributos
    private final String respostaDevolvida;
    //construtor
    /*
    – O construtor recebe por parâmetro a palavra-chave que aciona a resposta, e um String que será o
que o robô irá responder.
    */
    public RespostaSimples(String palavraChave, String respostaDevolvida){
        //invoca o construtor da classe abstrata
        super(palavraChave);
        //recebe a resposta caso a palavra chave seja invocada
        this.respostaDevolvida = respostaDevolvida;
    }
    //verifica se a entrada fornecida contém a palavra-chave esperada.
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
    //produz a resposta do robô.
    @Override
    public String produz() {
        return this.respostaDevolvida;
    }
    @Override
    public String toString(){
        System.out.println("===========Resposta Simples============");
        return "Resposta: " + this.respostaDevolvida + "\nPalavra chave:"+ this.palavraChave;
    }
}
