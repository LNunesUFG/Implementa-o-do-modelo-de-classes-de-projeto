package endereco.models;

import java.util.Date;
import java.util.List;

public class PessoaFisica {
  private String nome;

  private String sexo;

  private Date dataNacimento;

  private List<Endereco> enderecos;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Date getDataNacimento() {
    return dataNacimento;
  }

  public void setDataNacimento(Date dataNacimento) {
    this.dataNacimento = dataNacimento;
  }

  public List<Endereco> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
  }
  
}
