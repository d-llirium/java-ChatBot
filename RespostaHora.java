
package com.mycompany.chatbot_poo_projeton1;

//importa para devolver um horário específico do Local
import java.time.LocalDateTime;
//importa para formatar o hoorário
import java.time.format.DateTimeFormatter;
//Herda de Resposta
public class RespostaHora extends Resposta{
/*
    – O construtor recebe por parâmetro a palavra-chave que aciona a resposta. 
        Na hora de produzir uma resposta, deve retornar apenas a hora atual.
*/
    public RespostaHora(String palavraChave){
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
        //invoca a formatação
        DateTimeFormatter horario = DateTimeFormatter.ofPattern("HH:mm:ss");
        //atribui a hora formatada
        String hora = horario.format(LocalDateTime.now());
        //recebe a resposta caso a palavra chave seja invocada
        return hora;
    }
    @Override
    public String toString(){
        System.out.println("=============Resposta Hora=============");
        return "Resposta: " + produz() + "\nPalavra chave: "+ this.palavraChave;
    }
}
