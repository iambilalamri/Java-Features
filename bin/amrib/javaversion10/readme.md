Java 10 est la version la plus rapide d'une version Java.<br/><br/>
## Inférence de type de variable locale

La nouvelle facon de parcouri une liste ou un tableau (for...loop)<br/>
Le mot cle "var" vaut tous les types (int, float, double, Integer, Float, List,...) et il resemble à "any" dans typescript<br/><br/>
`var numbers = List.of(1, 2, 3, 4, 5);`<br/>
` // inferred value ArrayList<String>`<br/>
`// Index of Enhanced For Loop`<br/>
`for (var number : numbers) {`<br/>
`System.out.println(number);}`<br/>
`// Local variable declared in a loop`<br/>
`for (var i = 0; i < numbers.size(); i++) {`<br/>
`System.out.println(numbers.get(i));}`<br/>
<br/>

To check and get all informations about features of version 10, Here is this link: [Java 10 New Feature](https://www.journaldev.com/20395/java-10-features)