CREATE TABLE pokedex(
NUM_POKEDEX INTEGER(5),
nom_pokemon VARCHAR(20),
tipo1 VARCHAR (15),
tipo2 VARCHAR (15),
sprite VARCHAR (200),
sonido VARCHAR (200),
nivel_evol INTEGER(3),

CONSTRAINT POKEDEX_PK PRIMARY KEY pokedex (num_pokedex),

);


CREATE TABLE pokemon (
ID_ENTRENADOR INTEGER(5) AUTO_INCREMENT,
ID_POKEMON DECIMAL(5),
NUM_POKEDEX DECIMAL(5),
MOTE VARCHAR(30),
SEXO VARCHAR(1) NOT NULL,
NIVEL DECIMAL(3) NOT NULL,
VITALIDAD INTEGER(3) NOT NULL,
ATAQUE INTEGER(3) NOT NULL,
DEFENSA INTEGER(3),
ATA_ESPECIAL INTEGER(3) NOT NULL,
DEF_ESPECIAL INTEGER(3) NOT NULL,
VELOCIDAD INTEGER(3) NOT NULL,
ESTAMINA INTEGER(3) NOT NULL,
FERTILIDAD INTEGER(1) NOT NULL,
EQUIPO INTEGER (1) ,

CONSTRAINT POKEMON_PK PRIMARY KEY (ID_POKEMON),
CONSTRAINT POK_POK_FK FOREIGN KEY (NUM_POKEDEX) REFERENCES POKEDEX (NUM_POKEDEX),
CONSTRAINT POK_ENT_FK FOREIGN KEY (ID_ENTRENADOR) REFERENCES entrenador(ID_ENTRENADOR)

);

 

CREATE TABLE entrenador (
ID_ENTRENADOR INTEGER(5) AUTO_INCREMENT,
nom_entrenador VARCHAR(20),
POKEDOLAR DECIMAL (7),
PASSWORD VARCHAR(20),

CONSTRAINT ENTRENADOR_PK PRIMARY KEY ENTRENADOR (ID_ENTRENADOR)

);

 

CREATE TABLE mochila (
ID_ENTRENADOR INTEGER (5),
ID_OBJETO INTEGER (5),
CANT_OBJETOS INTEGER(3),

CONSTRAINT MOCHILA_PK PRIMARY KEY MOCHILA (ID_ENTRENADOR,ID_OBJETO,CANT_OBJETOS),
CONSTRAINT MOCHILA_FK FOREIGN KEY (ID_ENTRENADOR) REFERENCES ENTRENADOR(ID_ENTRENADOR)

);

 

 

CREATE TABLE objeto (
ID_OBJETO INTEGER (5),
NOMBRE_OBJETO VARCHAR(20),
PRECIO DECIMAL (5),
ATAQUE INTEGER (3),
DEFENSA INTEGER (3),
AT_ESPECIAL INTEGER (3),
DEF_ESPECIAL INTEGER (3),
ESTAMINA INTEGER (3),
VELOCIDAD INTEGER (3),

CONSTRAINT OBJETO_PK PRIMARY KEY OBJETO (ID_OBJETO)

);

 



CREATE TABLE movimiento(
ID_MOVIMIENTO INTEGER(5)AUTO_INCREMENT,
NOM_MOVIMIENTO VARCHAR(20),
NIVEL_APRENDIZAJE INTEGER(3),
POTENCIA INTEGER(3),
TIPO VARCHAR(10),
NUM_TURNO INTEGER(3),
ESTADO VARCHAR(10),
ATAQUE INTEGER(3),
DEFENSA INTEGER(3),
ATA_ESPECIAL INTEGER(3),
DEF_ESPECIAL INTEGER(3),
VELOCIDAD INTEGER(3),
VITALIDAD INTEGER(1),
TIPO_MOVIMIENTO VARCHAR(10),
CATEGORIA_MOVIMIENTO VARCHAR(10),

CONSTRAINT MOVIMIENTO_PK PRIMARY KEY MOVIMIENTO(ID_MOVIMIENTO)

);

 

 



