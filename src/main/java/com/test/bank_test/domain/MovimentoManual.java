package com.test.bank_test.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "movimento_manual")
public class MovimentoManual implements Serializable {

  private static final long serialVersionUID = 1L;


  @Id
  @Column(name = "NUM_LANCAMENTO", nullable = false)
  private BigDecimal numLancamento;

  @ManyToOne
  @JoinColumn(name = "COD_COSIF", nullable = false)
  private ProdutoCosif produtoCosif;

  @ManyToOne
  @JoinColumn(name = "COD_PRODUTO", nullable = false)
  private Produto produto;

  @Column(name = "DAT_MES", nullable = false)
  private BigDecimal datMes;

  @Column(name = "DAT_ANO", nullable = false)
  private BigDecimal datAno;

  @Column(name = "DES_DESCRICAO", nullable = false)
  private String desDescricao;

  @Column(name = "DAT_MOVIMENTO", nullable = false)
  private Date datMovimento;

  @Column(name = "COD_USUARIO", nullable = false)
  private String codUsuario;

  @Column(name = "VAL_VALOR", nullable = false)
  private BigDecimal valValor;


  public BigDecimal getNumLancamento() {
    return numLancamento;
  }

  public void setNumLancamento(BigDecimal numLancamento) {
    this.numLancamento = numLancamento;
  }


  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public ProdutoCosif getProdutoCosif() {
    return produtoCosif;
  }

  public void setProdutoCosif(ProdutoCosif produtoCosif) {
    this.produtoCosif = produtoCosif;
  }

  public BigDecimal getDatMes() {
    return datMes;
  }

  public void setDatMes(BigDecimal datMes) {
    this.datMes = datMes;
  }

  public BigDecimal getDatAno() {
    return datAno;
  }

  public void setDatAno(BigDecimal datAno) {
    this.datAno = datAno;
  }

  public String getDesDescricao() {
    return desDescricao;
  }

  public void setDesDescricao(String desDescricao) {
    this.desDescricao = desDescricao;
  }

  public Date getDatMovimento() {
    return datMovimento;
  }

  public void setDatMovimento(Date datMovimento) {
    this.datMovimento = datMovimento;
  }

  public String getCodUsuario() {
    return codUsuario;
  }

  public void setCodUsuario(String codUsuario) {
    this.codUsuario = codUsuario;
  }

  public BigDecimal getValValor() {
    return valValor;
  }

  public void setValValor(BigDecimal valValor) {
    this.valValor = valValor;
  }
}
