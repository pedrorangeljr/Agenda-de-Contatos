create database agendacontatos;
use agendacontatos;

create table usuario(

   id bigint not null auto_increment,
   login character varying(255),
   senha character varying(255),
   constraint user_pk primary key(id)
);

insert into usuario(login, senha) values("admin", "admin");

select * from usuario;

create table contatos(

   id bigint not null auto_increment,
   nome character varying(255),
   telefone character varying(255),
   email character varying(255),
   constraint user_pk primary key(id)
);

select * from contatos;