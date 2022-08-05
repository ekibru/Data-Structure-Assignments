package practice;
/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 3
 */
public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String eName,String pName,double sAmount){
        employeeName = eName;
        productName = pName;
        salesAmount = sAmount;
    }

    @Override
    public String toString() {
        return "Marketing: " +
                "employeeName: " + employeeName + '\'' +
                " ,productName: " + productName + '\'' +
                " ,salesAmount: " + salesAmount +"\n";
    }

    public double getSalesAmount(){
        return salesAmount;
    }
}
