package Day3;

import java.io.*;
import java.util.*;

public class QueueAndStacks {

    Stack<Character> st = new Stack<>();
    Queue<Character> q = new LinkedList<>();

    public void pushCharacter(Character ch){
        st.push(ch);
    }

    public void enqueueCharacter(Character ch){
        q.offer(ch);
    }

    char popCharacter(){
        return st.pop();
    }

    char dequeueCharacter(){
        return q.poll();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueueAndStacks p = new QueueAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}