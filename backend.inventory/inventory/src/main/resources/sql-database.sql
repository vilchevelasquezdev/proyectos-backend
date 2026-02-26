create database db_inventory_sp3;
CREATE TABLE db_inventory_sp3.category
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    `description` VARCHAR(255)          NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);