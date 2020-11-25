## Sealed Classes and interface (Preview)

1. Pour sceller une interface, nous pouvons appliquer le modificateur "sealed" à sa déclaration. La clause permit spécifie ensuite les classes autorisées à implémenter l'interface scellée<br/><br/>
`public sealed interface Service permits Car, Truck {`<br/> 
`int getMaxServiceIntervalInMonths();`<br/>
`default int getMaxDistanceBetweenServicesInKilometers() {`<br/>
`return 100000;}}`<br/><br/>
 
2. Nous pouvons scealer les classes en appliquant le même modificateur "sealed" . La clause "permit" doit être définie après toute clause "extend" ou "implements":<br/><br/>
`public abstract sealed class Vehicle permits Car, Truck {`<br/>
`protected final String registrationNumber;`<br/>
`public Vehicle(String registrationNumber) {`<br/>
`this.registrationNumber = registrationNumber;}`<br/>
`public String getRegistrationNumber() {return registrationNumber;}}`<br/>
 

## Records with Sealed Types
`sealed interface Car permits BMW, Audi { ... }`<br/>
`record BMW(int price) implements Car { ... }`<br/>
`record Audi(int price, String model) implements Car { ... }`<br/>

## Local Records
Les enregistrements peuvent également être définis dans des méthodes pour stocker des valeurs intermédiaires. Contrairement aux classes locales, un enregistrement local est implicitement statique<br/><br/>

`List<Merchant> findTopMerchants(List<Merchant> merchants, int month) {`<br/>
`// Local record`<br/>
`record MerchantSales(Merchant merchant, double sales) {}`<br/>
`return merchants.stream().map(merchant -> new MerchantSales(merchant, computeSales(merchant, month)))`<br/>
`.sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales())).map(MerchantSales::merchant).collect(toList());}`<br/>
