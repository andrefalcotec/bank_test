package com.test.bank_test.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "produto")
@Accessors(chain = true)
public class Produto implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "COD_PRODUTO", nullable = false, length = 4)
  private String codProduto;

  @Column(name = "DES_PRODUTO")
  private String desProduto;

  @Column(name = "STA_STATUS")
  private String staStatus;

}
