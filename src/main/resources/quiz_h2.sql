insert into ASC_QUIZ values (1, 'QZ001','Quiz Niveau 1','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !','Ce quiz niveau débutant permet d évaluer votre connaissance du changement climatique.');
insert into ASC_QUIZ values (2, 'QZ002','Quiz Niveau Intermédiaire','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !','Ce quiz niveau intermédiaire monte d un cran sur le changement climatique.');

-- Quiz 1
insert into ASC_QUESTION values (1, 'Heureusement, le phénomène naturel de l effet de serre conserve dans l atmosphère une partie de la chaleur du soleil !', 1, 'A' , 'Quelle serait la température de la Terre sans atmosphère ?');
-- Options de la question
insert into ASC_OPTION values (1, 'A',1,'+15 °C');
insert into ASC_OPTION values (2, 'B',1,'0 °C');
insert into ASC_OPTION values (3, 'C',1,'-50 °C');
insert into ASC_OPTION values (4, 'D',1,'-18 °C');

insert into ASC_QUESTION values (2,'La vapeur d eau contribue pour 60 % à l effet de serre. Les émissions de ce gaz par l humanité à travers l industrie n ont cependant qu un effet limité car la durée de vie de la vapeur d eau est courte.',1,'B', 'Quel gaz a l effet de serre le plus puissant ?');
-- Options de la question
insert into ASC_OPTION values (5, 'A',2,'CO2');
insert into ASC_OPTION values (6, 'B',2,'Vapeur d eau');
insert into ASC_OPTION values (7, 'C',2,'Méthane');
insert into ASC_OPTION values (8, 'D',2,'Argon');

insert into ASC_QUESTION values (3, 'Plus de 50% est encore absorbé par l atmosphère.', 1,'A','Où va la majorité du CO2 émis par l Homme ?');
-- Options de la question
insert into ASC_OPTION values (9, 'A',3,'Dans l atmosphère');
insert into ASC_OPTION values (10, 'B',3,'Dans l océan');
insert into ASC_OPTION values (11, 'C',3,'Méthane');

insert into ASC_QUESTION values (4, 'À quantité égale, produire une tomate en hiver génère aujourd hui plus de C02 que le transport des autres aliments...', 1,'B','En hiver et à quantité égale, lequel de ces aliments émet le plus de CO2 ?');
-- Options de la question
insert into ASC_OPTION values (12, 'A',4,'Banane de Martinique');
insert into ASC_OPTION values (13, 'B',4,'Tomates d Espagne');
insert into ASC_OPTION values (14, 'C',4,'Le rutabaga picard');
insert into ASC_OPTION values (15, 'D',4,'Le café colombien');

-- Quiz 2
insert into ASC_QUESTION values (5, 'Le GEIC a bien été crée en 1988', 2 ,'A','En quelle année le GEIC a été crée ?');
insert into ASC_OPTION values (16, 'A',5,'1988');
insert into ASC_OPTION values (17, 'B',5,'1999');
insert into ASC_OPTION values (18, 'C',5,'2005');