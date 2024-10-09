import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // generate 10 random numbers between 1 and 20
    public ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1); 
        }
        return rolls;
    }

    // generate random letter 
    public char getRandomLetter() {
        Random rand = new Random();
        char[] alphabet={'a','b','c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        return alphabet[rand.nextInt(26)];  
    }

    //generate a random password(8 characters)
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());  
        }
        return password.toString();
    }

    // generate array of passwords
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwords = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }

    // Ninja Bonus
    public void shuffleArray(ArrayList<Integer> array) {
        Random rand = new Random();
        for (int i = 0; i < array.size(); i++) {
            int randomIndex = rand.nextInt(array.size());
            int temp = array.get(i);
            array.set(i, array.get(randomIndex));
            array.set(randomIndex, temp);
        }
    }
}
