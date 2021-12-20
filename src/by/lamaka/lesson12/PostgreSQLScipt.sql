create table person(
id bigserial primary key,
name character varying(30),
sex boolean,
date date);

drop table person;

create table hobby_type(
id bigserial primary key,
name character varying(30)
);

drop table hobby_type;

create table hobby(
id bigserial primary key,
name character varying(50),
type_id integer references hobby_type(id)
);

drop table hobby;

create table person_info(
person_id integer references person(id),
hobby_id integer references hobby(id)
);

drop table person_info;

insert into person (name,sex, date) 
values 
('Vasya',true,'1997-07-29'),
('Petya',true,'1993-01-30'),
('Katya',false,'2000-03-22'),
('Anya',false,'1991-12-01'),
('Kolya',true,'2002-01-01'),
('Sveta',false,'1997-05-06'),
('Dima',true,'1994-08-23'),
('Alina',false,'1992-07-29'),
('Alesha',true,'1987-02-03'),
('kolya',true,'1990-11-09');

select * from person;

insert into hobby_type (name)
values
('Active'),
('Calm');

select * from hobby_type;

insert into hobby (name, type_id)
values
('Football',1),
('Hockey',1),
('Painting',2),
('Reading',2),
('Basketball',1),
('Volleyball',1),
('Programming',2),
('Tennis',1),
('Photographing',2);

select * from hobby;

insert into person_info (person_id, hobby_id)
values
(1,1),
(1,2),
(1,4),
(2,1),
(2,7),
(3,7),
(5,3),
(6,1),
(6,3),
(7,3),
(7,9),
(10,6);

select * from person_info;

delete from person_info;

select * from person where date > '1993-01-01';

select sex, count(*) as sex_count from person group by sex;

select p.id,p."name",p.sex,h."name"
from person_info as pi
join person p on p.id = pi.person_id
join hobby h on h.id = pi.hobby_id;

select p."name"
from person p
join person_info pi on pi.person_id = p.id
group by p."name" having count(p."name")>1;

select p.id,p."name",p.sex,p."date", h."name",ht."name" 
from person p
join person_info pi on pi.person_id = p.id 
join hobby h on h.id  = pi.hobby_id
join hobby_type ht on h.type_id = ht.id
where ht."name" = 'Calm'
order by p.id;

select ht."name", count(ht."name") as count_hobby_type 
from hobby h
join hobby_type ht on h.type_id = ht.id
group by ht."name";

select h."name",ht."name" 
from hobby h
join hobby_type ht on h.type_id = ht.id;