CREATE DATABASE adlister_db;

USE adlister_db;

CREATE TABLE users(
    id int AUTO_INCREMENT,
    username CHAR(50),
    email CHAR(100),
    password CHAR(20),
    PRIMARY KEY(id)
);

CREATE TABLE ads(
    id int AUTO_INCREMENT,
    user_id long,
    title CHAR(100),
    description CHAR(200),
    PRIMARY KEY (id)
);