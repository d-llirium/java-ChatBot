package com.mycompany.chatbot_poo_projeton1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot bot = new Chatbot();
        //>>>>>>>>>>UPCAST<<<<<<<<<<<<<<<<<<<
        // criando as respostas com as palavras chaves sem caracterteres especiais
        Resposta rp1 = new RespostaSimples ("nome","Meus amigos me chamam de AnhembiBot.");
        Resposta rp2 = new RespostaSimples ("chama","Meus amigos me chamam de AnhembiBot.");
        Resposta rp3 = new RespostaSimples ("ajudar","No que você precisa de ajuda?");
        Resposta rp4 = new RespostaSimples ("financeiro","Para resolver problemas do financeiro, acesse o portal sou.anhembi no menu superior 'financeiro'.");
        Resposta rp5 = new RespostaSimples ("solicitao","Para solicitar documentos, acesse o menu superior 'solicitações' no portal sou.anhembi.");
        Resposta rp6 = new RespostaSimples ("curso","Para obter informações sobre o seu curso procure o seu centro acadêmico.");
        Resposta rp7 = new RespostaSimples ("histrico","Para acessar o seu histórico escolar acesse o menu superior 'hirstórico' no portal sou.anhembi.");
        Resposta rp8 = new RespostaSimples ("material","Para acessar o material do seu curso acesse o portal do blackboard.");
        Resposta rp9 = new RespostaSimples ("calendrio","Para acessar o calendário acadêmico acesse o portal sou.anhembi no menu superior calendário e legislação.");
        Resposta rp10 = new RespostaData ("dia");
        Resposta rp11 = new RespostaData ("data");
        Resposta rp12 = new RespostaHora ("hora");
        Resposta rp13 = new RespostaHora ("horas");
        Resposta rp14 = new RespostaContador ("conta");
        Resposta rp15 = new RespostaContador ("soma");
        // criando as piadas
        ArrayList <String> piadas = new ArrayList < >();
        piadas.add("Qual é o peixe baterista? A truta!");
        piadas.add("Qual é o peixe que cai do céu? Atum!");
        piadas.add("Qual é  animal que não vale mais nada? O javali!");
        piadas.add("Por que o pinheiro não se perde na floresta? Porque ele tem uma pinha!");
        piadas.add("Qual é o contrário de volátil? Vem cá sobrinho!");
        piadas.add("Qual é a tecla preferida do astronauta? O espaço!");
        Resposta rp16 = new RespostaAleatoria ("piada", piadas);
        // criando as curiosidades
        ArrayList <String> curiosidades = new ArrayList < >();
        curiosidades.add("A cada minuto, cerca de 72 horas de conteúdo são enviadas ao site de vídeos Youtube.");
        curiosidades.add("Estima-se que, a cada ano, o monte Everest cresça 4 milímetros.");
        curiosidades.add("O cérebro humano é formado por, aproximadamente, 75% de água.");
        curiosidades.add("O cachorro-quente é uma invenção alemã do século XV.");
        curiosidades.add("A maioria das vacas não consegue descer escadas.");
        curiosidades.add("Estima-se que 4% da população mundial seja canhota.");
        curiosidades.add("A parte mais profunda do oceano chega a 11 mil metros.");
        curiosidades.add("Estima-se que o Universo conte com mais de 10 bilhões de galáxias.");
        curiosidades.add("O recorde de voo de uma galinha é de 13 segundos.");
        Resposta rp17 = new RespostaAleatoria ("curiosidade", curiosidades);
        //criando os trava-línguas
        ArrayList <String> travaLinguas = new ArrayList < >();
        travaLinguas.add("Num ninho de mafagafos há sete mafagafinhos. Quando a mafagafa gafa, gafam os sete mafagafinhos.");
        travaLinguas.add("Trazei três pratos de trigo para três tigres tristes comerem.");
        travaLinguas.add("A aranha arranha a rã. A rã arranha a aranha. Nem a aranha arranha a rã. Nem a rã arranha a aranha.");
        travaLinguas.add("O tempo perguntou ao tempo quanto tempo o tempo tem, o tempo respondeu ao tempo que o tempo tem o tempo que o tempo tem.");
        travaLinguas.add("Se percebeste, percebeste. Se não percebeste, faz que percebeste para que eu perceba que tu percebeste. Percebeste?");
        travaLinguas.add("O Rato roeu a rica roupa do rei de Roma! A rainha raivosa rasgou o resto e depois resolveu remendar!");
        travaLinguas.add("Em rápido rapto, um rápido rato raptou três ratos sem deixar rastros.");
        travaLinguas.add("O sabiá não sabia que o sábio sabia que o sabiá não sabia assobiar.");
        travaLinguas.add("Olha o sapo dentro do saco. O saco com o sapo dentro. O sapo batendo papo e o papo soltando o vento.");
        travaLinguas.add("A Iara agarra e amarra a rara arara de Araraquara.");
        Resposta rp18 = new RespostaAleatoria ("travalngua", travaLinguas);
        // adicionando as respostas ao chatbot
        bot.adiciona(rp1);
        bot.adiciona(rp2);
        bot.adiciona(rp3);
        bot.adiciona(rp4);
        bot.adiciona(rp5);
        bot.adiciona(rp6);
        bot.adiciona(rp7);
        bot.adiciona(rp8);
        bot.adiciona(rp9);
        bot.adiciona(rp10);
        bot.adiciona(rp11);
        bot.adiciona(rp12);
        bot.adiciona(rp13);
        bot.adiciona(rp14);
        bot.adiciona(rp15);
        bot.adiciona(rp16);
        bot.adiciona(rp17);
        bot.adiciona(rp18);
        System.out.println("------------------------------------");
        System.out.println("Iniciando o chatbot");
        System.out.println("------------------------------------");
        Scanner entrada = new Scanner (System.in);
        String texto;
        bot.imprimirRespostas();
        //loop infinito para ficar lendo as perguntas do usuario
        while(true){
            System.out.print(">");
            texto = entrada.nextLine();
            System.out.println(bot.processar(texto));
        }
        
    }
}
