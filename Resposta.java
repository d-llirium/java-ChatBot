
package com.mycompany.chatbot_poo_projeton1;

public abstract class Resposta {
    public String palavraChave;
    //para ser chamado nas classes filhas
    public Resposta(String palavraChave){
        this.palavraChave = palavraChave;
    }
    //métodos
    /*
    – public abstract boolean verifica(String entrada)
        * verifica se a entrada fornecida contém a palavra-chave esperado.
    */
    public abstract boolean verifica(String entrada);
    /*
    – public abstract String produz()
        * produz a resposta do robô.
    */
    public abstract String produz();
}
