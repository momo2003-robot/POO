# RENDU DU TP8 - JEU DE L'OIE

## fait par
ATTALAH MOHAMED

## DESCRIPTION DU TRAVAIL

**JEU DE L'OIE**

*Ce jeu est joué par au moins 2 joueurs, chaque joueur possède un pion situé sur la premiere case au début. A chaque tour le joueur lance deux dés et avance du nombre du case indiqué par les dés. Certaines cases ont des effets spéciaux : la case oie fait avancer du même nombre de case, la case hotel passe 2 tours, le labyrinthe envoie sur une case en arrière alors que le pont envoie sur une case en avant, la case mort renvoie au début, la prison et le puit bloquent un joueur indéfiniement tant qu'un autre joueur ne les libère pas en arrivant sur la même case.Dans notre implementation, l'option de jeu choisie, est de n'avoir qu'un seul joueur par case aucours du jeu : ce qui implique que lorsqu'un joueur arrive sur une case occupée, il echange de case avec le joueur de la case.Le premier a arriver sur la derniere gagne la partie.*



## INSTRUCTIONS, COMPILATIONS, JAVADOC, TESTS ET EXECUTION DU PROGRAMME

### INSTRUCTIONS

*Dans ce TP, on definit tout d'abord la variable d'environnement dans chacun de nos terminaux grace a la commande :*

 export CLASSPATH="src:classes"

### JAVADOC

*Par la suite pour generer la javadoc de nôtre code on le fait grâce a la commande :*

javadoc -sourcepath src -subpackages goose -d docs

*Pour Consulter la Javadoc ainsi faite, il faut ouvrir le fichier **docs/index.html***

### COMPILATION DU CODE

*Pour compiler les fichiers du code on effectue la commande :*

javac src/goose/GameMain.java -d classes





### CREATION JAR EXECUTABLE

*Pour la creation du jar Executable, on utilisela commandes:*

jar cvfe goose.jar goose.GameMain -C classes goose 

### EXECUTION DU PROGRAMME

*Pour executer le programme, il faut utiliser la commandes :*
java -jar rental.jar



# FIN

![ULille](traces/ULille.png)
