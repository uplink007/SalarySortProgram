public class App {
    public static void main(String[] args) {
        RandomEmp myRandEmployees = new RandomEmp(10000);
        System.out.println(myRandEmployees);
        myRandEmployees.SortEmp();
        System.out.println(myRandEmployees);

    }
}
