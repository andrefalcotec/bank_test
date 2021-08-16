package com.test.bank_test.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "produto_cosif")
public class ProdutoCosif implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "COD_COSIF", nullable = false)
  private String codCosif;

  @ManyToOne
  @JoinColumn(name = "COD_PRODUTO", nullable = false)
  private Produto produto;

  @Column(name = "COD_CLASSIFICACAO")
  private String codClassificacao;

  @Column(name = "STA_STATUS")
  private String staStatus;

  public String getCodCosif() {
    return codCosif;
  }

  public void setCodCosif(String codCosif) {
    this.codCosif = codCosif;
  }

  public Produto Produto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public String getCodClassificacao() {
    return codClassificacao;
  }

  public void setCodClassificacao(String codClassificacao) {
    this.codClassificacao = codClassificacao;
  }

  public String getStaStatus() {
    return staStatus;
  }

  public void setStaStatus(String staStatus) {
    this.staStatus = staStatus;
  }

}
