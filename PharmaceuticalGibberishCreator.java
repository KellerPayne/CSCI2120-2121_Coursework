import java.util.Random;
/**
    @auth Christopher M. Summa, Ph.D.
    @version 1.0

    Main method to run the PharmaceuticalGibberishCreator
*/
public class PharmaceuticalGibberishCreator {
    public static void main(String[] args) {
    
    // 1 - create a string containing all the consonants
        String consonants = "BCDFGHJKLMNPQRSTVWXZ";

    // 2 - create a string continaing all the vowels
        String vowels = "AEIOUY";

    // 3 and 4 - use these string to create arrays of characters
        char[] consonantArray = consonants.toCharArray();
        char[] vowelArray = vowels.toCharArray();
        String[] compoundConsonantArray = {"NG", "MN", "LM", "LL", "CH", "CK", "LK", "NK", "PH", "PT"};
        String[] diphthongsArray = {"OI", "OY", "OW", "OU", "EI", "EY", "EU", "EW", "AI", "AY", "EE", "EA", "UE"};
    // 5 - create an empty string builder
        StringBuilder name = new StringBuilder();

    // 6 - create a random number generator
        Random rand = new Random();

    // 7 - based on the consonant/vowel pattern you want, use the random number generator
    //     to get an integer in the range 0 -> array.length - 1 inclusive to randomly pick
    //     letters, then tack them onto the end of the StringBuilder object.

    //     hint:       int indexIntoConsonants = rand.nextInt(consonants.length);
    //                 name.append(consonants[indexIntoConsonants]);

        for(int i = 0; i < 2; i++){
            int indexIntoConsonantArray = rand.nextInt(consonantArray.length);
            int indexIntoVowelArray = rand.nextInt(vowelArray.length);
            int indexIntoCompoundConsonantArray = rand.nextInt(compoundConsonantArray.length);
            int indexIntoDiphthongArray = rand.nextInt(diphthongsArray.length);

            name.append(consonantArray[indexIntoConsonantArray]);
            name.append(vowelArray[indexIntoVowelArray]);
            name.append(compoundConsonantArray[indexIntoCompoundConsonantArray]);
            name.append(diphthongsArray[indexIntoDiphthongArray]);
        }
    // 8 - print out your fancy new drug name!
        System.out.println(name);
    } // end main

} // end class
