## REPL (JShell)

«jshell»: signifie Java Shell et également connu sous le nom de REPL (Read Evaluate Print Loop). Il est utilisé pour exécuter et tester très facilement toutes les constructions Java telles que classe, interface, énumération, objet, instructions, etc.

## Methode pour LIST, MAP, SET

Java 9 a surchargé un ensemble de méthodes permettant de gérer des listes, maps, set, ...<br/>

`List immutableList = List.of();`<br/>
`List immutableList = List.of("one","two","three");`<br/>
`Map emptyImmutableMap = Map.of()` <br/>
`Map<String, String> map1 = new HashMap();`<br/>
`map1.put("name", "John Verssa");`<br/>
`System.out.print(map1);`<br/>

Check the class **JavaVersion9.java**

## Private methods in Interfaces
Dans Java 8, nous pouvons fournir une implémentation de méthode dans les interfaces à l'aide des méthodes par défaut et statiques. Cependant, nous ne pouvons pas créer de méthodes privées dans les interfaces.

Java 9 autorise à creer des méthodes privées dans les interfaces. À partir de Java SE 9, nous pouvons également écrire des méthodes statiques privées et privées dans une interface en utilisant le mot-clé «private». 
## Optional Class Improvements

Ajout de la methode Stream dans la classe Optional<br/><br/>
`Stream<Optional> emp = getEmployee(id);`<br/>
`Stream empStream = emp.flatMap(Optional::stream);`

## Stream API Improvements

Ajout d'un ensemble des methodes (ex. takeWhile, dropWhile)<br/><br/>
`Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> i < 5 )`
       `.forEach(System.out::println);`

