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

create table currency
(
    value varchar(5) not null
        primary key
);

create table info_language
(
    language varchar(5) not null
        primary key
);

create table products
(
    id int auto_increment
        primary key,
    name varchar(25) null,
    info varchar(150) null,
    language varchar(5) null,
    price decimal(10,2) null,
    currency varchar(5) null,
    date timestamp default CURRENT_TIMESTAMP null,
    date_of_modification timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    constraint products_ibfk_1
        foreign key (language) references info_language (language),
    constraint products_ibfk_2
        foreign key (currency) references currency (value)
);


