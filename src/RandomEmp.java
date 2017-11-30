import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomEmp {
    private int amount;

    private ArrayList<Employee> randomEmployee;

    public RandomEmp(int amount) {
        this.amount = amount;
        this.randomEmployee = new ArrayList<Employee>();
        for (int i = 0; i < this.amount; i++)
        {
            Employee temp= new Employee();
            randomEmployee.add(temp);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomEmp randomEmp = (RandomEmp) o;
        if (amount != randomEmp.amount) return false;
        return randomEmployee != null ? randomEmployee.equals(randomEmp.randomEmployee) : randomEmp.randomEmployee == null;
    }
    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (randomEmployee != null ? randomEmployee.hashCode() : 0);
        return result;
    }
    public RandomEmp(RandomEmp copyEmp) {
        this.amount=copyEmp.getAmount();
        this.randomEmployee = new ArrayList<Employee>();
        for (int i = 0; i < copyEmp.getAmount(); i++) {
            this.randomEmployee.add(new Employee(copyEmp.getRandomEmployees().get(i)));
        }
    }
    public void SortEmp(){

        final long start = System.nanoTime();
        for (int j = 0; j < this.amount; j++) {//bauble sort
            for (int i = 1; i < this.amount; i++) {
                if (this.randomEmployee.get(i).getSalary() < this.randomEmployee.get(i - 1).getSalary()) {
                    Collections.swap(this.randomEmployee, i, i - 1);
                }
            }
        }
//        MergeSort sort=new MergeSort();//merge sort
//        sort.sort(this);
        final long end = System.nanoTime();
        System.out.println("Sort took: " + ((end - start) / 1000000) + "ms\n\n");
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.amount; i++) {
            if(i!=0){
                result+="difference : "+(this.randomEmployee.get(i).getSalary()-this.randomEmployee.get(0).getSalary())+" ";
            }
            result+=""+i+" - "+this.randomEmployee.get(i).toString();
        }
        return result+"\n";
    }
    public int getAmount() {
        return amount;
    }
    public List<Employee> getRandomEmployees() {
        return randomEmployee;
    }

    public Object[][] creatViewObject(){
        Object[][] result = new Object[this.amount][7];
        for (int i = 0; i < this.amount; i++) {
            for (int j = 0; j < 7; j++) {
                result[i][j]=this.randomEmployee.get(i).getIndex(j);
            }
        }
        return result;

    }

}
