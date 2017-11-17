# create table
```
mysql -u root -p root
use test
create table t_test
(
   id                  bigint not null AUTO_INCREMENT comment '自增主键',
   value               text        comment '值',
   primary key (id)
);
```

