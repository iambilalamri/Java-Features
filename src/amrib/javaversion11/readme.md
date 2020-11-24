## Execution des fichiers Java avec une commande

La compilation des fichiers java se fait avec la commande "javac" dans les versions precedentes.
Maintenant Vous pouvez exécuter directement le fichier avec la commande "java" et il se compile implicitement.

## Méthodes de chaîne Java
1. **isBlank():** Cette méthode d'instance renvoie une valeur booléenne. Les chaînes vides et les chaînes avec uniquement des espaces blancs sont considérées comme vides.
2. **lignes():**  Cette méthode retourne un flux de chaînes, qui est une collection de toutes les sous-chaînes séparées par des lignes.

3. **strip():**   C'est une évolution «sensible à Unicode» de trim(). et elle permet de supprime l'espace blanc à la fois, au début et à la fin de la chaîne. il y a aussi les methodes **stripLeading()** et **stripTrailing()**
4. **repeat():**  Une méthode de répétition répète simplement la chaîne autant de fois que mentionné dans la méthode sous la forme d'un int.

## Local-Variable Syntax for Lambda Parameters

`(var s1, var s2) -> s1 + s2 //allowed`<br/>
`(var s1, s2) -> s1 + s2 //no skipping allowed`<br/>
`(var s1, String y) -> s1 + y //no mixing allowed`<br/>
`var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.`<br/>

## Reading/Writing Strings to and from the Files

1. readString()
2. writeString()

`Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");`<br/>
`System.out.println(path);`<br/>
`String s = Files.readString(path);`<br/>
`System.out.println(s); //This was posted on JD`<br/>

## Deprecate the Nashorn JavaScript Engine

To check and cover more features, here is the link: [Java Feature 11](https://www.journaldev.com/24601/java-11-features)
