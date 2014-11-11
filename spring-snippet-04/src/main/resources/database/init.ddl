create database spring_snippets default character set utf8;
use spring_snippets;
DROP TABLE IF EXISTS t_user;
create table t_user(
  user_id INT auto_increment primary key,
  user_name varchar(20),
  credits int,
  password  varchar(20),
  last_visit datetime,
  last_ip varchar(32)
);

DROP TABLE IF EXISTS t_login_log;
create table t_login_log(
  id int auto_increment primary key,
  user_id int,
  ip varchar(32),
  login_time datetime
);

insert into t_user(user_name,password) values('admin','123456');