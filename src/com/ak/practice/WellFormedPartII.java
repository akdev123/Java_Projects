package com.ak.practice;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class WellFormedPartII {

    private static Map<Character, Character> map = new HashMap<>();
    private static Set<Character> brackets = new HashSet<>();

    static {
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            brackets.add(entry.getKey());
            brackets.add(entry.getValue());
        }
    }

    public static void main(String[] args) {
        for (String exp : new String[] { "A3{DJE(DG[FF]K)WA65}", "BBB[BM98{WJHG]333}", "CBY(DDD(WKLP)BEHOP" })
            System.out.printf("%b\t%s%n", validate(exp), exp);
    }

    private static boolean validate(String exp) {
        boolean valid = true;
        Deque<Character> deque = new LinkedList<Character>();
        for (char c : exp.toCharArray())
            if (bracket(c))
                deque.add(c);
        char l, r;
        while (!deque.isEmpty()) {
            l = deque.removeFirst();
            try {
                r = deque.removeLast();
            } catch (NoSuchElementException e) {
                valid = !valid;
                break;
            }
            if (valid) {
                if (r != map.get(l)) {
                    valid = !valid;
                    break;
                }
            }
        }
        return valid;
    }

    private static boolean bracket(char c) {
        return brackets.contains(c);
    }
}