package j10_StringManipılantınıos;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        string içerisinde istenen  strimngini varlığını kontrol eder boolen return eder..
        */

        String s1="Enise Hanım başarılı bir qa tester team lead";
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));


        String s2="Qa";
        System.out.println(s1.contains(s2));
        System.out.println(s2.contains(s1));
//task-> girilen bir cümlede aranan  kelimenin varlığını  kontrol eden bir code creat ediniz->ternary kullanınız












    }
}
