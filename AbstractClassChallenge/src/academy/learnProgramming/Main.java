package academy.learnProgramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {

            tree.addItem(new Node(s));

        }

        tree.traverse(tree.getRoot());
    }
}
