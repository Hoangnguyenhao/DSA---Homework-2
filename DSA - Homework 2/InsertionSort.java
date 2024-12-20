import java.util.List;

public class InsertionSort {
    public static void sort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i - 1;

            // Move elements that are greater than current to one position ahead
            while (j >= 0 && students.get(j).getGrade() > current.getGrade()) {
                students.set(j + 1, students.get(j));
                j--;
            }

            students.set(j + 1, current);
        }
    }
}
