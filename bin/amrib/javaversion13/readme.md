## New Methods in String Class for Text Blocks
Il existe trois nouvelles m�thodes dans la classe String, associ�es � la fonctionnalit� de blocs de texte.

1. `format�` (Object� args): c'est similaire � la m�thode String format (). Il est ajout� pour prendre en charge la mise en forme avec les blocs de texte.
2. `stripIndent()`: utilis� pour supprimer les caract�res d'espacement occasionnels du d�but et de la fin de chaque ligne du bloc de texte. Cette m�thode est utilis�e par les blocs de texte et pr�serve l'indentation relative du contenu.
3. `translateEscapes()`: renvoie une cha�ne dont la valeur est cette cha�ne, avec des s�quences d'�chappement traduites comme si dans une cha�ne litt�rale.

## Blocs de texte - JEP 355
- CODE <br/><br/>
<img src="./textBlock.PNG" alt="drawing" width="600" height="200"/>

<br/><br/>

-  OUTPUT <br/><br/>
<img src="./output.PNG" alt="drawing" width="600" height="200"/>
<br/><br/>


## Switch Expressions Enhancements 

1. �break� a �t� remplac� par �yield� pour renvoyer une valeur de l'instruction case.<br/>
2. Utiliser multiple valeur affectes a "case" en une seule fois.

`int x = switch (choice) {`<br/>
		`case 1, 2, 3:`<br/>
			`yield choice;`<br/>
		`default:`<br/>
			`yield -1;`<br/>
		`};`<br/><br/>

Check More in this link: [Features of Java 13](https://www.journaldev.com/33204/java-13-features)
`