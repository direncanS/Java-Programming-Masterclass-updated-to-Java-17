public class Main {
    public static void main(String[] args) {
         Customer customer1 = new Customer("Direncan",1000,"direncansahin@gmail.com");
         Customer customer2 = new Customer();
         Customer customer3 = new Customer("Zübeyr", "zübeyrsahin@gmail.com");

         System.out.println("Name: " +customer1.getName() + " Credit limit: " + customer1.getCreditLimit()+ " Email Adress: " + customer1.getEmailAddres());
         System.out.println("Name: " +customer2.getName() + " Credit limit: " + customer2.getCreditLimit()+ " Email Adress: " + customer2.getEmailAddres());
         System.out.println("Name: " +customer3.getName() + " Credit limit: " + customer3.getCreditLimit()+ " Email Adress: " + customer3.getEmailAddres());



    }
}