package endereco.models;

import endereco.enums.TipoLogradouro;

public class Logradouro {
  private String nome;

  private TipoLogradouro tipo;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoLogradouro getTipo() {
    return tipo;
  }

  public void setTipo(TipoLogradouro tipo) {
    this.tipo = tipo;
  }

  
}
