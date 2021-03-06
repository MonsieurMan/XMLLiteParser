package XMLLiteParser.States.DTDStates;

import XMLLiteParser.SchemaTools.DTDParser;
import XMLLiteParser.States.State;

/**
 * Created by Mathis on 09/10/2016.
 */
public class NextChildrenPoint implements State {
    @Override
    public State transition(char c) {
        if (String.valueOf(c).matches("[a-zA-Z]") || c == '_' || c == '-'){
            DTDParser.getInstance().fillBuffer(c);
            return new ChildName();
        }else if( c == ' '){
            return new ChildrenSpace();
        }else{
            return new Error();
        }
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
