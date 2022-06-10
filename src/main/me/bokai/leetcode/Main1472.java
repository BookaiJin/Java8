package me.bokai.leetcode;

import java.util.Stack;

/**
 * @author bokai
 * @version 11.0
 * Created by bokai on 2022/6/10
 */
public class Main1472 {

    public static void main(String... args){

    }

}

class BrowserHistory {

    private final Stack<String> backStack = new Stack<>();
    private final Stack<String> forwardStack = new Stack<>();
    private String home;

    public BrowserHistory(String homepage) {
        this.home = homepage;
    }

    public void visit(String url) {
        backStack.push(home);
        home = url;
        forwardStack.clear();
    }

    public String back(int steps) {
        if (backStack.isEmpty()) {
            return home;
        }
        while (steps-- > 0) {
            if (!backStack.isEmpty()) {
                forwardStack.push(home);
                home = backStack.pop();
            }
        }
        return home;
    }

    public String forward(int steps) {
        if (forwardStack.isEmpty()) {
            return home;
        }
        while (steps-- > 0) {
            if (!forwardStack.isEmpty()) {
                backStack.push(home);
                home = forwardStack.pop();
            }
        }
        return home;
    }
}
