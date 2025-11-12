package String.CoreConcepts;

class FrequencyOfOccurenceOfSubstring {
    public static void main(String[] args) {
        String str = "He fixed the issue, logged the issue, and explained the issue during the meeting.";
        System.out.printf("Original String = %s%n", str);

        String subs = "issue";

        String[] strArrSplittedBySubs = str.split(subs);

        int countOfOccurenceOfSubs = strArrSplittedBySubs.length - 1;
        System.out.printf("Count of occurence of substring: \"%s\" within the string = %d%n", subs, countOfOccurenceOfSubs);
    }    
}
