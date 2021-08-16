package com.test.bank_test.infrastructure;

import com.test.bank_test.domain.MovimentoManual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;

public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, String>, JpaSpecificationExecutor<MovimentoManual> {

}