INSERT INTO PRODUTO (`COD_PRODUTO`, `DES_PRODUTO`)
VALUES ('001', 'DESC 001');
INSERT INTO PRODUTO (`COD_PRODUTO`, `DES_PRODUTO`)
VALUES ('002', 'DESC 002');
insert into PRODUTO_COSIF (COD_COSIF, COD_PRODUTO, COD_CLASSIFICACAO, STA_STATUS)
values ('PROD 001','001','TESTE','A');
insert into PRODUTO_COSIF (COD_COSIF, COD_PRODUTO, COD_CLASSIFICACAO, STA_STATUS)
values ('PROD 002','002','TESTE','A');
insert
into
    movimento_manual
(cod_usuario, dat_ano, dat_mes, des_descricao, cod_produto, cod_cosif, val_valor, num_lancamento)
values
    ('TESTE', '2021', '08', 'TESTE', '001', 'PROD 001', '150.50', '1');