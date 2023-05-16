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
ID_ENTRENADOR INTEGER(5) ,
ID_POKEMON INTEGER(5) AUTO_INCREMENT,
NUM_POKEDEX INTEGER(5),
MOTE VARCHAR(30),
SEXO VARCHAR(1) NOT NULL,
NIVEL INTEGER(3) NOT NULL,
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
ID_POKEMON INTEGER(5),
ID_MOVIMIENTO INTEGER(5),

CONSTRAINT POKE_MOVI_PK PRIMARY KEY POKE_MOVI(ID_POKEMON,ID_MOVIMIENTO),
CONSTRAINT POKE_MOVI_FK FOREIGN KEY (ID_POKEMON) REFERENCES POKEMON(ID_POKEMON),
CONSTRAINT POKE_MOVI2_FK FOREIGN KEY (ID_MOVIMIENTO) REFERENCES MOVIMIENTO (ID_MOVIMIENTO)

);

 


INSERT INTO pokedex VALUES(001,"BULBASUR","PLANTA","VENENO","resources/imgPokemon/Bulbasaur.png",null,16);

INSERT INTO pokedex VALUES (002,"Ivysaur","PLANTA","VENENO","resources/imgPokemon/Ivysaur.png",null,32);

INSERT INTO pokedex VALUES (003,"VENUSAUR","PLANTA","VENENO","resources/imgPokemon/Venusaur.png",null,null);

INSERT INTO pokedex VALUES (007,"SQUIRTLE","AGUA",null,"resources/imgPokemon/Squirtle.png",null,16);

INSERT INTO pokedex  VALUES (008,"WARTORTLE","AGUA",null,"resources/imgPokemon/Wartortle.png",null,36);

INSERT INTO pokedex VALUES (009,"BLASTOISE","AGUA",null,"resources/imgPokemon/Blastoise.png",null,null);

INSERT INTO pokedex VALUES(004,"CHARMANDER","FUEGO",null,"resources/imgPokemon/Charmander.png",null,16);

INSERT INTO pokedex VALUES (005,"CHARMELON","FUEGO",null,"resources/imgPokemon/Charmeleon.png",null,36);

INSERT INTO pokedex VALUES (006,"CHARIZARD","FUEGO","VOLADOR","resources/imgPokemon/Charizard.png",null,null);

INSERT INTO pokedex VALUES (010,"CATERPIE","BICHO",null,"resources/imgPokemon/Caterpie.png",null,7);

INSERT INTO entrenador VALUES (001,"Luis",10000,null);

INSERT INTO pokemon VALUES (001,001,001,null,'h',5,20,20,20,20,20,20,20,3,1);
INSERT INTO pokemon VALUES (001,002,004,null,'h',5,20,20,20,20,20,20,20,3,1);
INSERT INTO pokemon VALUES (001,003,007,null,'h',5,20,20,20,20,20,20,20,3,1);


INSERT INTO pokedex VALUES (011,"METAPOD","BICHO", null, "resources/imgPokemon/Metapod.png",null,10);

INSERT INTO pokedex VALUES (012,"BUTTERFREE","BICHO","VOLADOR","resources/imgPokemon/Butterfree.png",null,null);

INSERT INTO pokedex VALUES (013,"WEEDLE","BICHO","VENENO","resources/imgPokemon/Weedle.png",null,7);

INSERT INTO pokedex VALUES (014,"KAKUNA","BICHO","VENENO","resources/imgPokemon/Kakuna.png",null,10);

INSERT INTO pokedex VALUES (015,"BEEDRILL","BICHO","VENENO","resources/imgPokemon/Beedrill.png",null,null);

INSERT INTO pokedex VALUES (016,"PIDGEY","NORMAL","VOLADOR","resources/imgPokemon/Pidgey.png",null,18);

INSERT INTO pokedex VALUES (017,"PIDGEOTTO","NORMAL","VOLADOR","resources/imgPokemon/Pidgeotto.png",null,36);

