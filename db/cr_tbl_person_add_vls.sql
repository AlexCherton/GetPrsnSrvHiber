CREATE TABLE public.person
(
    id         serial,
    first_name character varying(50) NOT NULL,
    last_name  character varying(50) NOT NULL,
    age        integer               NOT NULL,
    CONSTRAINT person_id_pk PRIMARY KEY (id)
);

insert into person (first_name, last_name, age)
values ('Иван', 'Петров', 23);

select * from person