CREATE TABLE POKE_MOVI (
ID_POKEMON DECIMAL(5),
ID_MOVIMIENTO DECIMAL(5),

CONSTRAINT POKE_MOVI_PK PRIMARY KEY POKE_MOVI(ID_POKEMON,ID_MOVIMIENTO),
CONSTRAINT POKE_MOVI_FK FOREIGN KEY (ID_POKEMON) REFERENCES POKEMON(ID_POKEMON),
CONSTRAINT POKE_MOVI2_FK FOREIGN KEY (ID_MOVIMIENTO) REFERENCES MOVIMIENTO (ID_MOVIMIENTO)

);

 


INSERT INTO pokedex VALUES(001,"BULBASUR","PLANTA","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/5/53/latest/20151123152943/Bulbasaur_oro.png?20151123152943",null,16);

INSERT INTO pokedex VALUES (002,"Ivysaur","PLANTA","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/2/27/latest/20151123193448/Ivysaur_oro.png?20151123193448",null,32);

INSERT INTO pokedex VALUES (003,"VENUSAUR","PLANTA","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/d/d8/latest/20151123231335/Venusaur_oro.png?20151123231335",null,null);

INSERT INTO pokedex VALUES (007,"SQUIRTLE","AGUA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/d/d5/latest/20151123230829/Squirtle_oro.png?20151123230829,"null,16);

INSERT INTO pokedex  VALUES (008,"WARTORTLE","AGUA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/1/13/latest/20151123231501/Wartortle_oro.png?20151123231501",null,36);

INSERT INTO pokedex VALUES (009,"BLASTOISE","AGUA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/b/b5/latest/20151123152822/Blastoise_oro.png?20151123152822",null,null);

INSERT INTO pokedex VALUES(004,"CHARMANDER","FUEGO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/1/1d/latest/20151123185955/Charmander_oro.png?20151123185955",null,16)

INSERT INTO pokedex VALUES (005,"CHARMELON","FUEGO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/f/f5/latest/20151123190014/Charmeleon_oro.png?20151123190014",null,36);

INSERT INTO pokedex VALUES (006,"CHARIZARD","FUEGO","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/e/e1/latest/20151123185850/Charizard_oro.png?20151123185850",null,null);

INSERT INTO pokedex VALUES (010,"CATERPIE","BICHO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/f/f0/latest/20151123185615/Caterpie_oro.png?20151123185615",null,7);

INSERT INTO entrenador VALUES (001,"Luis",10000,null);

INSERT INTO pokemon VALUES (001,001,001,null,'h',5,20,20,20,20,20,20,20,3,1);
INSERT INTO pokemon VALUES (001,002,004,null,'h',5,20,20,20,20,20,20,20,3,1);
INSERT INTO pokemon VALUES (001,003,007,null,'h',5,20,20,20,20,20,20,20,3,1);


INSERT INTO pokedex VALUES (011,"METAPOD","BICHO", null, "https://images.wikidexcdn.net/mwuploads/wikidex/7/7a/latest/20151123222704/Metapod_oro.png",null,10);

INSERT INTO pokedex VALUES (012,"BUTTERFREE","BICHO","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/3/3a/latest/20140110162927/Butterfree_V.png",null,null);

INSERT INTO pokedex VALUES (013,"WEEDLE","BICHO","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/f/f5/latest/20140111184319/Weedle_V.png",null,7);

INSERT INTO pokedex VALUES (014,"KAKUNA","BICHO","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/c/ca/latest/20140111143932/Kakuna_V.png",null,10);

INSERT INTO pokedex VALUES (015,"BEEDRILL","BICHO","VENENO","https://images.wikidexcdn.net/mwuploads/wikidex/3/3d/latest/20140110162835/Beedrill_V.png",null,null);

INSERT INTO pokedex VALUES (016,"PIDGEY","NORMAL","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/e/e1/latest/20151123225243/Pidgey_oro.png",null,18);

INSERT INTO pokedex VALUES (017,"PIDGEOTTO","NORMAL","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/6/6b/latest/20151123225227/Pidgeotto_oro.png",null,36);

INSERT INTO pokedex VALUES (018,"PIDGEOT","NORMAL","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/9/9f/latest/20151123225204/Pidgeot_oro.png".null,null);

INSERT INTO pokedex VALUES (019,"RATTATA","NORMAL",null,"https://images.wikidexcdn.net/mwuploads/wikidex/4/4f/latest/20151123225901/Rattata_oro.png",null,20);

INSERT INTO pokedex VALUES (020,"RATICATE","NORMAL",null,"https://images.wikidexcdn.net/mwuploads/wikidex/a/ad/latest/20151123225848/Raticate_oro.png",null,null);

