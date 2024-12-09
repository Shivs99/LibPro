package for_eachloopPrograms;

import java.util.LinkedList;

public class BrowserHistory 
{
    LinkedList<String> history = new LinkedList<String>();
    int current = -1;

    public void visit(String url) {
        while (history.size() > current + 1) {
            history.removeLast(); // Clear forward history
        }
        history.add(url);
        current++;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current > 0) {
            current--;
            System.out.println("Back to: " + history.get(current));
        } else {
            System.out.println("No more history!");
        }
    }

    public void forward() {
        if (current < history.size() - 1) {
            current++;
            System.out.println("Forward to: " + history.get(current));
        } else {
            System.out.println("No more forward pages!");
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visit("google.com");
        bh.visit("stackoverflow.com");
        bh.back();
        bh.visit("github.com");
        bh.back();
        bh.forward();
    }
}

