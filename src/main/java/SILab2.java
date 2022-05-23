import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) { // 5
        if (list.size() <= 0) { // 6
            throw new IllegalArgumentException("List length should be greater than 0"); // 7
        }
        int n = list.size(); // 9
        int rootOfN = (int) Math.sqrt(n); // 10
        if (rootOfN * rootOfN != n) { // 11
            throw new IllegalArgumentException("List length should be a perfect square"); // 12
        }
        List<String> numMines = new ArrayList<>(); // 14
        for (int i = 0; i < n; i++) { // 15
            if (!list.get(i).equals("#")) { // 16
                int num = 0; // 17
                if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) { // 18
                    if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) { // 19
                        num += 2; // 20
                    } else {
                        num += 1; // 22
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")) { // 25
                    num++; // 26
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")) { // 28
                    num++; // 29
                }
                numMines.add(String.valueOf(num)); // 31
            } else {
                numMines.add(list.get(i)); // 33
            }
        }
        return numMines; // 36
    } // 37
}