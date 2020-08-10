package com.Illmf;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.stream.*;

import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;
public class Solution {
    public static int[] solve(String[] arr) {
        String alphabet = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        char[] alph = alphabet.toCharArray();
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char[] arrMorph = arr[i].toUpperCase().toCharArray();
            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = 0; k < alphabet.length(); k++) {
                    if ((arrMorph[j] == alph[k]) && (j == k)) {
                        numbers[i] = numbers[i] + 1;
                    }
                }
            }
        }
        return numbers;
    }

    String method() {
        String alphabet = ("ANACDEFGHIJKLMNOPQRSTUVWXYZ");
        char[] alphabetw = alphabet.toCharArray();
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.println(Integer.valueOf(alphabetw[i]));
        }
        return "koniec";
    }

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int i :
                array) {
            sum = sum + (int) Math.pow(i, power);
        }
        return sum;
    }
    //); Stream.of(array).mapToInt(ints -> (int)Math.pow(ints,power).toArray(

    public static int[] solve2(String[] arr) {

        return of(arr).mapToInt(s -> (int) range(0, s.length()).filter(i -> i == s.toUpperCase().charAt(i) - 65).count()).toArray();
    }

    public static int[] solve(int a, int b) {
        for (int i = 0; i < 4; i++) {
            if ((a == 0) || (b == 0)) {
                return new int[]{a, b};
            }
            ;
            if ((i == 1) && (a >= 2 * b)) {
                a = a - (2 * b);
                i--;
            }
            if ((i == 2) && (b >= 2 * a)) {
                b = b - (2 * a);
                i = -2;
            }
        }
        System.out.println(a);
        System.out.println(b);
        return new int[]{a, b};
    }

    //    public static int[] minMax(int[] arr) {
//        // Your awesome code here
//        return Stream.of(arr).max(i->Comparator.comparing(Integer.valueOf(arr[i]))).get();
//    }


//
//        }
//        Integer.valueOf(sett.)
//
     public static int[] minMax(int[] arr) {

            Set<Integer> sett=new TreeSet<Integer>();
            for (int i :
                    arr) {
                sett.add(i);
                ;
            }
            List<Integer> list=new ArrayList<Integer>();
            for (int i:
                    sett) {
            list.add(i);
            }

        return new int[]{list.get(0),list.get(list.size()-1)};
    }


    public static String getMiddle(String word){
        return (word.length()%2!=0?
        word.substring((word.length()/2),(word.length()/2)+1):
        word.substring((word.length()/2)-1,(word.length()/2+1)));
    }

    public static String disemvowel(String str) {
        return str
                .replaceAll("[aoieAEOIE]","");


    }
    public String metheo(){
        String jaca="blabla";

        List<String> names=new ArrayList<String>();
        names.add("hunu");
        names.add("ci");
        names.add("q");
        names.add("opad");
        names.add("j^aca");
        names.add("placa");
        names.add("pompkamateraca");


        Stream<String> namesStream =names.stream();
     //   (s, t1) -> t1.length()-s.length()

        return  namesStream.sorted().collect(Collectors.toList()).toString();
//[q, ci, hunu, opad, jaca, placa, pompkamateraca]
    }
    public static String maskify(String str) {
        int minLenght=str.length();
        String threeCharFromEnd=str.substring(str.length()-(minLenght>4?4:minLenght));
        String newStr="";
        str.substring(0,str.length()-(minLenght>4?4:minLenght));

        for (int i = 0; i < str.length(); i++) {
if (!(str.charAt(i)=='['||str.charAt(i)==']'))
            newStr=newStr.concat("#");
    else newStr=newStr.concat(String.valueOf(str.charAt(i)));


//        if ((!(str.charAt(i)=='['||str.charAt(i)==']'))||
//                (i>0)&&(((str.charAt(i)=='[')==(str.charAt(i-1)=='['))||((str.charAt(i)==']')==(str.charAt(i-1)==']')))) {
//
//
//        }else newStr=newStr.concat(String.valueOf(str.charAt(i)));
        }

   return newStr.concat(threeCharFromEnd);

    //    return .replaceAll("[\\.+]","#").concat(threeCharFromEnd);
}
}
//    i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);           [ ]
//    ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
//    iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].


//import java.util.regex.*;
//public class Troll {
//    public static String disemvowel(String str) {
//        // Code away...
//        Pattern pat = Pattern.compile("[aeiouAEIOU]");
//        Matcher mat = pat.matcher(str);
//        return mat.replaceAll("");
//    }
//   public static List<String> VOWELS = List.of("a", "e", "o", "u", "i");
//
//    public static String disemvowel(String str) {
//        return IntStream.range(0, str.length())
//                .mapToObj(i -> str.substring(i, i + 1))
//                .filter(s -> !VOWELS.contains(s.toLowerCase()))
//                .reduce("", (a, b) -> a + b);
//    }
//}
////public class Troll {
//    public static String disemvowel(String str) {
//        return Arrays.stream(str.split(" "))
//                .map(i -> i.replaceAll("[aeiouAEIOU]", ""))
//                .collect(Collectors.joining(" "));
//    }
//}
//
//
//public static String disemvowel(String origin) {
//    return origin.chars()
//            .mapToObj(value -> (char)value)
//            .filter(ch -> !java.util.Arrays.asList('A','E','O','I','U')
//                    .contains(Character.toUpperCase(ch)))
//            .map(String::valueOf)
//            .collect(java.util.stream.Collectors.joining());
//}