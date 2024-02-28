package homework7.truecalc.view;

public class ConsoleViewFactory implements ViewFactory {
    @Override
    public View createView() {
        return new ConsoleView();
    }
}
