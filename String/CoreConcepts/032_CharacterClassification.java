package String.CoreConcepts;

class CharacterClassification {
    public static void main(String[] args) {
        char ch = 'f';
        System.out.printf("Original Character = %c%n", ch);

        boolean chIsLetter = Character.isLetter(ch);
        boolean chIsDigit = Character.isDigit(ch);
        boolean chIsWhitespace = Character.isWhitespace(ch);

        if(chIsLetter) {
            System.out.printf("Character: %c is a letter.%n", ch);
        } else if(chIsDigit) {
            System.out.printf("Character: %c is a digit.%n", ch);
        } else if(chIsWhitespace) {
            System.out.printf("Character: %c is a whitespace.%n", ch);
        } else {
            System.out.printf("Character: %c is a special character.%n", ch);
        }
    }
}
