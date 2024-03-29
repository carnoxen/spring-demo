DROP TABLE IF EXISTS member;

CREATE TABLE member(
    id int primary key auto_increment,
    username varchar not null,
    password varchar not null
);