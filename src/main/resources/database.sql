create table currency
(
    id int auto_increment
        primary key,
    value varchar(5) null
);

create table info_language
(
    id int auto_increment
        primary key,
    language varchar(5) null
);

create table products
(
    id int auto_increment
        primary key,
    name varchar(25) null,
    info varchar(150) null,
    price decimal(10,2) null,
    date timestamp default CURRENT_TIMESTAMP null,
    date_of_modification timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table product_currencies
(
    product_id int not null,
    currency_id int not null,
        foreign key (product_id) references products (id),
        foreign key (currency_id) references currency (id)
);

create table product_language
(
    product_id int not null,
    language_id int not null,
        foreign key (product_id) references products (id),
        foreign key (language_id) references info_language (id)
);


