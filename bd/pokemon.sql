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

INSERT INTO pokedex VALUES (042,"GOLBAT","VENENO","VOLADOR","resources/imgPokemon/Golbat.png",null,40);

INSERT INTO pokedex VALUES (043,"ODDISH","PLANTA","VENENO","resources/imgPokemon/Oddish.png",null,21);

INSERT INTO pokedex VALUES (044,"GLOOM","PLANTA","VENENO","resources/imgPokemon/Gloom.png",null,null);

INSERT INTO pokedex VALUES (045,"VILEPLUME","PLANTA","VENENO","resources/imgPokemon/Vileplume.png",null,null);

INSERT INTO pokedex VALUES (046,"PARAS","BICHO","PLANTA","resources/imgPokemon/Paras.png",null,24);

INSERT INTO pokedex VALUES (047,"PARASECT","BICHO","PLANTA","resources/imgPokemon/Parasect.png",null,null);

INSERT INTO pokedex VALUES (048,"VENONAT","BICHO","VENENO",resources/imgPokemon/Venonat.png",null,31);

INSERT INTO pokedex VALUES (049,"VENOMOTH","BICHO","VENENO","resources/imgPokemon/Venomoth.png",null,null);

INSERT INTO pokedex VALUES (050,"DIGLETT","TIERRA",null."resources/imgPokemon/Diglett.png",null,26);

INSERT INTO pokedex VALUES (051,"DUGTRIO","TIERRA",null,"resources/imgPokemon/Dugtrio.png",null,null);

INSERT INTO pokedex VALUES (052,"MEOWTH","NOTMAL",null,"resources/imgPokemon/Meowth.png",null,28);

INSERT INTO pokedex VALUES (053,"PERSIAN","NORMAL",null,"resources/imgPokemon/Persian.png",null,null);

INSERT INTO pokedex VALUES (054,"PSYDUCK","AGUA",null,"resources/imgPokemon/Psyduck.png",null,33);

INSERT INTO pokedex VALUES (055,"GOLDUCK","AGUA",null,"resources/imgPokemon/Golduck.png",null,null);

INSERT INTO pokedex VALUES (056,"MANKEY","LUCHA",null,"resources/imgPokemon/Mankey.png",null,28);

INSERT INTO pokedex VALUES (057,"PRIMEAPE","LUCHA",null,"resources/imgPokemon/Primeape.png",null,35");

INSERT INTO pokedex VALUES (058,"GROWLITHE","FUEGO",null,"resources/imgPokemon/Growlithe.png",null,30);

INSERT INTO pokedex VALUES (059,"ARCANINE","FUEGO",null,"resources/imgPokemon/Arcaine.png",null,null);

INSERT INTO pokedex VALUES (060,"POLIWAG","AGUA",null,"resources/imgPokemon/Poliwag.png",null,25);

INSERT INTO pokedex VALUES (061,"POLIWHIRL","AGUA",null,"resources/imgPokemon/Poliwhirl.png",null,35);

INSERT INTO pokedex VALUES (062,"POLIWRATH","AGUA","LUCHA","resources/imgPokemon/Poliwrath.png",null,null);

INSERT INTO pokedex VALUES (063,"ABRA","PSIQUICO",null,"resources/imgPokemon/Abra.png",null,16);

INSERT INTO pokedex VALUES (064,"KADABRA","PSIQUICO",null,"resources/imgPokemon/Kadabra.png",null,35);

INSERT INTO pokedex VALUES (065,"ALAKAZAM","PSIQUICO",null,"resources/imgPokemon/Alakazam.png",null,50);

INSERT INTO pokedex VALUES (066,"MACHOP","LUCHA",null,"resources/imgPokemon/Machop.png",null,28);

INSERT INTO pokedex VALUES (067,"MACHOKE","LUCHA",null,"resources/imgPokemon/Machoke.png",null,30);

INSERT INTO pokedex VALUES (068,"MACHAMP","LUCHA",null,"resources/imgPokemon/Machamp.png",null,null);

INSERT INTO pokedex VALUES (069,"BELLSPROUT","PLANTA","VENENO","resources/imgPokemon/Bellsprout.png",null,21);

INSERT INTO pokedex VALUES (070,"WEEPINBELL","PLANTA","VENENO","resources/imgPokemon/Weepinbell.png",null,30);

INSERT INTO pokedex VALUES (071, "Victreebel", "PLANTA", "VENENO", "resources/imgPokemon/Victreebel.png", null, null);
INSERT INTO pokedex VALUES (072, "Tentacool", "AGUA", "VENENO", "resources/imgPokemon/Tentacool.png", null, 30);
INSERT INTO pokedex VALUES (073, "Tentacruel", "AGUA", "VENENO", "resources/imgPokemon/Tentacruel.png", null, null);
INSERT INTO pokedex VALUES (074, "Geodude", "ROCA", "TIERRA", "resources/imgPokemon/Geodude.png", null, 25);
INSERT INTO pokedex VALUES (075, "Graveler", "ROCA", "TIERRA", "resources/imgPokemon/Graveler.png", null, null);
INSERT INTO pokedex VALUES (076, "Golem", "ROCA", "TIERRA", "resources/imgPokemon/Golem.png", null, null);
INSERT INTO pokedex VALUES (077, "Ponyta", "FUEGO", null, "resources/imgPokemon/Ponyta.png", null, 40);
INSERT INTO pokedex VALUES (078, "Rapidash", "FUEGO", null, "resources/imgPokemon/Rapidash.png", null, null);
INSERT INTO pokedex VALUES (079, "Slowpoke", "AGUA", "PSÍQUICO", "resources/imgPokemon/Slowpoke.png", null, 37);
INSERT INTO pokedex VALUES (080, "Slowbro", "AGUA", "PSÍQUICO", "resources/imgPokemon/Slowbro.png", null, null);
INSERT INTO pokedex VALUES (081, "Magnemite", "ELÉCTRICO", "ACERO", "resources/imgPokemon/Magnemite.png", null, 30);
INSERT INTO pokedex VALUES (082, "Magneton", "ELÉCTRICO", "ACERO", "resources/imgPokemon/Magneton.png", null, null);
INSERT INTO pokedex VALUES (083, "Farfetch'd", "NORMAL", "VOLADOR", "resources/imgPokemon/Farfetchd.png", null, null);
INSERT INTO pokedex VALUES (084, "Doduo", "NORMAL", "VOLADOR", "resources/imgPokemon/Doduo.png", null, 31);
INSERT INTO pokedex VALUES (085, "Dodrio", "NORMAL", "VOLADOR", "resources/imgPokemon/Dodrio.png", null, null);
INSERT INTO pokedex VALUES (086, "Seel", "AGUA", null, "resources/imgPokemon/Seel.png", null, 34);
INSERT INTO pokedex VALUES (087, "Dewgong", "AGUA", "HIELO", "resources/imgPokemon/Dewgong.png", null, null);
INSERT INTO pokedex VALUES (088, "Grimer", "VENENO", null, "resources/imgPokemon/Grimer.png", null, 38);
INSERT INTO pokedex VALUES (089, "Muk", "VENENO", null, "resources/imgPokemon/Muk.png", null, null);
INSERT INTO pokedex VALUES (090, "Shellder", "AGUA", null, "resources/imgPokemon/Shellder.png", null, null);
INSERT INTO pokedex VALUES (091, "Cloyster", "AGUA", "HIELO", "resources/imgPokemon/Cloyster.png", null, null);
INSERT INTO pokedex VALUES (092, "Gastly", "FANTASMA", "VENENO", "resources/imgPokemon/Gastly.png", null, 25);
INSERT INTO pokedex VALUES (093, "Haunter", "FANTASMA", "VENENO", "resources/imgPokemon/Haunter.png", null, null);
INSERT INTO pokedex VALUES (094, "Gengar", "FANTASMA", "VENENO", "resources/imgPokemon/Gengar.png", null, null);
INSERT INTO pokedex VALUES (095, "Onix", "ROCA", "TIERRA", "resources/imgPokemon/Onix.png", null, null);
INSERT INTO pokedex VALUES (096, "Drowzee", "PSÍQUICO", null, "resources/imgPokemon/Drowzee.png", null, 26);
INSERT INTO pokedex VALUES (097, "Hypno", "PSÍQUICO", null, "resources/imgPokemon/Hypno.png", null, null);
INSERT INTO pokedex VALUES (098, "Krabby", "AGUA", null, "resources/imgPokemon/Krabby.png", null, 28);
INSERT INTO pokedex VALUES (099, "Kingler", "AGUA", null, "resources/imgPokemon/Kingler.png", null, null);
INSERT INTO pokedex VALUES (100, "Voltorb", "ELÉCTRICO", null, "resources/imgPokemon/Voltorb.png", null, 30);
INSERT INTO pokedex VALUES (101, "Electrode", "ELÉCTRICO", null, "resources/imgPokemon/Electrode.png", null, null);
INSERT INTO pokedex VALUES (102, "Exeggcute", "PLANTA", "PSÍQUICO", "resources/imgPokemon/Exeggcute.png", null, 26);
INSERT INTO pokedex VALUES (103, "Exeggutor", "PLANTA", "PSÍQUICO", "resources/imgPokemon/Exeggutor.png", null, null);
INSERT INTO pokedex VALUES (104, "Cubone", "TIERRA", null, "resources/imgPokemon/Cubone.png", null, 28);
INSERT INTO pokedex VALUES (105, "Marowak", "TIERRA", null, "resources/imgPokemon/Marowak.png", null, null);
INSERT INTO pokedex VALUES (106, "Hitmonlee", "LUCHA", null, "resources/imgPokemon/Hitmonlee.png", null, null);
INSERT INTO pokedex VALUES (107, "Hitmonchan", "LUCHA", null, "resources/imgPokemon/Hitmonchan.png", null, null);
INSERT INTO pokedex VALUES (108, "Lickitung", "NORMAL", null, "resources/imgPokemon/Lickitung.png", null, null);
INSERT INTO pokedex VALUES (109, "Koffing", "VENENO", null, "resources/imgPokemon/Koffing.png", null, 35);
INSERT INTO pokedex VALUES (110, "Weezing", "VENENO", null, "resources/imgPokemon/Weezing.png", null, null);
INSERT INTO pokedex VALUES (111, "Rhyhorn", "ROCA", "TIERRA", "resources/imgPokemon/Rhyhorn.png", null, 42);
INSERT INTO pokedex VALUES (112, "Rhydon", "ROCA", "TIERRA", "resources/imgPokemon/Rhydon.png", null, null);
INSERT INTO pokedex VALUES (113, "Chansey", "NORMAL", null, "resources/imgPokemon/Chansey.png", null, null);
INSERT INTO pokedex VALUES (114, "Tangela", "PLANTA", null, "resources/imgPokemon/Tangela.png", null, null);
INSERT INTO pokedex VALUES (115, "Kangaskhan", "NORMAL", null, "resources/imgPokemon/Kangaskhan.png", null, null);
INSERT INTO pokedex VALUES (116, "Horsea", "AGUA", null, "resources/imgPokemon/Horsea.png", null, 32);
INSERT INTO pokedex VALUES (117, "Seadra", "AGUA", null, "resources/imgPokemon/Seadra.png", null, null);
INSERT INTO pokedex VALUES (118, "Goldeen", "AGUA", null, "resources/imgPokemon/Goldeen.png", null, 33);
INSERT INTO pokedex VALUES (119, "Seaking", "AGUA", null, "resources/imgPokemon/Seaking.png", null, null);
INSERT INTO pokedex VALUES (120, "Staryu", "AGUA", null, "resources/imgPokemon/Staryu.png", null, null);
INSERT INTO pokedex VALUES (121, "Starmie", "AGUA", "PSÍQUICO", "resources/imgPokemon/Starmie.png", null, null);
INSERT INTO pokedex VALUES (122, "Mr. Mime", "PSÍQUICO", "HADA", "resources/imgPokemon/MrMime.png", null, null);
INSERT INTO pokedex VALUES (123, "Scyther", "BICHO", "VOLADOR", "resources/imgPokemon/Scyther.png", null, null);
INSERT INTO pokedex VALUES (124, "Jynx", "HIELO", "PSÍQUICO", "resources/imgPokemon/Jynx.png", null, null);
INSERT INTO pokedex VALUES (125, "Electabuzz", "ELÉCTRICO", null, "resources/imgPokemon/Electabuzz.png", null, null);
INSERT INTO pokedex VALUES (126, "Magmar", "FUEGO", null, "resources/imgPokemon/Magmar.png", null, null);
INSERT INTO pokedex VALUES (127, "Pinsir", "BICHO", null, "resources/imgPokemon/Pinsir.png", null, null);
INSERT INTO pokedex VALUES (128, "Tauros", "NORMAL", null, "resources/imgPokemon/Tauros.png", null, null);
INSERT INTO pokedex VALUES (129, "Magikarp", "AGUA", null, "resources/imgPokemon/Magikarp.png", null, 20);
INSERT INTO pokedex VALUES (130, "Gyarados", "AGUA", "VOLADOR", "resources/imgPokemon/Gyarados.png", null, null);
INSERT INTO pokedex VALUES (131, "Lapras", "AGUA", "HIELO", "resources/imgPokemon/Lapras.png", null, null);
INSERT INTO pokedex VALUES (132, "Ditto", "NORMAL", null, "resources/imgPokemon/Ditto.png", null, null);
INSERT INTO pokedex VALUES (133, "Eevee", "NORMAL", null, "resources/imgPokemon/Eevee.png", null, 999);
INSERT INTO pokedex VALUES (134, "Vaporeon", "AGUA", null, "resources/imgPokemon/Vaporeon.png", null, null);
INSERT INTO pokedex VALUES (135, "Jolteon", "ELÉCTRICO", null, "resources/imgPokemon/Jolteon.png", null, null);
INSERT INTO pokedex VALUES (136, "Flareon", "FUEGO", null, "resources/imgPokemon/Flareon.png", null, null);
INSERT INTO pokedex VALUES (137, "Porygon", "NORMAL", null, "resources/imgPokemon/Porygon.png", null, null);
INSERT INTO pokedex VALUES (138, "Omanyte", "ROCA", "AGUA", "resources/imgPokemon/Omanyte.png", null, 40);
INSERT INTO pokedex VALUES (139, "Omastar", "ROCA", "AGUA", "resources/imgPokemon/Omastar.png", null, null);
INSERT INTO pokedex VALUES (140, "Kabuto", "ROCA", "AGUA", "resources/imgPokemon/Kabuto.png", null, 40);
INSERT INTO pokedex VALUES (141, "Kabutops", "ROCA", "AGUA", "resources/imgPokemon/Kabutops.png", null, null);
INSERT INTO pokedex VALUES (142, "Aerodactyl", "ROCA", "VOLADOR", "resources/imgPokemon/Aerodactyl.png", null, null);
INSERT INTO pokedex VALUES (143, "Snorlax", "NORMAL", null, "resources/imgPokemon/Snorlax.png", null, null);
INSERT INTO pokedex VALUES (144, "Articuno", "HIELO", "VOLADOR", "resources/imgPokemon/Articuno.png", null, null);
INSERT INTO pokedex VALUES (145, "Zapdos", "ELÉCTRICO", "VOLADOR", "resources/imgPokemon/Zapdos.png", null, null);
INSERT INTO pokedex VALUES (146, "Moltres", "FUEGO", "VOLADOR", "resources/imgPokemon/Moltres.png", null, null);
INSERT INTO pokedex VALUES (147, "Dratini", "DRAGÓN", null, "resources/imgPokemon/Dratini.png", null, 30);
INSERT INTO pokedex VALUES (148, "Dragonair", "DRAGÓN", null, "resources/imgPokemon/Dragonair.png", null, 55);
INSERT INTO pokedex VALUES (149, "Dragonite", "DRAGÓN", "VOLADOR", "resources/imgPokemon/Dragonite.png", null, null);
INSERT INTO pokedex VALUES (150, "Mewtwo", "PSÍQUICO", null, "resources/imgPokemon/Mewtwo.png", null, null);
INSERT INTO pokedex VALUES (151, "Mew", "PSÍQUICO", null, "resources/imgPokemon/Mew.png", null, null);
INSERT INTO pokedex VALUES (250,"HO-OH","FUEGO","VOLADOR","resources/imgPokemon/HO-OH.png",null,null);