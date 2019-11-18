public class Volley implements Comparable<Volley> {

    private String teamName;
    private int teamMembers;

    public Volley(String name, int members) {
        this.teamName = name;
        this.teamMembers = members;
    }

    private String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return teamName + " " + teamMembers;
    }

    public int compareTo(Volley team) {
        return this.teamName.compareTo(team.getTeamName());
    }
}
