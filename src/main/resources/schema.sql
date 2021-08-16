create table if not exists "PRODUTO" (
    "COD_PRODUTO" char(4) not null,
    "DES_PRODUTO" varchar(30) null,
    "STA_STATUS" varchar(1) null
    );
create table if not exists "PRODUTO_COSIF" (
    "COD_COSIF" char(11) not null,
    "COD_PRODUTO" char(4) not null,
    "COD_CLASSIFICACAO" char(6) null,
    "STA_STATUS" char(1) null
    );
create index "fk_PRODUTO_COSIF_PRODUTO_idx" on "PRODUTO_COSIF"("COD_PRODUTO" asc);
create table if not exists "MOVIMENTO_MANUAL" (
    "NUM_LANCAMENTO" decimal(18) not null,
    "COD_COSIF" char(11) not null,
    "COD_PRODUTO" char(4) not null,
    "DAT_MES" decimal(2) not null,
    "DAT_ANO" decimal(4) not null,
    "DES_DESCRICAO" varchar(50) null,
    "DAT_MOVIMENTO" timestamp null,
    "COD_USUARIO" varchar(15) null,
    "VAL_VALOR" decimal(18, 2) null
    );
create index "fk_MOVIMENTO_MANUAL_PRODUTO_COSIF1_idx" on "MOVIMENTO_MANUAL"("COD_COSIF" asc, "COD_PRODUTO" asc);