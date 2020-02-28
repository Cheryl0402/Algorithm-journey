package ArrayandString;
import java.util.ArrayList;
import java.util.List;

class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> List = new ArrayList<List<Integer>>(numRows);
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        int [] array = {1,2,3};
        System.out.println(myList);
        return List;
    }
}
