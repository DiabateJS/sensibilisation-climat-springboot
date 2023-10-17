insert into ASC_QUIZ(code, libelle, description, info) value ('QZ001','Quiz Niveau 1','Ce quiz niveau débutant permet d évaluer votre connaissance du changement climatique.','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !');
insert into ASC_QUIZ(code, libelle, description, info) value ('QZ002','Quiz Niveau Intermédiaire','Ce quiz niveau intermédiaire monte d un cran sur le changement climatique.','Un jour passé à Pékin en respirant l air a les mêmes effets sur la santé que fumer 21 cigarettes !');

-- Quiz 1
insert into ASC_QUESTION(libelle, idResponse, explication, idQuiz) value ('Quelle serait la température de la Terre sans atmosphère ?','A','Heureusement, le phénomène naturel de l effet de serre conserve dans l atmosphère une partie de la chaleur du soleil !',(select id from ASC_QUIZ where code = 'QZ001'));
-- Options de la question
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('A','+15 °C',1);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('B','0 °C',1);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','-50 °C',1);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('D','-18 °C',1);

insert into ASC_QUESTION(libelle, idResponse, explication, idQuiz) value ('Quel gaz a l effet de serre le plus puissant ?','B','La vapeur d eau contribue pour 60 % à l effet de serre. Les émissions de ce gaz par l humanité à travers l industrie n ont cependant qu un effet limité car la durée de vie de la vapeur d eau est courte.',(select id from ASC_QUIZ where code = 'QZ001'));
-- Options de la question
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('A','CO2',2);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('B','Vapeur d eau',2);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','Méthane',2);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('D','Argon',2);

insert into ASC_QUESTION(libelle, idResponse, explication, idQuiz) value ('Où va la majorité du CO2 émis par l Homme ?','A','Plus de 50% est encore absorbé par l atmosphère.',(select id from ASC_QUIZ where code = 'QZ001'));
-- Options de la question
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('A','Dans l atmosphère',3);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('B','Dans l océan',3);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','Méthane',3);

insert into ASC_QUESTION(libelle, idResponse, explication, idQuiz) value ('En hiver et à quantité égale, lequel de ces aliments émet le plus de CO2 ?','B','À quantité égale, produire une tomate en hiver génère aujourd hui plus de C02 que le transport des autres aliments...',(select id from ASC_QUIZ where code = 'QZ001'));
-- Options de la question
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('A','Banane de Martinique',4);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('B','Tomates d Espagne',4);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','Le rutabaga picard',4);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','Le café colombien',4);

-- Quiz 2
insert into ASC_QUESTION(libelle, idResponse, explication, idQuiz) value ('En quelle année le GEIC a été crée ?','A','Le GEIC a bien été crée en 1988',(select id from ASC_QUIZ where code = 'QZ002'));
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('A','1988',5);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('B','1999',5);
insert into ASC_OPTION(idOption, valeur, libelle, idQuestion) value ('C','2005',5);