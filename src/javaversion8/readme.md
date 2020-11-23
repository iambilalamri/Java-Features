## Hibernate
Un outil open-source, mature, simple qui consiste à  mapper  les objets à la base de données relationnelle - décrivez quelles classes et propriétés du code mappent vers quelles tables et colonnes de la base de données -(mappage classe/table)-, puis utilisez une bibliothèque pour effectuer toutes les copies et traductions. Dans les cas généraux, ces bibliothèques sont décrites comme des   outils de mappage objet-relationnel (ORM). 
## JPA
En Java, l'API Java Persistence (JPA) décrit comment ces bibliothèques peuvent être implémentées et comment vous écririez votre code pour qu'elles soient facilement utilisées par elles.

## Expression Lambda

Les expressions Lambda Une expression lambda est une fonction anonyme : sa définition se fait sans déclaration explicite du type de retour, ni de
modificateurs d'accès ni de nom. C'est un raccourci syntaxique qui permet de définir une méthode directement à l'endroit où elle est utilisée.

## Interface fonctionnel

Functional Interface: Implementation utilisant une expression Lambda
C'est un interface qui contient une unique fonction abstraite cependant on peut ecrire d'autres fonctions avec son implementation en ajoutant dans 
la signature de ces methodes le mot clé "default".

## Method references

Check this link to cover this part: [method reference-Java8](https://www.javatpoint.com/java-8-method-reference)

## Stream API

C’est une séquence d’éléments sur laquelle on peut effectuer un groupe d’opérations de manière séquentielle ou parallèle.
<br/><br/>
*1. Sans utilisation de Stream*<br/><br/>
`Collections.sort(sellOrderList, (o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));List<String> products = new ArrayList<>();for (Order o : sellOrderList){products.add(o.getProduct());System.out.println(o.getProduct());}`
<br/>

*2. Avec utilisation de Stream*<br/><br/>
`List<String> products2 =  orderList.stream().filter(o-> o.getType()==OrderType.SELL).sorted(Comparator.comparing(Order::getPrice)).map(Order::getProduct).collect(toList());`


## Default methods

Les méthodes définies dans l'interface et marquées avec le mot clé "default" sont appelées méthodes par défaut. Ces méthodes sont des méthodes non abstraites (implementés).

## Optional class

Optional: permet d’encapsuler un objet dont la valeur peut être null.
Optional: une classe finale publique et est utilisé pour traiter NullPointerException dans l'application Java

## ForEach() method,

ForEach: Une methode qui permet de parcourir les données d'un tableau (array), c'est la boucle FOR.
<br/><br/>
`names.forEach(name -> { System.out.println(name);});`

## Parallel array sorting,

Une nouvelle fonctionnalité supplémentaire dans la classe Array qui est utilisée pour trier les éléments de tableau en parallèle<br/>
Check this link: [Parallel array sorting](https://www.javatpoint.com/java-8-parallel-array-sorting)

## Nashorn JavaScript Engine

Nashorn est un moteur JavaScript. Il est utilisé pour exécuter du code JavaScript de manière dynamique sur JVM (Java Virtual Machine). Java fournit un outil de ligne de commande jjs qui est utilisé pour exécuter du code JavaScript.

## Cycle de vie d'un Thread (5 états)
1. Etat New: avant l'appel de la methode start() et apres la creation une instance de la classe Thread.

2. Etat (Exécutable/Runnable): apres l'appel de la methode start, mais le planificateur de thread ne l'a pas sélectionné comme thread en cours d'exécution.

3. Etat Running: Le thread est en cours d'exécution si le planificateur de thread l'a sélectionné.

4. Etat Non-Runnable (bloqué): Il s'agit de l'état dans lequel le thread est toujours actif, mais n'est actuellement pas éligible pour s'exécuter.

5. Etat Terminated: Un thread est dans un état terminé ou mort lorsque sa méthode run () se termine.

## Garbage Collection

Il rend la mémoire Java plus efficace car le garbage collector supprime les objets non référencés de la mémoire du tas.<br/>
C'est une maniere de detruire les objects inutiles.

## Java Reflection

Reflection est une API qui permet d'examiner ou de modifier le comportement des méthodes, classes, interfaces lors de l'exécution <br/>
La réflexion peut être utilisée pour obtenir des informations sur :

1. Classe: getClass() est utilisée pour obtenir le nom de la classe à laquelle appartient un objet.

2. Constructeurs: getConstructors() est utilisée pour obtenir les constructeurs publics de la classe à laquelle appartient un objet.

3. Méthodes: getMethods() est utilisée pour obtenir les méthodes publiques de la classe à laquelle appartient un objet.

4. Attributs: getFields() est pour obtenir le nom des attributs publiques ou prives.
<br/><br/>

Check this link to understand [Java Reflection](https://www.journaldev.com/1789/java-reflection-example-tutorial)