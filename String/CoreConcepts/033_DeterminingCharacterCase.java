package String.CoreConcepts;

class DeterminingCharacterCase {
    public static void main(String[] args) {
        char ch = '2';
        System.out.printf("Original Character = \'%c\'%n", ch);

        if(Character.isUpperCase(ch)) {
            System.out.printf("Character: \'%c\' is an uppercase character", ch);
        } else if(Character.isLowerCase(ch)) {
            System.out.printf("Character: \'%c\' is a lowercase character", ch);
        } else {
            System.out.printf("Case of Character: \'%c\' could not be determined", ch);
        }
    }    
}
