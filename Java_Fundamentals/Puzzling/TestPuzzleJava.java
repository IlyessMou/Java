import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test getTenRolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Random Rolls: " + randomRolls);

        // Test getRandomLetter
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        // Test generatePassword 
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);

        // Test getNewPasswordSet 
        ArrayList<String> passwords = generator.getNewPasswordSet(5);
        System.out.println("Passwords: " + passwords);

        // Test Ninja Bonus
        generator.shuffleArray(randomRolls);
        System.out.println("Shuffled Rolls: " + randomRolls);
    }
}
