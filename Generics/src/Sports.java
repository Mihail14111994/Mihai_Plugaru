import java.util.*;

public class Sports<T extends Comparable<T>> {

    private List<T> teamsList = new ArrayList<>();

    public Sports(T team) {
        addTeam(team);
    }

    public void addTeam(T team) {
        this.teamsList.add(team);
    }

    public void sort() {
        Collections.sort(teamsList);
    }

    @Override
    public String toString() {
        return Arrays.toString(teamsList.toArray());
    }
}
