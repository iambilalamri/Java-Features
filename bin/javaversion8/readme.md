## Hibernate
Un outil open-source, mature, simple qui consiste �  mapper  les objets � la base de donn�es relationnelle - d�crivez quelles classes et propri�t�s du code mappent vers quelles tables et colonnes de la base de donn�es -(mappage classe/table)-, puis utilisez une biblioth�que pour effectuer toutes les copies et traductions. Dans les cas g�n�raux, ces biblioth�ques sont d�crites comme des   outils de mappage objet-relationnel (ORM). 
## JPA
En Java, l'API Java Persistence (JPA) d�crit comment ces biblioth�ques peuvent �tre impl�ment�es et comment vous �cririez votre code pour qu'elles soient facilement utilis�es par elles.

## Expression Lambda

Les expressions Lambda Une expression lambda est une fonction anonyme : sa d�finition se fait sans d�claration explicite du type de retour, ni de
modificateurs d'acc�s ni de nom. C'est un raccourci syntaxique qui permet de d�finir une m�thode directement � l'endroit o� elle est utilis�e.

## Interface fonctionnel

Functional Interface: Implementation utilisant une expression Lambda
C'est un interface qui contient une unique fonction abstraite cependant on peut ecrire d'autres fonctions avec son implementation en ajoutant dans 
la signature de ces methodes le mot cl� "default".

## Method references

Check this link to cover this part: [method reference-Java8](https://www.javatpoint.com/java-8-method-reference)

## Stream API

C�est une s�quence d��l�ments sur laquelle on peut effectuer un groupe d�op�rations de mani�re s�quentielle ou parall�le.
<br/><br/>
*1. Sans utilisation de Stream*<br/><br/>
`Collections.sort(sellOrderList, (o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));List<String> products = new ArrayList<>();for (Order o : sellOrderList){products.add(o.getProduct());System.out.println(o.getProduct());}`
<br/>

*2. Avec utilisation de Stream*<br/><br/>
`List<String> products2 =  orderList.stream().filter(o-> o.getType()==OrderType.SELL).sorted(Comparator.comparing(Order::getPrice)).map(Order::getProduct).collect(toList());`


## Default methods

Les m�thodes d�finies dans l'interface et marqu�es avec le mot cl� "default" sont appel�es m�thodes par d�faut. Ces m�thodes sont des m�thodes non abstraites (implement�s).

## Optional class

Optional: permet d�encapsuler un objet dont la valeur peut �tre null.
Optional: une classe finale publique et est utilis� pour traiter NullPointerException dans l'application Java

## ForEach() method,

ForEach: Une methode qui permet de parcourir les donn�es d'un tableau (array), c'est la boucle FOR.
<br/><br/>
`names.forEach(name -> { System.out.println(name);});`

## Parallel array sorting,

Une nouvelle fonctionnalit� suppl�mentaire dans la classe Array qui est utilis�e pour trier les �l�ments de tableau en parall�le<br/>
Check this link: [Parallel array sorting](https://www.javatpoint.com/java-8-parallel-array-sorting)

## Nashorn JavaScript Engine

Nashorn est un moteur JavaScript. Il est utilis� pour ex�cuter du code JavaScript de mani�re dynamique sur JVM (Java Virtual Machine). Java fournit un outil de ligne de commande jjs qui est utilis� pour ex�cuter du code JavaScript.

## Cycle de vie d'un Thread (5 �tats)
1. Etat New: avant l'appel de la methode start() et apres la creation une instance de la classe Thread.

2. Etat (Ex�cutable/Runnable): apres l'appel de la methode start, mais le planificateur de thread ne l'a pas s�lectionn� comme thread en cours d'ex�cution.

3. Etat Running: Le thread est en cours d'ex�cution si le planificateur de thread l'a s�lectionn�.

4. Etat Non-Runnable (bloqu�): Il s'agit de l'�tat dans lequel le thread est toujours actif, mais n'est actuellement pas �ligible pour s'ex�cuter.

5. Etat Terminated: Un thread est dans un �tat termin� ou mort lorsque sa m�thode run () se termine.

## Garbage Collection

Il rend la m�moire Java plus efficace car le garbage collector supprime les objets non r�f�renc�s de la m�moire du tas.<br/>
C'est une maniere de detruire les objects inutiles.

## Java Reflection

Reflection est une API qui permet d'examiner ou de modifier le comportement des m�thodes, classes, interfaces lors de l'ex�cution <br/>
La r�flexion peut �tre utilis�e pour obtenir des informations sur :

1. Classe: getClass() est utilis�e pour obtenir le nom de la classe � laquelle appartient un objet.

2. Constructeurs: getConstructors() est utilis�e pour obtenir les constructeurs publics de la classe � laquelle appartient un objet.

3. M�thodes: getMethods() est utilis�e pour obtenir les m�thodes publiques de la classe � laquelle appartient un objet.

4. Attributs: getFields() est pour obtenir le nom des attributs publiques ou prives.
<br/><br/>

Check this link to understand [Java Reflection](https://www.journaldev.com/1789/java-reflection-example-tutorial)