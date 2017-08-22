drop database if exists benzinska_crpka;
create database benzinska_crpka;
use benzinska_crpka;

create table benzinska_crpka(
sifra int primary key not null auto_increment,
naziv varchar(50) not null,
adresa varchar(50) not null,
oib char(11) not null,
email varchar(50) not null
);

create table djelatnik(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
oib char(11) not null,
iban char(21) not null,
email varchar(50) not null,
placa decimal(18,2) not null,
benzinska_crpka int not null,
nadradjeni int
);

create table gorivo(
sifra int not null primary key auto_increment,
vrsta varchar(50) not null,
prodajna_cijena decimal(18,2) not null,
kapacitet_spremnika decimal(18,2) not null
);

create table narudzba_cisterne(
vrijeme_narudzbe datetime not null,
vrijeme_isporuke datetime not null,
kolicina decimal(18,2) not null,
nabavna_cijena decimal(18,2) not null,
trosak decimal(18,2) not null,
benzinska_crpka int not null,
gorivo int not null,
primary key (benzinska_crpka, gorivo)
);

create table racun(
broj_racuna int not null primary key auto_increment,
nacin_placanja varchar(50) not null,
r1 int,
pdv decimal(18,2) not null,
benzinska_crpka int not null
);

create table tvrtka(
sifra int not null primary key auto_increment,
naziv_tvrtke varchar(50) not null,
oib char(11) not null,
vlasnik varchar(50) not null,
djelatnost varchar(50) not null
);

create table tocenje(
vrijeme datetime not null,
kolicina decimal(18,2) not null,
racun int not null,
gorivo int not null,
primary key(racun, gorivo)
);

alter table racun add foreign key (benzinska_crpka) references benzinska_crpka(sifra);
alter table tocenje add foreign key (gorivo) references gorivo(sifra);
alter table tocenje add foreign key (racun) references racun(broj_racuna);
alter table djelatnik add foreign key (nadradjeni) references djelatnik(sifra);
alter table racun add foreign key (r1) references tvrtka(sifra);
alter table djelatnik add foreign key (benzinska_crpka) references benzinska_crpka(sifra);
alter table narudzba_cisterne add foreign key (benzinska_crpka) references benzinska_crpka(sifra);
alter table narudzba_cisterne add foreign key (gorivo) references gorivo(sifra);

insert into benzinska_crpka (naziv, adresa, oib, email) values
('INA','Osijek,Vukovarska 306','27759560625','ina@ina.hr'),
('Tifon','Osijek,Vukovarska 49','59648537792','info@tifon.hr'),
('Crodux','Osijek,L.B.Mandica bb','27958863341','info@crodux-derivati.hr');

insert into djelatnik (ime, prezime, oib, iban, email, placa, benzinska_crpka, nadradjeni) values
('Marko','Maric','58779632591','HR1200009866124589635','marko.maric@gmail.com',4256.73,1,1),
('Pero','Peric','21158896453','HR7880000632955541963','pero.peric@gmail.com',3256.26,2,2),
('Davor','Ivic','57889651233','HR7562000456000365656','d.ivic@gmail.com',4189.12,3,3),
('Mario','Horvat','45229875612','HR4598756321954759639','m.horvat@gmail.com',2890.56,1,1),
('Darko','Lucic','58774596323','HR4550000009632545698','darko.lucic@gmail.com',3776.33,2,2),
('Zoran','Zoranic','15448963521','HR8541111000023633985','z.zoranic@gmail.com',3995.01,3,3);

insert into gorivo (vrsta, prodajna_cijena, kapacitet_spremnika) values
('Eurosuper95',9.46,25000),
('Eurosuper98',9.68,25000),
('Eurosuper100',9.92,25000),
('Eurodizel',8.61,25000),
('Autoplin',3.93,25000),
('Eurodizel_plavi',4.59,25000);





















