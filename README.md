# java-ChatBot

atividade avaliativa do curso de Análise e Desenvolvimento de Sistemas

### by d-llirium

# Classes Obrigatórias 
As classes a seguir devem ser obrigatoriamente implementadas com todos os atributos e métodos descritos. Contudo, vocês podem e devem fazer outros atributos e métodos auxiliares para desenvolver o chatbot. 
## Classe abstrata Resposta
### Métodos: 
  - public abstract boolean verifica(String entrada) ¨ verifica se a entrada fornecida contém a palavra-chave esperado. 
  - public abstract String produz() ¨ produz a resposta do robô. 
## Classe Chatbot 
### Métodos: 
  - public adiciona(Resposta r) ¨ adiciona uma resposta ao conjunto de respostas que aquele robô "conhece". 
  - public processar(String texto) ¨ verifica qual das respostas que ele “conhece” se encaixa naquele texto, em ordem, e responde adequadamente. 
## Classe RespostaSimples 
Herda de Resposta 
### Métodos: 
  - O construtor recebe por parâmetro a palavra-chave que aciona a resposta, e um String que será o que o robô irá responder. 
## Classe RespostaAleatoria 
Herda de Resposta 
### Métodos: 
  - O construtor recebe por parâmetro a palavra-chave que aciona a resposta, e uma coleção de Strings contendo as possíveis respostas. Na hora de produzir uma resposta, esta deve ser sorteada a partir da coleção fornecida. 
## Classe RespostaData 
Herda de Resposta 
### Métodos: 
  – O construtor recebe por parâmetro a palavra-chave que aciona a resposta. Na hora de produzir uma resposta, deve retornar apenas a data atual. 
## Classe RespostaHora 
Herda de Resposta 
### Métodos: 
  - O construtor recebe por parâmetro a palavra-chave que aciona a resposta. Na hora de produzir uma resposta, deve retornar apenas a hora atual. 
## Classe RespostaContador 
Herda de Resposta 
### Métodos: 
  - O construtor recebe por parâmetro a palavra-chave que aciona a resposta. Na hora de produzir uma resposta, deve retornar quantas vezes aquela resposta foi acionada. 
