package endereco.models;

import endereco.enums.TipoEndereco;

public class Endereco {
  private Integer numero;

  private String complemento;

  private Integer cep;

  private TipoEndereco tipo;

  private Logradouro logradouro;

  private Bairro bairro;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public Integer getCep() {
    return cep;
  }

  public void setCep(Integer cep) {
    this.cep = cep;
  }

  public TipoEndereco getTipo() {
    return tipo;
  }

  public void setTipo(TipoEndereco tipo) {
    this.tipo = tipo;
  }

  public Logradouro getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(Logradouro logradouro) {
    this.logradouro = logradouro;
  }

  public Bairro getBairro() {
    return bairro;
  }

  public void setBairro(Bairro bairro) {
    this.bairro = bairro;
  }
  
}
