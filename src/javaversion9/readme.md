## REPL (JShell)

�jshell�: signifie Java Shell et �galement connu sous le nom de REPL (Read Evaluate Print Loop). Il est utilis� pour ex�cuter et tester tr�s facilement toutes les constructions Java telles que classe, interface, �num�ration, objet, instructions, etc.

## Methode pour LIST, MAP, SET

Java 9 a surcharg� un ensemble de m�thodes permettant de g�rer des listes, maps, set, ...<br/>

`List immutableList = List.of();`<br/>
`List immutableList = List.of("one","two","three");`<br/>
`Map emptyImmutableMap = Map.of()` <br/>
`Map<String, String> map1 = new HashMap();`<br/>
`map1.put("name", "John Verssa");`<br/>
`System.out.print(map1);`<br/>

Check the class **JavaVersion9.java**

## Private methods in Interfaces
Dans Java 8, nous pouvons fournir une impl�mentation de m�thode dans les interfaces � l'aide des m�thodes par d�faut et statiques. Cependant, nous ne pouvons pas cr�er de m�thodes priv�es dans les interfaces.

Java 9 autorise � creer des m�thodes priv�es dans les interfaces. � partir de Java SE 9, nous pouvons �galement �crire des m�thodes statiques priv�es et priv�es dans une interface en utilisant le mot-cl� �private�. 
## Optional Class Improvements

Ajout de la methode Stream dans la classe Optional<br/><br/>
`Stream<Optional> emp = getEmployee(id);`<br/>
`Stream empStream = emp.flatMap(Optional::stream);`

## Stream API Improvements

Ajout d'un ensemble des methodes (ex. takeWhile, dropWhile)<br/><br/>
`Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> i < 5 )`
       `.forEach(System.out::println);`

