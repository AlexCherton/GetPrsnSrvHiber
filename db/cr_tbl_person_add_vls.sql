CREATE TABLE public.person
(
    id          serial,
    first_name  character varying(50) NOT NULL,
    last_name   character varying(50) NOT NULL,
    age         integer               NOT NULL,
    language_id integer               NOT NULL,
    CONSTRAINT person_id_pk PRIMARY KEY (id)
);

insert into person (first_name, last_name, age, language_id )
values ('Иван', 'Петров', 23, 1);
insert into person (first_name, last_name, age, language_id )
values ('Иван', 'Петров', 23, 2);

CREATE TABLE public.language
(
    id         serial,
    name character varying(50) NOT NULL,
    CONSTRAINT language_id_pk PRIMARY KEY (id)
);

insert into language (name)
values ('Java');
insert into language (name)
values ('JavaScript');

select * from person;

select * from language;