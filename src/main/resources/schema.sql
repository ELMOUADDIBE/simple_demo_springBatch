drop table products if exists;
drop table orders if exists;

create table products
(
    id   bigint identity primary key,
    name varchar(255) not null,
    price double not null
);

CREATE TABLE orders
(
    order_id      BIGINT identity PRIMARY KEY,
    customer_name VARCHAR(100),
    amount DOUBLE
);
