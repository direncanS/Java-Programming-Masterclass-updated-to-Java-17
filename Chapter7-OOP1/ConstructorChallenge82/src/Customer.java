public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddres;

    public Customer(){
        this("Default name",1000.0,"test@text.com");
    }
    public Customer(String name,double creditLimit,String emailAddres){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddres=emailAddres;
    }
    public Customer(String name, String emailAddres){
        this(name,1000.0,emailAddres);
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddres() {
        return emailAddres;
    }
}
