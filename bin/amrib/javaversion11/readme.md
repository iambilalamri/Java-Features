## Execution des fichiers Java avec une commande

La compilation des fichiers java se fait avec la commande "javac" dans les versions precedentes.
Maintenant Vous pouvez ex�cuter directement le fichier avec la commande "java" et il se compile implicitement.

## M�thodes de cha�ne Java
1. **isBlank():** Cette m�thode d'instance renvoie une valeur bool�enne. Les cha�nes vides et les cha�nes avec uniquement des espaces blancs sont consid�r�es comme vides.
2. **lignes():**  Cette m�thode retourne un flux de cha�nes, qui est une collection de toutes les sous-cha�nes s�par�es par des lignes.

3. **strip():**   C'est une �volution �sensible � Unicode� de trim(). et elle permet de supprime l'espace blanc � la fois, au d�but et � la fin de la cha�ne. il y a aussi les methodes **stripLeading()** et **stripTrailing()**
4. **repeat():**  Une m�thode de r�p�tition r�p�te simplement la cha�ne autant de fois que mentionn� dans la m�thode sous la forme d'un int.

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