INSERT INTO pokedex VALUES (018,"PIDGEOT","NORMAL","VOLADOR","resources/imgPokemon/Pidgeot.png".null,null);

INSERT INTO pokedex VALUES (019,"RATTATA","NORMAL",null,"resources/imgPokemon/Rattata.png",null,20);

INSERT INTO pokedex VALUES (020,"RATICATE","NORMAL",null,"resources/imgPokemon/Raticate.png",null,null);

INSERT INTO pokedex VALUES (021,"SPEAROW","NORMAL","VOLADOR","resources/imgPokemon/Spearow.png",null,20);

INSERT INTO pokedex VALUES (022,"FEAROW","NORMAL","VOLADOR","resources/imgPokemon/Fearow.png",null,null);

INSERT INTO pokedex VALUES (023,"EKANS","VENENO",null,"resources/imgPokemon/Ekans.png",null,22);

INSERT INTO pokedex VALUES (024,"ARBOK","VENENO",null,"resources/imgPokemon/Arbok.png",null,null);

INSERT INTO pokedex VALUES (025,"PIKACHU","ELECTRICO",null,"resources/imgPokemon/Pikachu.png",null,28);

INSERT INTO pokedex VALUES (026,"RAICHU","ELECTRICO",null,"resources/imgPokemon/Raichu.png",null,null);

INSERT INTO pokedex VALUES (027,"SANDSHREW","TIERRA",null,"resources/imgPokemon/Sandshrew.png",null,22);

INSERT INTO pokedex VALUES (028,"SANDSLASH","TIERRA",null,"resources/imgPokemon/Sandslash.png"null,null);

INSERT INTO pokedex VALUES (029,"NIDORAN ♀","VENENO",null,"resources/imgPokemon/Nidoran_hembra.png",null,16);

INSERT INTO pokedex VALUES (030,"NIDORINA","VENENO",null,"resources/imgPokemon/Nidorina.png",null,32);

INSERT INTO pokedex VALUES (031,"NIDOQUEEN","VENENO","TIERRA","resources/imgPokemon/Nidoqueen.png",null,null);

INSERT INTO pokedex VALUES (032,"NIDORAN ♂","VENENO",null,"resources/imgPokemon/Nidoran_macho.png",null,16);

INSERT INTO pokedex VALUES (033,"NIDORINO","VENENO",null,"resources/imgPokemon/Nidorino.png",null,32);

INSERT INTO pokedex VALUES (034,"NIDOKING","VENENO","TIERRA","resources/imgPokemon/Nidoking.png",null,null);

INSERT INTO pokedex VALUES (035,"CLEFAIRY","HADA",null,"resources/imgPokemon/Clefairy.png",null,4);

INSERT INTO pokedex VALUES (036,"CLEFABLE","HADA",null,"resources/imgPokemon/Clefable.png",null,null);

INSERT INTO pokedex VALUES (037,"VULPIX","FUEGO",null,"resources/imgPokemon/Vulpix.g",null,4);

INSERT INTO pokedex VALUES (038,"NINETALES","FUEGO",null,"resources/imgPokemon/Ninetales.png",null,null);

INSERT INTO pokedex VALUES (039,"JIGGLYPUFF","NORMAL","HADA","resources/imgPokemon/Jigglypuffg.png",null,null);

INSERT INTO pokedex VALUES (040,"WIGGLITUFF","NORMAL","HADA","resources/imgPokemon/Wigglituff.png",null,null);

INSERT INTO pokedex VALUES (041,"ZUBAT","VENENO","VOLADOR","resources/imgPokemon/Zubat.png",null,22);

INSERT INTO pokedex VALUES (042,"");

INSERT INTO pokedex VALUES (043,"");

INSERT INTO pokedex VALUES (044,"");

INSERT INTO pokedex VALUES (045,"");

INSERT INTO pokedex VALUES (046,"");

INSERT INTO pokedex VALUES (047,"");

INSERT INTO pokedex VALUES (048,"");

INSERT INTO pokedex VALUES (049,"");

INSERT INTO pokedex VALUES (050,"");