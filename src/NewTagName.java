/**
 * Created by MrMan on 14/09/2016.
 */
public class NewTagName implements State {
    @Override
    public State transition(char c) {
        if (c == '>')
            return new EndTagName();
        else if (c != '<' && c != '>' && c != '/')
            return new NewTagName();
        else
            return new Error();

    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
