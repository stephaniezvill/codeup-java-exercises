import java.util.Random;

public class ServerNameGenerator {
    // Define two arrays of strings
    private static final String[] adjectives = {"fast", "dedicated", "reliable", "secure", "high-performance", "scalable", "responsive", "robust", "compact", "stable"};
    private static final String[] nouns = {"photon", "quark", "neutrino", "electron", "proton", "ion", "lepton", "boson", "fermion", "quasar"};

    // Method to get a random element from an array
    private static String getRandomElement(String[] array) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(array.length);
        return array[randomIndex];
    }

    // Main method to generate and display the server name
    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;

        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }
}
