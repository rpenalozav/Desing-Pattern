import memento.Editor;
import memento.History;
import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;

import java.util.concurrent.CancellationException;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
