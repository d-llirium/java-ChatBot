package com.mycompany.chatbot_poo_projeton1;
//formatar data
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//gerar data
import java.util.Date;
//Herda de Resposta
public class RespostaData extends Resposta{
    /*
        – O construtor recebe por parâmetro a palavra-chave que aciona a resposta. 
            Na hora de produzir uma resposta, deve retornar apenas a data atual.
    */
    public RespostaData(String palavraChave){
        //invoca o construtor da classe abstrata
        super(palavraChave);
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
    public String produz(){
        //formata a data
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //cria a data
        Date date = new Date();
        //bota na String e recebe a resposta caso a palavra chave seja invocada
        String data = dateFormat.format(date);
        return data;
    }
    @Override
    public String toString(){
        System.out.println("===============Resposta Data =============");
        return "Resposta: " + produz() + "\nPalavra chave: "+ this.palavraChave;
    }
}
