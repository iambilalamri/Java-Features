## Compact Number Formatting
Check the code explaining How to use the object "NumberFormat" in the file .java
## Java Strings New Methods

Les methodes ont été introduits a Java 12:

1. `indent(int n)`
2. `transform(function f)`
3. `Optional describeConstable()`

## Teeing Collectors
`double mean = Stream.of(1, 2, 3, 4, 5)`<br/>
`.collect(Collectors.teeing(summingDouble(i -> i), counting(), (sum, n) -> sum / n));`<br/>
`System.out.println(mean);`<br/>
## Pattern Matching for instanceof
1. L'ancienne façon d'utiliser instanceof:<br/> 
`if (obj instanceof String) {`<br/> 
`String s = (String) obj;`<br/> 
`// use s in your code from here }`<br/> 

2. La nouveau façon<br/> 
`if (obj instanceof String s) {`<br/> 
`// can use s directly here }`
<br/><br/>