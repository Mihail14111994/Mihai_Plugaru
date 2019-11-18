public class Football implements Comparable<Football> {

    private String teamName;

    private String getTeamName() {
        return teamName;
    }

    public Football(String name) {
        this.teamName = name;
    }

    @Override
    public String toString() {
        return teamName;
    }

    public int compareTo(Football team) {
        return this.teamName.compareTo(team.getTeamName());
    }
}
