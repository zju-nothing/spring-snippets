use spring_snippets;
DROP TABLE IF EXISTS user;
create table user(
  id INT auto_increment primary key,
  name varchar(20),
  age int
);

