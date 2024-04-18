# TP7 - RentalAgency

## Auteur

-Mohamed ATTALAH

## Objectifs

### objectifs atteints
Ce TP sur l'agence de location a consolidé mes connaissances en programmation orientée objet. L'utilisation de l'héritage a structuré les classes de véhicules et RentalAgency de manière réutilisable. Les interfaces aussi on a appliqué pour evité la répition en mettant les classes AndFilter et brandFilter et MaxFilter. Les HashMaps ont efficacement organisé les données en associant des identifiants uniques comme client et une valeur comme véhicule.Cette expérience a considérablement amélioré mes compétences en Java, offrant une approche pratique pour résoudre des problèmes complexes de gestion d'agence de location.
 

J'ai réussi.

### Difficultés recontrées

Pour ce tp j'ai pas eu des difficultées.

## Comment générer la documentation

* J'ouvre le dossier tp7 dans le terminal et j'execute cette  commande : 
* export CLASSPATH="src:classes" 
* ensuite celle la pour le dossier rental:
* javadoc src/rental/*.java -d docs
* ensuite celle la pour le dossier filter:
* javadoc src/rental/filter/*.java -d docs
* ensuite celle la pour le dossier vehicle:
* javadoc src/rental/vehicle/*.java -d docs
* ensuite celle la pour le dossier agency:
* javadoc src/rental/agency/*.java -d docs

## Comment compiler les classes du projet ?

* Tout d'abord une fois j'ouvre le tp7 terminal j'execute cette commande :export CLASSPATH="src:classes"

* ensuite pour compiler tout les classes j'execute cette commande: 

* javac src/rental/*.java -d classes


## Comment compiler les testes du projet ?

* Pour compiler tout les testes du dossier rental j'execute cette commande: 
* javac -classpath junit-console.jar:classes test/rental/*.java -d classes
* Pour compiler tout les testes du dossier agency j'execute cette commande: 
* javac -classpath junit-console.jar:classes test/rental/agency/*.java -d classes
* pour compiler le teste du dossier filter j'execute cette commande:
* javac -classpath junit-console.jar:classes test/rental/filter/*.java -d classes


## Comment executer les testes ?

* pour executer les testes on prends par example le teste RentalAgencyTest j'execute cette commande:
* java -jar junit-console.jar -classpath test:classes -select-class rental.RentalAgencyTest
* java -jar junit-console.jar -classpath test:classes -select-class rental.agency.FriendlyRentalAgencyTest
* java -jar junit-console.jar -classpath test:classes -select-class rental.agency.SuspiciousRentalAgencyTest
* java -jar junit-console.jar -classpath test:classes -select-class rental.filter.AndFilterTest
* java -jar junit-console.jar -classpath test:classes -select-class rental.filter.BrandFilterTest
* java -jar junit-console.jar -classpath test:classes -select-class rental.filter.MaxPriceFilterTest



## Comment tester l'exécution du programme ?

* une fois la compilation est faite:
 
* j'execute:
* java rental.MainAgency


## comment créer un fichier jar:

* jar cvfe rental.jar rental.MainAgency -C classes rental


## pour l'éxecuté:

* java -jar rental.jar








