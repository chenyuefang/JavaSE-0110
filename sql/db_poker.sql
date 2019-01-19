drop database if exists db_poker;
create database db_poker;

drop table if exists db_poker.stat;
create table db_poker.stat (
  id       int auto_increment primary key
  comment 'id PK',
  computer varchar(255) not null
  comment 'computer',
  player   varchar(255) not null
  comment 'player',
  winner   varchar(255) comment 'winner'
)
  comment 'stat table';

select *
from db_poker.stat;
