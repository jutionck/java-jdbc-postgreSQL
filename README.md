# java-jdbc-postgreSQL


```sql
CREATE DATABASE gold_pocket;

DROP TABLE IF EXISTS m_product;
CREATE TABLE m_product (
    id int4 NOT NULL,
    product_name varchar(100) COLLATE "pg_catalog"."default",
    price numeric
);

-- ----------------------------
-- Primary Key structure for table m_product
-- ----------------------------
ALTER TABLE m_product ADD CONSTRAINT product_pkey PRIMARY KEY (id);
```
