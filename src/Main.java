import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.creteState());
        editor.setContent("b");
        history.push(editor.creteState());
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}