INSERT INTO pokedex VALUES (021,"SPEAROW","NORMAL","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/d/d9/latest/20151123230729/Spearow_oro.png",null,20);

INSERT INTO pokedex VALUES (022,"FEAROW","NORMAL","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/0/0f/latest/20151123191413/Fearow_oro.png",null,null);

INSERT INTO pokedex VALUES (023,"EKANS","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/9/9f/latest/20151123191210/Ekans_oro.png",null,22);

INSERT INTO pokedex VALUES (024,"ARBOK","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/8/8e/latest/20151123150906/Arbok_oro.png",null,null);

INSERT INTO pokedex VALUES (025,"PIKACHU","ELECTRICO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/a/a4/latest/20151123225253/Pikachu_oro.png",null,28);

INSERT INTO pokedex VALUES (026,"RAICHU","ELECTRICO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/5/58/latest/20151123225813/Raichu_oro.png",null,null);

INSERT INTO pokedex VALUES (027,"SANDSHREW","TIERRA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/c/c4/latest/20151123230055/Sandshrew_oro.png",null,22);

INSERT INTO pokedex VALUES (028,"SANDSLASH","tierra",null,"https://images.wikidexcdn.net/mwuploads/wikidex/7/7d/latest/20151123230045/Sandslash_oro.png"null,null);

INSERT INTO pokedex VALUES (029,"NIDORAN ♀","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/1/12/latest/20151123222926/Nidoran_hembra_oro.png",null,16);

INSERT INTO pokedex VALUES (030,"NIDORINA","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/9/91/latest/20151123222944/Nidorina_oro.png",null,32);

INSERT INTO pokedex VALUES (031,"NIDOQUEEN","VENENO","TIERRA","https://images.wikidexcdn.net/mwuploads/wikidex/6/65/latest/20151123222914/Nidoqueen_oro.png",null,null);

INSERT INTO pokedex VALUES (032,"NIDORAN ♂","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/2/24/latest/20151123222936/Nidoran_macho_oro.png",null,16);

INSERT INTO pokedex VALUES (033,"NIDORINO","VENENO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/7/75/latest/20151123222953/Nidorino_oro.png",null,32);

INSERT INTO pokedex VALUES (034,"NIDOKING","VENENO","TIERRA","https://images.wikidexcdn.net/mwuploads/wikidex/a/a5/latest/20151123222906/Nidoking_oro.png",null,null);

INSERT INTO pokedex VALUES (035,"CLEFAIRY","HADA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/b/b3/latest/20151123190116/Clefairy_oro.png",null,4);

INSERT INTO pokedex VALUES (036,"CLEFABLE","HADA",null,"https://images.wikidexcdn.net/mwuploads/wikidex/a/ab/latest/20151123190106/Clefable_oro.png",null,null);

INSERT INTO pokedex VALUES (037,"VULPIX","FUEGO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/2/23/latest/20151123231509/Vulpix_oro.png",null,4);

INSERT INTO pokedex VALUES (038,"NINETALES","FUEGO",null,"https://images.wikidexcdn.net/mwuploads/wikidex/7/71/latest/20151123223013/Ninetales_oro.png",null,null);

INSERT INTO pokedex VALUES (039,"JIGGLYPUFF","NORMAL","HADA","https://images.wikidexcdn.net/mwuploads/wikidex/2/26/latest/20151123193510/Jigglypuff_oro.png",null,null);

INSERT INTO pokedex VALUES (040,"WIGGLITUFF","NORMAL","HADA","https://images.wikidexcdn.net/mwuploads/wikidex/4/4e/latest/20151123231533/Wigglytuff_oro.png",null,null);

INSERT INTO pokedex VALUES (041,"ZUBAT","VENENO","VOLADOR","https://images.wikidexcdn.net/mwuploads/wikidex/a/a5/latest/20151123231631/Zubat_oro.png");

INSERT INTO pokedex VALUES (042,"");

INSERT INTO pokedex VALUES (043,"");

INSERT INTO pokedex VALUES (044,"");

INSERT INTO pokedex VALUES (045,"");

INSERT INTO pokedex VALUES (046,"");

INSERT INTO pokedex VALUES (047,"");

INSERT INTO pokedex VALUES (048,"");

INSERT INTO pokedex VALUES (049,"");

INSERT INTO pokedex VALUES (050,"");