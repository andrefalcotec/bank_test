package com.test.bank_test.infrastructure;

import com.test.bank_test.domain.ProdutoCosif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, String>, JpaSpecificationExecutor<String> {

}