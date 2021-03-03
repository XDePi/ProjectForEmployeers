create table if not exists products
(
    id int auto_increment
    primary key,
    name varchar(25) null,
    info varchar(150) null,
    price decimal(10,2) null,
    date timestamp default CURRENT_TIMESTAMP null,
    date_of_modification timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
    );

