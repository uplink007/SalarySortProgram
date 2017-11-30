import java.util.ArrayList;
public class MergeSort {

    private RandomEmp array;
    private ArrayList<Employee> tempMergArr;
    private int length;


    public  void sort(RandomEmp inputArr) {
        this.array = inputArr;
        this.length = inputArr.getAmount();
        this.tempMergArr = new ArrayList<Employee>(length);
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr.add(i,array.getRandomEmployees().get(i));
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr.get(i).getSalary()<= tempMergArr.get(j).getSalary()) {
                array.getRandomEmployees().set(k,tempMergArr.get(i));
                i++;
            } else {
                array.getRandomEmployees().set(k,tempMergArr.get(j));
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array.getRandomEmployees().set(k,tempMergArr.get(i));
            k++;
            i++;
        }

    }
}
