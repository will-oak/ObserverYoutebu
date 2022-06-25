package ObserverYoutebu.src.controller;

import java.util.ArrayList;
import java.util.List;

public class Inscrito implements IObservador {
  private String nome;
  private List<String> mensagens = new ArrayList<>();

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public void update(String mensagem) {
    this.mensagens.add(mensagem);

    imprimirNotificacao();
  }

  public void imprimirNotificacao() {
    System.out.println(this.getNome() + " - Notificações: \n" + this.mensagens.toString());
  }

}
