## Switch Expressions

1. Les Switch Expressions sortent de preview et deviennent une fonctionnalit� standard !
2. Le nouveau mot cl� yield a donc �t� valid�.
3. Exemple du code: <br/><br/>
`String result = switch (day) {`
            `case "M", "W", "F" -> "MWF";`
            `case "T", "TH", "S" -> "TTS";`
            `default -> {`
                `if(day.isEmpty())`
                    `yield "Please insert a valid day.";`
                `else`
                    `yield "Looks like a Sunday.";}};`
`System.out.println(result);`

## Helpful NullPointerExceptions
Java 14 a introduit une nouvelle fonctionnalit� JVM qui donne de meilleures informations avec une pile plus descriptive, un exemple indiqu� ci-dessous:<br/>
`Exception in thread "main" java.lang.NullPointerException: `<br/>
`Cannot invoke "Blog.getAuthor()" because the return value of "Journaldev.getBlog()" is null`<br/>
 `   at NullPointerExample.main(NullPointerExample.java:4)`<br/>
 
## Records
1. Un type Java (comme class et enum), son but est d��tre un conteneur de donn�s. Les Records sont implicitement final et ne peuvent �tre abstrait.<br/>
2. Les Records fournissent une impl�mentation par d�faut pour du code boilerplate que vous auriez sinon g�n�r� via votre IDE.<br/>
3. Tous les Records ont des accesseurs publique (mais les champs sont priv�) et une m�thode toString.
4. Tous les Records ont les m�thodes equals et hashCode dont les impl�mentations sont bas� sur le type du Record et son �tat (ses champs donc)
5. C�est une classe sp�cialis�e (comme les enum)
6. Tous ses param�tres sont private final. Par cons�quent, les donn�es ne sont pas modifiables. (1)
7. Les getters sont initialis�s par d�faut.
8. Elle ne peut pas contenir des attributs de classes.
9. Elle peut �tre initialis�e sans corps (exemple ci-dessous).
10. Elle ne peut pas b�n�ficier de l�h�ritage d�une autre classe.
11. Elle peut impl�menter des interfaces.
12. Tous le code dans le fichier person.js vaut la ligne au-dessous:

`public record(Integer id, String name, Date dateBirth, String email, String phone){`<br/>
`public String fullDatas() {`       
`return name + ", " + email + " " + phone;   }}`

## Text Blocks (Second Preview)
la possibilit� d��crire des String Literals sur plusieurs lignes est toujours en preview avec l�ajout de deux nouvelles escape sequence : '\' et '\s'
1. `'\'` : Il permet de mettre sur plusieurs lignes une String qui doit en �tre sur une seule (comme en shell).
2. `'\s'`: Il permet d�ajouter un espace (\u0020)
3. Plus d�information dans la JEP : https://openjdk.java.net/jeps/368
