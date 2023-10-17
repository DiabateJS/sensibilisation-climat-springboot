insert into ASC_QUIZ values (1, 'QZ001','Quiz Niveau 1','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !','Ce quiz niveau débutant permet d évaluer votre connaissance du changement climatique.');
insert into ASC_QUIZ values (2, 'QZ002','Quiz Niveau Intermédiaire','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !','Ce quiz niveau intermédiaire monte d un cran sur le changement climatique.');

-- Quiz 1
insert into ASC_QUESTION values (1, 'Heureusement, le phénomène naturel de l effet de serre conserve dans l atmosphère une partie de la chaleur du soleil !', 1, 'A' , 'Quelle serait la température de la Terre sans atmosphère ?');
-- Options de la question
insert into ASC_OPTION values (1, 'A','+15 °C',1);
insert into ASC_OPTION values (2, 'B','0 °C',1);
insert into ASC_OPTION values (3, 'C','-50 °C',1);
insert into ASC_OPTION values (4, 'D','-18 °C',1);

insert into ASC_QUESTION values (2,'La vapeur d eau contribue pour 60 % à l effet de serre. Les émissions de ce gaz par l humanité à travers l industrie n ont cependant qu un effet limité car la durée de vie de la vapeur d eau est courte.',1,'B', 'Quel gaz a l effet de serre le plus puissant ?');
-- Options de la question
insert into ASC_OPTION values (5, 'A','CO2',2);
insert into ASC_OPTION values (6, 'B','Vapeur d eau',2);
insert into ASC_OPTION values (7, 'C','Méthane',2);
insert into ASC_OPTION values (8, 'D','Argon',2);

insert into ASC_QUESTION values (3, 'Plus de 50% est encore absorbé par l atmosphère.', 1,'A','Où va la majorité du CO2 émis par l Homme ?');
-- Options de la question
insert into ASC_OPTION values (9, 'A','Dans l atmosphère',3);
insert into ASC_OPTION values (10, 'B','Dans l océan',3);
insert into ASC_OPTION values (11, 'C','Méthane',3);

insert into ASC_QUESTION values (4, 'À quantité égale, produire une tomate en hiver génère aujourd hui plus de C02 que le transport des autres aliments...', 1,'B','En hiver et à quantité égale, lequel de ces aliments émet le plus de CO2 ?');
-- Options de la question
insert into ASC_OPTION values (12, 'A','Banane de Martinique',4);
insert into ASC_OPTION values (13, 'B','Tomates d Espagne',4);
insert into ASC_OPTION values (14, 'C','Le rutabaga picard',4);
insert into ASC_OPTION values (15, 'D','Le café colombien',4);

-- Quiz 2
insert into ASC_QUESTION values (5, 'Le GEIC a bien été crée en 1988', 1 ,'A','En quelle année le GEIC a été crée ?');
insert into ASC_OPTION values (16, 'A','1988',5);
insert into ASC_OPTION values (17, 'B','1999',5);
insert into ASC_OPTION values (18, 'C','2005',5);