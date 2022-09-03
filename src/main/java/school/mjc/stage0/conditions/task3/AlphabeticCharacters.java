package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int code=character;
        if((code>=65 && code<=90) || (code>=97 && code<=122)){
            if (character=='A' || character=='E' || character=='I'
            || character=='O' || character=='U' || character=='Y' || character=='a' || character=='e' || character=='i'
                    || character=='o' || character=='u' || character=='y')
                System.out.println("Vowel");
            else System.out.println("Consonant");
        }else System.out.println("wrong alphabet!");
    }
}
