import java.util.*;

public class Keys_And_Rooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.get(0).isEmpty()) return false;
        Set<Integer> visited = new HashSet<>(rooms.get(0));
        Set<Integer> frontier = new HashSet<>(rooms.get(0));
        while (!frontier.isEmpty()) {
            frontier = nbrs(rooms, frontier);
            frontier.removeAll(visited);
            visited.addAll(frontier);
        }
        return visited.size() + 1 == rooms.size();
    }

    public static Set<Integer> nbrs(List<List<Integer>> rooms, Set<Integer> frontier) {
        Set<Integer> nbrsSet = new HashSet<>();
        for (Integer keys : frontier) {
            for (Integer key : rooms.get(keys)) {
                if (key != 0) {
                    nbrsSet.add(key);
                }
            }
        }
        return nbrsSet;
    }
}
