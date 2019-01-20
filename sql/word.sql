drop database if exists db_word;
create database db_word;

drop table if exists db_word.programming_words;
create table db_word.programming_words (
  id      int auto_increment primary key,
  english varchar(191) unique ,
  chinese varchar(255)
);

LOAD DATA LOCAL INFILE 'D:/IdeaProjects/JavaSE-0110/word.csv'
INTO TABLE db_word.programming_words
FIELDS TERMINATED BY ','
(english, chinese)
set id = null;

select *
from db_word.programming_words
order by english;
