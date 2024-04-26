package trees;

import java.util.ArrayList;

public class TreeException extends RuntimeException{
    public TreeException(String s)
    {
        super(s);
        // Pass s into a superclass ctor.
    }
}