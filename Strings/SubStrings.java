package Strings;

public class SubStrings {
    public static void main(String[] args) {
        String sentence="My name is Tony";

        // substring(begining index, ending index) it return the -1 of ending index

        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
