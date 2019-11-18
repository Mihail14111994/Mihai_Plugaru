public class Main {
    public static void main(String[] args) {

        Sports volley = new Sports(new Volley("Z", 6));
        Sports football = new Sports(new Football("V"));

        volley.addTeam(new Volley("C", 9));
        volley.addTeam(new Volley("D", 12));
        football.addTeam(new Football("A"));
        football.addTeam(new Football("L"));


//        football.addTeam(new Volley("ERR"));    - compile time error

        volley.sort();
        football.sort();

        System.out.println(volley);
        System.out.println(football);
    }
}
