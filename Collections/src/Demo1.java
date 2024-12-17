import java.util.*;

public class Demo1 {
    public static void main(String[] args) throws Exception {

        List<Integer> values = new ArrayList<Integer>();

        values.add(10);
        values.add(20);
        values.add(35);
        values.add(15);
        values.add(10);

        Iterator itr = values.iterator();

        while (itr.hasNext()) {

            if (values.equals(Integer.valueOf(15)))
                itr.remove();

        }
        System.out.println(values);
        // for (int i = 0; i < values.size(); i++) {
        // System.out.println(values);
        // }

    }
}
