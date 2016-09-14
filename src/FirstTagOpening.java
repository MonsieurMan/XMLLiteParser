/**
 * Created by Antoine on 14/09/2016.
 */
public class FirstTagOpening implements State {
    @Override
    public State transition(char c) {
        if (c != '<' && c != '>' && c != '/')
            return new NewTagName();
        else
            return new Error();
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}