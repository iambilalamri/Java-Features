## Sealed Classes and interface (Preview)

1. Pour sceller une interface, nous pouvons appliquer le modificateur "sealed" � sa d�claration. La clause permit sp�cifie ensuite les classes autoris�es � impl�menter l'interface scell�e<br/><br/>
`public sealed interface Service permits Car, Truck {`<br/> 
`int getMaxServiceIntervalInMonths();`<br/>
`default int getMaxDistanceBetweenServicesInKilometers() {`<br/>
`return 100000;}}`<br/><br/>
 
2. Nous pouvons scealer les classes en appliquant le m�me modificateur "sealed" . La clause "permit" doit �tre d�finie apr�s toute clause "extend" ou "implements":<br/><br/>
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
Les enregistrements peuvent �galement �tre d�finis dans des m�thodes pour stocker des valeurs interm�diaires. Contrairement aux classes locales, un enregistrement local est implicitement statique<br/><br/>

`List<Merchant> findTopMerchants(List<Merchant> merchants, int month) {`<br/>
`// Local record`<br/>
`record MerchantSales(Merchant merchant, double sales) {}`<br/>
`return merchants.stream().map(merchant -> new MerchantSales(merchant, computeSales(merchant, month)))`<br/>
`.sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales())).map(MerchantSales::merchant).collect(toList());}`<br/>
