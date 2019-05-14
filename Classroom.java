public class Classroom {
    public static void main(String[] args) {
        Wilder xavier = new Wilder("Xavier", true);
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);

        System.out.println(xavier.whoAmI());
        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    }
}